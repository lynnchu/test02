import java.math.*;
public class sushu {
static int j;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//int[] num = {4,23,45,56,78,89};
		for (int i =100;i<=200;i++){
			for(j=2;j<=(int)Math.sqrt(i);j++){
			if(i%j==0){
				j=i;
				System.out.println(i+"不是素数");	
			}
			if(j==((int)Math.sqrt(i))&&(i%j!=0)){
				System.out.println(i+"是素数");
			}
		}
	}
}
}



