
public class Quardrangle {
	private static Quardrangle[] qtest = new Quardrangle[6];
	private static int nextIndex =0;
	public static void draw(Quardrangle q){
		if(nextIndex < qtest.length){
			qtest[nextIndex]=q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	public static void main(String[] args){
		Quardrangle q = new Quardrangle();
		q.draw(new Square());
		q.draw(new Parallelogram());
	}
	
}
