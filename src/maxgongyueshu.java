
public class maxgongyueshu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int m =4;
		int n =6;
		int temp;
		if(m<n){
			temp=m;
			m=n;
			n=temp;
		}
		int P = m*n;
		while(m%n!=0){
			int r= m%n;
			m=n;
			n=r;
		}
		System.out.println("最大公约数为"+n);
		System.out.println("最小公倍数为："+P/n);
	}

}
