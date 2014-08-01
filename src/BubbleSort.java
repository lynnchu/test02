
public class BubbleSort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int array[]={63,4,24,1,3,145};
		BubbleSort sorter = new BubbleSort();
		sorter.sort(array);
	}
	
	public void sort(int[] array){
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;i++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}				
			}
		}
		showArray(array);
	}
		public void showArray(int[] array){
			for (int k : array) {
				System.out.print(k+",");	
			}
			//System.out.println(" ");
		}
}
