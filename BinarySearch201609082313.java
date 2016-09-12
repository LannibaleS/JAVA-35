
/*
 * ���󣺶���һ����������һ��������һ��Ҫ���ҵ�Ԫ�أ�Ȼ�󷵻�Ԫ���������е�����ֵ����������ڣ�����-1��ʾ
 
   ���ַ����۰���ҷ������۰���ҷ�ֻ��������������飬�������Ƚϴ������£�Ч�ʱȽϸ�
 */
public class BinarySearch201609082313 {
	public static void main(String[] args){
		int[] arr = {12,15,18,19,34};
		int index = searchEle(arr,34);   
		System.out.println("����ֵ��"+index);
		int index_half = halfSearch(arr,34);
		System.out.println("����ֵ��"+index_half);
	}
	
	//�۰���ҷ������ַ���
	public static int halfSearch(int[] arr, int target){
		//��������������¼���ҷ�Χ�������С���м�����ֵ
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min) /2;
		
		while(true){
			if(target > arr[mid]){
				min = mid + 1;
			}else if(target < arr[mid]){
				min = mid - 1;
			}else{
				//target = arr[mid] �ҵ������
				return mid;
			}
			
			// ��������ļ����ı������С����ֵ������Ӧ��Ҫ���¼����м�ֵ
			mid = (max + min)/2;
			
			//�Ҳ��������
			if(min > max)
				return -1;
		}
	}
	
	//�������ҷ������������е�ÿһ��Ԫ����Ŀ��Ԫ�رȽ�һ�Σ�Ч�ʱȽϵ�
	public static int searchEle(int[] arr, int target){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				return i;
			}
			
		}
		return -1;
	}
}
