/* �Զ�����Ĳ��裺
 *    1��������class�Զ���һ����
 *       ��ʽ��
 *           class ����{
 *           	����Ĺ�������ʹ�ó�Ա����������
 *              ����Ĺ�����Ϊ����ʹ�ú���������
 *              }
 *              
 *     2��ͨ���Զ�����ഴ������
 *     	    ��������ĸ�ʽ��
 *     		 ���� ������ = new ����();
 * 	   3�����ʶ�������Ի��ߵ��ö���Ĺ���
 * 		    ���ʶ�������Ը�ʽ��
 *           ����.������
 *           
 *        ���ö���Ĺ�����Ϊ��
 *           ����.������
 *           
 * ��ϰ��ʹ��java����һ�������һ���޳����࣬���߱��������ԡ�
 * ���֡���ɫ�������������߱��Ĺ�����Ϊ���ܵĹ��ܣ�������֮ǰ�����ȼ�������Ƿ���4��
 * ��������ĸ����ӣ���ȥ�޳�������������Ϻ󣬳������Ӿ;߱����ĸ�
 * �޳����߱��������ԣ����֡���ַ���绰�����߱�һ��������Ϊ�޳�
 */

class SCar{
	//����Ĺ�������ʹ�ó�Ա��������
	String name;   //��������
	String color;  //��ɫ����
	int wheel;     //����������
	
	//����Ĺ�����Ϊʹ�ú�������
	public void run(){
		if(wheel >= 4){
			System.out.println(name+wheel+"�������ˣ�");
		}else{
			System.out.println("��ǰ������ֻ��"+wheel+"������ȥ����");
		}
	}
}

class Factory{
	String name;   //��������
	String address;    //��ַ����
	String tel;     //�绰����
	
	//����Ĺ�����Ϊʹ�ú�������  --- �޳�����Ϊ
	public void repair(SCar car){  //����һ����ʽ���������ڽ����Ƴ�
		if(car.wheel < 4){
			System.out.println("��ʼ�޳�~~~");
			car.wheel = 4;
			System.out.println("wheel="+car.wheel);
			System.out.println("�����ˣ���Ǯ��");
		}else{
			System.out.println("�ǳ�Ŭ���޺��ˣ�������Ǯ��");
		}
	}
}

public class ����������ϰ_3_201609121450 {
	public static void main(String[] args){
		//����һ��������
		SCar c = new SCar();
		//���������������ֵ
		c.name = "BMW";
		c.color = "RED";
		c.wheel = 4;
		
		//���ó����ܹ���
		for(int i = 0; i<100;i++){
			c.run();
			System.out.println("����"+(i+1)+"KM");
		}
		c.wheel = 3; 
		c.run();
		
		//�����޳�������
		Factory f = new Factory();
		//���޳�����������
		f.name = "NBA";
		f.address = "fuxinglu 24";
		f.tel = "010-12345678";
		
		//����������
		f.repair(c);
		c.run();
	}
}
