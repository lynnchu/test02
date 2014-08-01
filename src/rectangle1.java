
public class rectangle1 {
	public int length;
	public int width;
	public int area(){
		return length*width;		
	}
	public rectangle1(int length,int width){
		this.length = length;
		this.width = width;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		rectangle1 r1 = new rectangle1(3,7);
		System.out.println("area is:"+r1.area());
	}
}
