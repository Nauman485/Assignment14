package geekster;

public class Reverse_arr {
	public static void main(String []args) {
		int arr[]= {1,2,3,4,5};
		int revarr[]=new int[arr.length];
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			revarr[count]=arr[i];
			count++;
		}
		for(int i=0;i<revarr.length;i++) {
			System.out.print(revarr[i]+" ");
		}
	}

}
