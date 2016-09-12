
//车类
class LCar{
	//事物的公共属性使用成员变量描述
	String color; //颜色属性
	String name = "Benz"; //名字属性
	int wheel;   //轮子数
	 
	//事物的公共行为功能使用函数描述,一个方法内部可以直接访问成员变量
	public void run(){
		System.out.println(name+"跑的非常快！");
	}
}

public class 面向对象的内存分析_2_201609121351 {
	public static void main(String[] args){
		LCar c1 = new LCar();
		LCar c2 = new LCar();
		//c1 = null; //java.lang.NullPointerException
		c2 = c1;  //c1的内存地址赋予给c2
		c1.name = "法拉利";
//一个引用类型的变量没有指向任何的对象，而访问了对象的属性或者调用了对象的方法。 
		c2.name = "保时捷";
		System.out.println("名字："+c1.name);
	}
}
