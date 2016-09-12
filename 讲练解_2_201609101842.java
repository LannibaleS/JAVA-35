import java.util.Arrays;

/*
 * 4、清楚重复元素。int[] arr = {1,4,9,4,1,1,7};
 *   把非重复元素存储到一个新的数组中，不能浪费长度
 */

public class 讲练解_2_201609101842 {
	public static void main(String[] args){
		int oldArr[] = {1,4,9,4,1,1,7};
		int[] newArr = clearRepeat(oldArr);
		System.out.println("新的数组："+Arrays.toString(newArr));
	}
	
	
	public static int[] clearRepeat(int[] oldArr){
		int count = 0; //用于记录重复元素的个数
		
		//计算出重复元素的个数
		for(int i = 0 ; i<oldArr.length -1 ;i++){
			for(int j = i+1; j<oldArr.length;j++){
				if(oldArr[i] == oldArr[j]){
					count++;
					break;
				}
			}
		}
		System.out.println("重复个数："+count);
		
		//创建新的数组
		int[] newArr = new int[oldArr.length - count];
		
		//新数组使用的索引值
		int index = 0;
		
		//遍历旧数组
		for(int i = 0; i<oldArr.length; i++){
			boolean flag = false; //该标识用于标识出取出的元素是否存在于新的数组中，默认是不存在的
			
			//从旧数组中取出遍历的元素
			int temp = oldArr[i];
			
			for(int j = 0;j<newArr.length;j++){
				if(newArr[j] == temp){
					flag = true; //意味着元素重复
					break;
				}
			}
			
			//钙元素不存在新的数组中，这时候应该存储起来
			if(flag == false){
				newArr[index++] = temp;
			}
		} 
		
		return newArr;
	}
}
