import java.util.Arrays;

/*
 * 3、现有如下一个数组，int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5},
 *   要求清除数组中为0的元素，然后存储非零的数据到一个新的数组中。而且要求新的数组不能浪费长度
 */

public class 讲练解_1_201609101742 {
	public static void main(String[] args){
		int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		
		int[] newArr = clearZero(oldArr);
		System.out.println("新的数组："+Arrays.toString(newArr));
	}
	
	public static int[] clearZero(int[] oldArr){
		//先统计0的个数
		int count = 0;
		for(int i = 0; i < oldArr.length - 1; i++){
			if(oldArr[i] == 0){
				count++;
			}
		}
		System.out.println("0的个数是："+count);
		
		//创建的数组
		int[] newArr = new int[oldArr.length - count];
		
		//新数组使用的索引值
		int index = 0;
		//遍历旧的数组，把非零的数据存储到新的数组中
		for(int i = 0; i<oldArr.length;i++){
			if(oldArr[i] != 0){
				newArr[index++] = oldArr[i];
			}
		}
		return newArr;
	}
}
