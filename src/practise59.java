
public class practise59 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		String str1 = "aed,DRG";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		*/
		/*
		String str1 = "hello word";
		String str2 = "hello Java";
		if(str1.substring(0,5).equals(str2.substring(0,5)))
		{
			System.out.println("�����ַ�����ͬ");
		}
		else{
			System.out.println("�����ַ���������ͬ");
		}
		*/
		/*
		String text = "13585922953";
		String text1 = "3213232123d";
		String text2 = "123456789";
		String regex = "1[38]\\d{9}";
		System.out.println(text.matches(regex));
		System.out.println(text1.matches(regex));
		System.out.println(text2.matches(regex));
		*/
		StringBuilder str1 = new StringBuilder("a");
		for(int i=1;i<11;i++)
		{
			str1.append(i);
		}
		System.out.println(str1.toString());
		}

}
