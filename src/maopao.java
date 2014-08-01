

public class maopao {

public void sort(int[] a){
/*//---------冒泡排序--------------
	for(int i=1;i<a.length;i++){
		for(int j=0;j<a.length-i;j++){
			if(a[j]>a[j+1]){
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	*/
/*	//----------选择排序----------
	for(int i=1;i<a.length;i++){
		int index= 0;
		for(int j = 1;j<=a.length-i;j++){
			if(a[j]>a[index]){
				index= j;
			}
		}
		int temp = a[a.length-i];
		a[a.length-i] = a[index];
		a[index] = temp;	
	}
	*/
	
//------------反转排序-------------
	for(int i=0;i<=a.length/2;i++){
		int temp = a[i];
		a[i]=a[a.length-i-1];
		a[a.length-i-1] = temp;
	}
showarray(a);
}

public void showarray(int[] array){
	for(int i:array){
		System.out.print(">"+i);
	}
}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[] = {23,45,33,13,322,214,};		
		maopao mp = new maopao();
		mp.sort(a);
	}

}
