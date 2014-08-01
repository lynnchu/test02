
public class MathRondom {
	public static int GetEvenNum(double num1,double num2){
		int s = (int) num1 +(int)(Math.random()*(num2-num1));
		if(s%2==0){
			return s;
		}
		else
		return s+1;
		
	}
	public static char GetRandomChar(char cha1,char cha2){
		return (char)(cha1+Math.random()*(cha2-cha1+1));
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(GetEvenNum(2, 32));
		System.out.println(GetRandomChar('a', 'z'));
		System.out.println(GetRandomChar('A', 'Z'));
		System.out.println(GetRandomChar('0', '9'));
	}

}
