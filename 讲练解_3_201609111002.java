import java.util.Arrays;
import java.util.Scanner;

/*
 * 2���û�����༶��������Ȼ����������ÿ��ͬѧ�ĳɼ�
 *   ������Ϻ����������û�дﵽ60%����Ϊÿһ��û�м���ĳɼ�+2�֣�֪�������ʴﵽ60%����
 */
public class ������_3_201609111002 {
	public static void main(String[] args){
		int[] arr = {98,99,54,59};//readyData();
		System.out.println("�����Ԫ����"+Arrays.toString(arr));
		//�õ�����ļ�����
		double rate = getRate(arr);
		
		System.out.println("��������"+rate*100+"%");
		
		while(true){
			if(rate < 0.6){
				for(int i=0;i<arr.length;i++){
					if(arr[i] < 60){
						arr[i] = arr[i] + 2;
					}
				}
				rate = getRate(arr); //���¼��㼰����
			}else{
				break;
			}
		}
	}
	
	//���㼰����
	public static double getRate(int[] arr){
		double count = 0; //����һ����������¼��������
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < 60){
				count++;
			}
		}
		
		//������
		double rate = count/arr.length;
		
		return rate;
	}
	
	//׼������
	public static int[] readyData(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������༶������");
		int count = scanner.nextInt();
		
		//����һ���������
		int[] arr = new int[count];
		
		//¼��ѧ���ĳɼ�
		for(int i=0;i<count;i++){
			System.out.println("�������"+(i+1)+"λͬѧ�ĳɼ�");
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
}
