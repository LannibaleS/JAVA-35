/* 自定义类的步骤：
 *    1、先试用class自定义一个类
 *       格式：
 *           class 类名{
 *           	事物的公共属性使用成员变量描述；
 *              事物的公共行为功能使用函数描述；
 *              }
 *              
 *     2、通过自定义的类创建对象。
 *     	    创建对象的格式：
 *     		 类名 变量名 = new 类名();
 * 	   3、访问对象的属性或者调用对象的功能
 * 		    访问对象的属性格式：
 *           对象.属性名
 *           
 *        调用对象的功能行为：
 *           对象.函数名
 *           
 * 练习：使用java描述一个车类和一个修车厂类，车具备公共属性、
 * 名字、颜色、轮子数。车具备的公共行为是跑的功能，但是跑之前必须先检查轮子是否是4个
 * 如果不够四个轮子，送去修车厂修理。修理完毕后，车的轮子就具备了四个
 * 修车厂具备公共属性：名字、地址、电话。还具备一个公共行为修车
 */

class SCar{
	//事物的公共属性使用成员变量面熟
	String name;   //名字属性
	String color;  //颜色属性
	int wheel;     //轮子数属性
	
	//事物的公共行为使用函数描述
	public void run(){
		if(wheel >= 4){
			System.out.println(name+wheel+"跑起来了！");
		}else{
			System.out.println("当前的轮子只有"+wheel+"个，速去修理！");
		}
	}
}

class Factory{
	String name;   //名字属性
	String address;    //地址属性
	String tel;     //电话属性
	
	//事物的公共行为使用函数描述  --- 修车的行为
	public void repair(SCar car){  //定义一个形式参数，用于接受破车
		if(car.wheel < 4){
			System.out.println("开始修车~~~");
			car.wheel = 4;
			System.out.println("wheel="+car.wheel);
			System.out.println("修完了，给钱！");
		}else{
			System.out.println("非常努力修好了，多给点儿钱！");
		}
	}
}

public class 面向对象的练习_3_201609121450 {
	public static void main(String[] args){
		//创建一个车对象
		SCar c = new SCar();
		//给车对象分配属性值
		c.name = "BMW";
		c.color = "RED";
		c.wheel = 4;
		
		//调用车的跑功能
		for(int i = 0; i<100;i++){
			c.run();
			System.out.println("跑了"+(i+1)+"KM");
		}
		c.wheel = 3; 
		c.run();
		
		//创建修车厂对象
		Factory f = new Factory();
		//给修车厂分配属性
		f.name = "NBA";
		f.address = "fuxinglu 24";
		f.tel = "010-12345678";
		
		//调用修理方法
		f.repair(c);
		c.run();
	}
}
