
//����
class LCar{
	//����Ĺ�������ʹ�ó�Ա��������
	String color; //��ɫ����
	String name = "Benz"; //��������
	int wheel;   //������
	 
	//����Ĺ�����Ϊ����ʹ�ú�������,һ�������ڲ�����ֱ�ӷ��ʳ�Ա����
	public void run(){
		System.out.println(name+"�ܵķǳ��죡");
	}
}

public class ���������ڴ����_2_201609121351 {
	public static void main(String[] args){
		LCar c1 = new LCar();
		LCar c2 = new LCar();
		//c1 = null; //java.lang.NullPointerException
		c2 = c1;  //c1���ڴ��ַ�����c2
		c1.name = "������";
//һ���������͵ı���û��ָ���κεĶ��󣬶������˶�������Ի��ߵ����˶���ķ����� 
		c2.name = "��ʱ��";
		System.out.println("���֣�"+c1.name);
	}
}
