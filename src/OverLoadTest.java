
public class OverLoadTest {

	public static int add(int a, int b){
		return a+b;
	}
	public static double add(double a, double b){
		return a+b;
	}
	public static int add(int a){
		return a;
	}
	public static int add(int a, double b){
		return 1;
	}
	public static int add(double a, int b){
		return 1;
	}
	public static int add(int...a){
		int s =0;
		for(int i=0;i<a.length;i++)
			s+=a[i];
			return s;
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(add(1,2));
		System.out.println(add(1.2,2.3));
		System.out.println(add(1));
		System.out.println(add(1,2,3,4,5,6,7,8,9));
		System.out.println(add(1));
	}

}
