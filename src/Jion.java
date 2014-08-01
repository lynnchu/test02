import java.util.Date;


public class Jion {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		String str1 = new String("hello");
		String str2 = new String("word");
		int i =3;
		int j;
		String s = str1+" "+str2;
		*/
		//System.out.println(s);
		//System.out.println("I like java");	
		//System.out.println(s.length());
		/*
		System.out.println(s.indexOf(""));
		System.out.println(s.lastIndexOf(""));
		*/
		/*
		System.out.println(s.charAt(1));
		System.out.println(s.substring(6));
		System.out.println(s.substring(2,8));
		*/
		/*
	    String str3="   java class  ";
	    System.out.println(str3.length());
	    System.out.println(str3.trim().length());
	    */
		/*
		String newstr1 = str1.replace("l", "w");
				System.out.println(newstr1);
				*/
		/*
		System.out.println(s.startsWith("hw"));
		System.out.println(s.endsWith("d"));
		*/
		/*
		System.out.println(str1.equals("helLo"));
		System.out.println(str1.equalsIgnoreCase("helLo"));
		String s1 = new String("a");
		String s2 = new String("f");
		System.out.println(s1.compareTo(s2));
		*/
		/*
		String str3 = str1.toUpperCase();
		System.out.println(str3);
		System.out.println(str3.toLowerCase());
		*/
		/*
		String str4 = "abc,def,ghi,jklm";
		String str5[]=str4.split(",");
		for(i=0;i<str5.length;i++){
			System.out.println(str5[i]);
		}
		String str6[]= str4.split(",", 2);
		for(j=0;j<str6.length;j++){
			System.out.println(str6[j]);
		}
		*/
		/*
		Date date = new Date();
		String str7 = String.format("%tr", date);
		System.out.println(str7);
		*/
		String regex = "\\w+@\\w+(\\.\\w{2,3})+";
		String str1 = "aaa@";
		String str2 = "aaaaa";
		String str3 = "1111@111ffyu.dfg.com";
		System.out.println(str1.matches(regex));
		System.out.println(str2.matches(regex));
		System.out.println(str3.matches(regex));
		
		
	}

}
