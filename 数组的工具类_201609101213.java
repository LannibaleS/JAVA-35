import java.util.Arrays;

/*
 * �����鳣���Ĳ�����
 * 		1���ҳ����ֵ
 * 		2������
 * 		3�����ַ�����Ԫ��
 * 
 * JDK API 1.6.0 ���İ�
 * ����Ĺ�����(Arrays)�� 
 * 	  String  toString((������������)[] a)
 * 		�����ƶ��������ݵ��ַ�����ʾ��ʽ
 * 
 * 	  Sort(����)  ����
 *    binarySearch ���ַ�   ���ص���Ԫ���������е�����ֵ����������ڷ��ظ�����ʾ
 * 
 */
public class ����Ĺ�����_201609101213 {
	public static void main(String[] args){
		int[] arr = {12,5,18,4,19};
		//����
		Arrays.sort(arr);
		
		//���ַ�����
		int index = Arrays.binarySearch(arr, 6);
		//���صĸ������ǵ�һ����Ŀ��Ԫ�ش��Ԫ������ֵ+1����ȡ����
		
		//���������е�Ԫ��
		System.out.println("�����Ԫ�أ�"+ Arrays.toString(arr));
		System.out.println("Ԫ�ص�����ֵ��"+ index);
		
	}
}
