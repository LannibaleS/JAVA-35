import java.util.Arrays;

/*
 * 对数组常见的操作：
 * 		1、找出最大值
 * 		2、排序
 * 		3、二分法查找元素
 * 
 * JDK API 1.6.0 中文版
 * 数组的工具类(Arrays)： 
 * 	  String  toString((任意类型数组)[] a)
 * 		返回制定数组内容的字符串表示形式
 * 
 * 	  Sort(数组)  排序
 *    binarySearch 二分法   返回的是元素在数组中的索引值，如果不存在返回负数表示
 * 
 */
public class 数组的工具类_201609101213 {
	public static void main(String[] args){
		int[] arr = {12,5,18,4,19};
		//排序
		Arrays.sort(arr);
		
		//二分法查找
		int index = Arrays.binarySearch(arr, 6);
		//返回的负数就是第一个比目标元素大的元素索引值+1，再取负数
		
		//遍历数组中的元素
		System.out.println("数组的元素："+ Arrays.toString(arr));
		System.out.println("元素的索引值："+ index);
		
	}
}
