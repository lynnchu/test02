package Number;

public class TransferProperty {
	static int i=47;
	public void call(){
		System.out.println("����call����");
		for(i=0;i<3;i++){
			System.out.print(i+" ");
			if(i ==2 ){
				System.out.println("\n");
			}
		}
	}
	public TransferProperty(){             //���幹�췽��
		
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TransferProperty t1 = new TransferProperty();
		TransferProperty t2 = new TransferProperty();
		t2.i = 60;
		System.out.println("��һ��ʵ��������ñ���I�Ľ��"+t1.i++);
		//System.out.println(i);
		t1.call();	
		//System.out.println(i);
		
		System.out.println("�ڶ���ʵ��������ñ���i�Ľ����"+t2.i);
		t2.call();
	}

}
