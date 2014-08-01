
public class practise881 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Integer int1 = new Integer("123");
		int myint1 = int1.intValue();
		System.out.println(myint1);
		Character mychar1 = new Character('A');
		Character mychar2 = new Character('a');
		System.out.println(mychar1.equals(mychar2));
		Character mychar3 = Character.toLowerCase(mychar1);
		Character mychar4 = Character.toLowerCase(mychar2);
		System.out.println(mychar3.equals(mychar4));
		
		Boolean mybool1 = new Boolean("a23");
		System.out.println(mybool1.toString());
		
		
		}

}
