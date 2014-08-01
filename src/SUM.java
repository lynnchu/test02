
public class SUM {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double sumhe=1;
		int sign = 1;
		double i;
		for(i=2;i<=100;){
			sign = (-1)*sign;
			sumhe = sumhe+sign*(1/i);
			i=i+1;
		}
		System.out.println(sumhe);
	}

}
