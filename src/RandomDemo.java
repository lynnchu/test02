import java.util.Random;


public class RandomDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(10));
		System.out.println(r.nextBoolean());
		System.out.println(r.nextDouble());
		System.out.println(r.nextFloat());
		System.out.println(r.nextGaussian());
	}
	
}
