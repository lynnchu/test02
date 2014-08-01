
public class Test2 extends Test {
	public Test2(){
		super();						//调用父类构造方法
		super.doSomething();			//调用父类成员方法
	}
	public void doSomethingnew() {
		
	}
	public void doSomething(){
		
	}
	protected Test2 dolt() {
		return new Test2();
	}
}
