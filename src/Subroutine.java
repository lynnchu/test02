
public class Subroutine extends SubParent {
	Subroutine(){
		super(1);
		System.out.println("���������Subroutine()���췽��");
	}
	public String toString(){
		return "��"+getClass().getName()+"������дtosring()����";
				
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Subroutine s = new Subroutine();
		System.out.println(s);
				
	}

}
