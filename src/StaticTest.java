
public class StaticTest {
	static double PI = 3.1415;
	static int id;
	
	public static void method1(){
		//do something
	}
	
	public void method2(){
	// int j = 9;
		System.out.println(StaticTest.PI);
		System.out.println(StaticTest.id);
		StaticTest.method1();
	}
	public static StaticTest method3(){
		method2();   //静态方法中不可调用非静态方法
		return this;   //静态方法不可以使用this关键字
		
	}
}
