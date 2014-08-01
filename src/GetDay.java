import java.util.Arrays;


public class GetDay {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		int day[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<12;i++){
			System.out.println((i+1)+"月有"+day[i]+"天");
		}
		*/
		/*
		int a[][] = new int[][]{{1},{2,3},{4,5,6}};
		//System.out.println(a.length);
	
		for(int i =0;i<a.length;i++){
			for(int j =0;j<a[i].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
			
		for (int[] x : a) {
			for (int e : x) {
				System.out.print(e+",");
			}
		}
		*/
		/*
		int a[] = new int[5];
		Arrays.fill(a, 8);
		for(int i=0;i<5;i++){
			System.out.println("第"+i+"个元素是："+a[i]);
		}
		*/
		/*
		int arr[] = new int[]{45,12,2,10};
		Arrays.fill(arr, 1, 3, 8);	
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		/*
		int arr[]=new int[]{23,42,12};
		int newarr[] = Arrays.copyOf(arr,5);
		int newarr1[] = Arrays.copyOfRange(newarr, 1, 3);
		for(int i =0;i<newarr.length;i++){
			System.out.print(newarr[i]+",");
		}
		System.out.println(" ");
		for(int j =0;j<newarr1.length;j++){
			System.out.print(newarr1[j]+",");
		}
		*/
		int arr[] = new int[]{4,25,10};
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, 30);
		int index1 = Arrays.binarySearch(arr, 0, 3, 25);
		System.out.println(index1);
		}
	}


