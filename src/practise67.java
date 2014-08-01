import java.util.Arrays;


public class practise67 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		int arr1[] = {1,2,3,445,6,89,23,57};
		int arr2[] = Arrays.copyOf(arr1, 3);
		for (int i : arr1) {
			System.out.print(">"+i);
		}
		System.out.println(" ");
		for (int j : arr2) {
			System.out.print(">"+j);
		}
		*/
		
		//--------------第二题-------------
		//int[] array = {20,34,23,56,12,0,1,50,78};
		int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
		practise67 sorter = new practise67();
		sorter.sort(array);
		
		//Arrays.sort(array);
		//System.out.println(array[0]);
	}
	public void sort(int[][] array){
		for(int i =0;i <array.length;i++){
			for(int j =0; j<array.length;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for(int i =0;i <array.length;i++){
			for(int j =0; j<array.length;j++){
				System.out.print(array[j][i]+" ");
			}
			System.out.println(" ");
		}
	}
	
		//---------------第三题-------------
		/*
		String array[] = {"1","ad","sd","ty"};
		Arrays.fill(array, 2, 3, "bb");
		for (String a : array) {
			System.out.print(a+" ");
		}
		*/
		//------------第四题--------
		
}
