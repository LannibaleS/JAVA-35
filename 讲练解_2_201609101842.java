import java.util.Arrays;

/*
 * 4������ظ�Ԫ�ء�int[] arr = {1,4,9,4,1,1,7};
 *   �ѷ��ظ�Ԫ�ش洢��һ���µ������У������˷ѳ���
 */

public class ������_2_201609101842 {
	public static void main(String[] args){
		int oldArr[] = {1,4,9,4,1,1,7};
		int[] newArr = clearRepeat(oldArr);
		System.out.println("�µ����飺"+Arrays.toString(newArr));
	}
	
	
	public static int[] clearRepeat(int[] oldArr){
		int count = 0; //���ڼ�¼�ظ�Ԫ�صĸ���
		
		//������ظ�Ԫ�صĸ���
		for(int i = 0 ; i<oldArr.length -1 ;i++){
			for(int j = i+1; j<oldArr.length;j++){
				if(oldArr[i] == oldArr[j]){
					count++;
					break;
				}
			}
		}
		System.out.println("�ظ�������"+count);
		
		//�����µ�����
		int[] newArr = new int[oldArr.length - count];
		
		//������ʹ�õ�����ֵ
		int index = 0;
		
		//����������
		for(int i = 0; i<oldArr.length; i++){
			boolean flag = false; //�ñ�ʶ���ڱ�ʶ��ȡ����Ԫ���Ƿ�������µ������У�Ĭ���ǲ����ڵ�
			
			//�Ӿ�������ȡ��������Ԫ��
			int temp = oldArr[i];
			
			for(int j = 0;j<newArr.length;j++){
				if(newArr[j] == temp){
					flag = true; //��ζ��Ԫ���ظ�
					break;
				}
			}
			
			//��Ԫ�ز������µ������У���ʱ��Ӧ�ô洢����
			if(flag == false){
				newArr[index++] = temp;
			}
		} 
		
		return newArr;
	}
}
