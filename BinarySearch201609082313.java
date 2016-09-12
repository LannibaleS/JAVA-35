
/*
 * 需求：定义一个函数接受一个数组与一个要查找的元素，然后返回元素在数组中的索引值，如果不存在，返回-1表示
 
   二分法（折半查找法）：折半查找法只适用于有序的数组，数据量比较大的情况下，效率比较高
 */
public class BinarySearch201609082313 {
	public static void main(String[] args){
		int[] arr = {12,15,18,19,34};
		int index = searchEle(arr,34);   
		System.out.println("索引值："+index);
		int index_half = halfSearch(arr,34);
		System.out.println("索引值："+index_half);
	}
	
	//折半查找发（二分法）
	public static int halfSearch(int[] arr, int target){
		//定义三个变量记录查找范围的最大、最小、中间索引值
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min) /2;
		
		while(true){
			if(target > arr[mid]){
				min = mid + 1;
			}else if(target < arr[mid]){
				min = mid - 1;
			}else{
				//target = arr[mid] 找到的情况
				return mid;
			}
			
			// 由于上面的计算会改变最大、最小索引值，所以应该要重新计算中间值
			mid = (max + min)/2;
			
			//找不到的情况
			if(min > max)
				return -1;
		}
	}
	
	//遍历查找发，遍历数组中的每一个元素与目标元素比较一次，效率比较低
	public static int searchEle(int[] arr, int target){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				return i;
			}
			
		}
		return -1;
	}
}
