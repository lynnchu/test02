import java.math.BigInteger;


public class BigIntegerDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BigInteger bigInstance = new BigInteger("4");
		BigInteger bigInstance1 = new BigInteger("2");
		System.out.println(bigInstance.add(bigInstance1));
		System.out.println(bigInstance.subtract(bigInstance1));
		System.out.println(bigInstance.multiply(bigInstance1));
		System.out.println(bigInstance.divide(bigInstance1));
		System.out.println(bigInstance.divideAndRemainder(new BigInteger("3"))[0]);
		System.out.println(bigInstance.divideAndRemainder(new BigInteger("3"))[1]);
		System.out.println(bigInstance.pow(2));
		System.out.println(bigInstance.negate());
		
	}

}
