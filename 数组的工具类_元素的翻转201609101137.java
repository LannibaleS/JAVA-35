/*
 * ���󣺰�һ�������Ԫ�ط�ת
 */
public class ����Ĺ�����_Ԫ�صķ�ת201609101137 {
	public static void main(String[] args){
		//ֵ���ݡ���
		char[] arr = {'L','S','N','B'};  //����������ڴ��ַ��0x97
		//����reverse����
		//char[] newArray = 
		reverse(arr);
		//ѭ����������е��ַ�
		for(int i = 0; i < arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
	
	public static void reverse(char[] arr){
		//public static char[] reverse(char[] arr)
		//������������0x97����������ô���������ͬһ�����飬���Ծ��໥Ӱ�쵽�ˣ����Բ���д����ֵ
		for(int startIndex = 0, endIndex = arr.length - 1;
				startIndex < endIndex; startIndex++,endIndex--){
			//����λ��
			char temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
		//return arr;
	}
}
