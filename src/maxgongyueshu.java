
public class maxgongyueshu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int m =4;
		int n =6;
		int temp;
		if(m<n){
			temp=m;
			m=n;
			n=temp;
		}
		int P = m*n;
		while(m%n!=0){
			int r= m%n;
			m=n;
			n=r;
		}
		System.out.println("���Լ��Ϊ"+n);
		System.out.println("��С������Ϊ��"+P/n);
	}

}
