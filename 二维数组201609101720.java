/*
 * ��ά���飺���������
 *   
 *    1��             ����
 *    һ��            һά����
 *    һ��	  ��ά����
 *    
 *    ��ά����Ķ����ʽ��
 *    ��������[][] ������ = new ��������[����һ][���ȶ�]
 *    
 *    ����һ��һ�����м���
 *    
 *    ���ȶ���һ�����м���
 *    
 *    ��ά����ĳ�ʼ����ʽ
 *    
 *    ��̬��ʼ����
 *    		��������[][] ������ = new ��������[����һ][���ȶ�]
 *    
 *    ��̬��ʼ����
 *    		��������[][] ������ = {{Ԫ��1��Ԫ��2��������}��{Ԫ��1��Ԫ��2��������}}
 */
public class ��ά����201609101720 {
	public static void main(String[] args){
		int[][] arr = new int[3][4];
		System.out.println("����1��"+arr.length);
		System.out.println("����2��"+arr[1].length);
		
		int[][] ls = {{12,4,6,10},{2,7},{1,2}};
		System.out.println("����1��"+ls.length);
		System.out.println("����2��"+ls[1].length);
		
		//������ά����
		
		for(int i = 0;i < ls.length; i++){
			for(int j = 0; j < ls[i].length; j++){
				System.out.print(ls[i][j]+",");
				
			}
			System.out.println();
		}
		
		
		
	}
}
