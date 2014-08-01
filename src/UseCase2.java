
public class UseCase2 {
	public void doSomething(){
		System.out.println("父类.doSomething()");
	}
	public void doAnything(){
		System.out.println("父类.doAnything()");
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			UseCase2 u=new sub();
			u.doSomething();
			u.doAnything();
	}

}
