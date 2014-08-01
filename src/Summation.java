
public class Summation {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str[]={"89","12","10","18","35"};
		String str1 = Integer.toString(456);
		String str2 = Integer.toBinaryString(456);
		String str3 = Integer.toHexString(456);
		String str4 = Integer.toOctalString(456);
		/*
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		*/
		int sum=0;
		for(int i =0;i<str.length;i++){
			int myint = Integer.parseInt(str[i]);
			sum=sum+myint;
		}
		//System.out.println(sum);
		int maxint = Integer.MAX_VALUE;
		int minint = Integer.MIN_VALUE;
		int intsize = Integer.SIZE;
		System.out.println(maxint);
		System.out.println(minint);
		System.out.println(intsize);
		System.out.println(Integer.TYPE);
		System.out.println(Integer.valueOf("146"));
		
	}

}
