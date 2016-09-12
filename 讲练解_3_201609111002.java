import java.util.Arrays;
import java.util.Scanner;

/*
 * 2、用户输入班级的人数，然后依次输入每个同学的成绩
 *   输入完毕后，如果及格率没有达到60%，就为每一个没有及格的成绩+2分，知道及格率达到60%以上
 */
public class 讲练解_3_201609111002 {
	public static void main(String[] args){
		int[] arr = {98,99,54,59};//readyData();
		System.out.println("数组的元素是"+Arrays.toString(arr));
		//得到本班的及格率
		double rate = getRate(arr);
		
		System.out.println("及格率是"+rate*100+"%");
		
		while(true){
			if(rate < 0.6){
				for(int i=0;i<arr.length;i++){
					if(arr[i] < 60){
						arr[i] = arr[i] + 2;
					}
				}
				rate = getRate(arr); //重新计算及格率
			}else{
				break;
			}
		}
	}
	
	//计算及格率
	public static double getRate(int[] arr){
		double count = 0; //定义一个变量，记录及格人数
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < 60){
				count++;
			}
		}
		
		//及格率
		double rate = count/arr.length;
		
		return rate;
	}
	
	//准备数据
	public static int[] readyData(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入班级的人数");
		int count = scanner.nextInt();
		
		//创建一个数组对象
		int[] arr = new int[count];
		
		//录入学生的成绩
		for(int i=0;i<count;i++){
			System.out.println("请输入第"+(i+1)+"位同学的成绩");
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
}
