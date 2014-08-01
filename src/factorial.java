
public class factorial {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*int i=1;
		int j=1;
		float sum =0.0f;
		float Mult =1.0f;
		while(i<=20){
				Mult= Mult * i;			
	//		System.out.println(Mult);
			sum=sum+(1/Mult);
			i++;
		}
		System.out.println(sum);*/
		double sum = 0,a = 1;
	      int i = 1;
	      while(i <= 20)
	      {
	    	  sum = sum+a;
	    	  i = i+1;
	    	  a = a*(1.0/i);
	      }
	      System.out.println(sum);
	}

}
