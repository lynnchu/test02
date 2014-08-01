
public class ReverseSort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int array[]={10,20,30,40,50,60};
		ReverseSort sorter = new ReverseSort();
		sorter.sort(array);
	}
	public void sort(int[] array){
		for(int i =0;i<array.length/2;i++){
				int temp = array[i];
				array[i] = array[array.length-i-1];
				array[array.length-i-1] = temp;			
		}
		showArray(array);
		
	}
	public void showArray(int[] array){
		for (int k : array) {
			System.out.print(">"+k);			
		}
	}
}
