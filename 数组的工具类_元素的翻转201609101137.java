/*
 * 需求：把一个数组的元素翻转
 */
public class 数组的工具类_元素的翻转201609101137 {
	public static void main(String[] args){
		//值传递。。
		char[] arr = {'L','S','N','B'};  //假设数组的内存地址是0x97
		//调用reverse方法
		//char[] newArray = 
		reverse(arr);
		//循环输出数组中的字符
		for(int i = 0; i < arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
	
	public static void reverse(char[] arr){
		//public static char[] reverse(char[] arr)
		//操作的数组是0x97，和上面那么数组对象是同一个数组，所以就相互影响到了，可以不用写返回值
		for(int startIndex = 0, endIndex = arr.length - 1;
				startIndex < endIndex; startIndex++,endIndex--){
			//交换位置
			char temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
		//return arr;
	}
}
