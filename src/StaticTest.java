
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
		method2();   //��̬�����в��ɵ��÷Ǿ�̬����
		return this;   //��̬����������ʹ��this�ؼ���
		
	}
}
