
public class Subroutine extends SubParent {
	Subroutine(){
		super(1);
		System.out.println("调用子类的Subroutine()构造方法");
	}
	public String toString(){
		return "在"+getClass().getName()+"类中重写tosring()方法";
				
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Subroutine s = new Subroutine();
		System.out.println(s);
				
	}

}
