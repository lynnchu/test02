
public class runnian {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int year = 2100;
		if(year%4!=0){
			System.out.println(year+"��������");
		}
		else{
			if(year%100!=0){
				System.out.println(year+"������");
			}
			else{
				if(year%400==0){
					System.out.println(year+"������");
				}
				else{
					System.out.println(year+"��������");
				}
			}
		}
	}

}
