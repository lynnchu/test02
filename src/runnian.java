
public class runnian {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int year = 2100;
		if(year%4!=0){
			System.out.println(year+"不是闰年");
		}
		else{
			if(year%100!=0){
				System.out.println(year+"是闰年");
			}
			else{
				if(year%400==0){
					System.out.println(year+"是闰年");
				}
				else{
					System.out.println(year+"不是闰年");
				}
			}
		}
	}

}
