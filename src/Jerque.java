
public class Jerque {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		String str = "";
		long starttime = System.currentTimeMillis();
		for(int i =0; i<10000;i++){
			str=str+i;
		}
		long endtime = System.currentTimeMillis();
		long time = endtime - starttime;
		System.out.println(time);
		StringBuilder stringbuild = new StringBuilder();
		starttime = System.currentTimeMillis();
		for(int j=0;j<10000;j++){
			stringbuild.append(j);
		}
		endtime=System.currentTimeMillis();
		time =endtime-starttime;
		System.out.println(time);
		*/
		StringBuilder str1 = new StringBuilder("hello word");
		str1.append(" and ");
		str1.insert(15, "java");
		System.out.println(str1);
		str1.delete(6, 15);
		System.out.println(str1.toString());
		
		
}

}
