package Number;

public class TransferProperty {
	static int i=47;
	public void call(){
		System.out.println("调用call方法");
		for(i=0;i<3;i++){
			System.out.print(i+" ");
			if(i ==2 ){
				System.out.println("\n");
			}
		}
	}
	public TransferProperty(){             //定义构造方法
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TransferProperty t1 = new TransferProperty();
		TransferProperty t2 = new TransferProperty();
		t2.i = 60;
		System.out.println("第一个实例对象调用变量I的结果"+t1.i++);
		//System.out.println(i);
		t1.call();	
		//System.out.println(i);
		
		System.out.println("第二个实例对象调用变量i的结果："+t2.i);
		t2.call();
	}

}
