import java.util.Arrays;

/*
 * 3����������һ�����飬int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5},
 *   Ҫ�����������Ϊ0��Ԫ�أ�Ȼ��洢��������ݵ�һ���µ������С�����Ҫ���µ����鲻���˷ѳ���
 */

public class ������_1_201609101742 {
	public static void main(String[] args){
		int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		
		int[] newArr = clearZero(oldArr);
		System.out.println("�µ����飺"+Arrays.toString(newArr));
	}
	
	public static int[] clearZero(int[] oldArr){
		//��ͳ��0�ĸ���
		int count = 0;
		for(int i = 0; i < oldArr.length - 1; i++){
			if(oldArr[i] == 0){
				count++;
			}
		}
		System.out.println("0�ĸ����ǣ�"+count);
		
		//����������
		int[] newArr = new int[oldArr.length - count];
		
		//������ʹ�õ�����ֵ
		int index = 0;
		//�����ɵ����飬�ѷ�������ݴ洢���µ�������
		for(int i = 0; i<oldArr.length;i++){
			if(oldArr[i] != 0){
				newArr[index++] = oldArr[i];
			}
		}
		return newArr;
	}
}
