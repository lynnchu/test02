
public class Cycle {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a =100;
		while(a==60)
		{
			System.out.println("ok1");
			a--;
		}
		int b = 100;
		do
		{
			System.out.println("ok2");
			b--;
		}
		while(b==60);
		System.out.println(a);
		System.out.println(b);
	}

}