/*
 * 二维数组：数组的数组
 *   
 *    1根             变量
 *    一盒            一维数组
 *    一条	  二维数组
 *    
 *    二维数组的定义格式：
 *    数据类型[][] 变量名 = new 数据类型[长度一][长度二]
 *    
 *    长度一：一条烟有几盒
 *    
 *    长度二：一盒烟有几根
 *    
 *    二维数组的初始化方式
 *    
 *    动态初始化：
 *    		数据类型[][] 变量名 = new 数据类型[长度一][长度二]
 *    
 *    动态初始化：
 *    		数据类型[][] 变量名 = {{元素1，元素2，。。。}，{元素1，元素2，。。。}}
 */
public class 二维数组201609101720 {
	public static void main(String[] args){
		int[][] arr = new int[3][4];
		System.out.println("长度1："+arr.length);
		System.out.println("长度2："+arr[1].length);
		
		int[][] ls = {{12,4,6,10},{2,7},{1,2}};
		System.out.println("长度1："+ls.length);
		System.out.println("长度2："+ls[1].length);
		
		//遍历二维数组
		
		for(int i = 0;i < ls.length; i++){
			for(int j = 0; j < ls[i].length; j++){
				System.out.print(ls[i][j]+",");
				
			}
			System.out.println();
		}
		
		
		
	}
}
