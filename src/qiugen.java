
public class qiugen {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=1;
		int b = 2;
		int c = 4;
		int d = b*b-4*a*c;
		double x1,x2;
		double p,q;
		if(d == 0){
			System.out.println("X1=X2="+(-b)/2*a);
		}
		else if(d>0){
			x1=((-b)+Math.sqrt(d))/2*a;
			x2=((-b)-Math.sqrt(d))/2*a;
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}
		else{
			p=(-b)/2*a;
			q=Math.sqrt(-d)/2*a;
			System.out.println("x1="+p+"+"+q+"i");
			System.out.println("x1="+p+"-"+q+"i");
		}
	}

}
