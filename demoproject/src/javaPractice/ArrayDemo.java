package javaPractice;

public class ArrayDemo {

	public static void main(String[] args) {
	
         int[] a= new int[0];
         int[] x= new int[10];
         //int[] z= new int[-5];//NegativeArraySizeException
         //int[4] b; declaration time array size will not be define
         int[] c;//second way to create one dimensional
         c=new int[8];//array
         int[] y = new int[3];
         y[0]= 10;
         y[1]= 20;
         y[2]= 30;
         System.out.println(y[0]+","+y[1]+","+y[2]);
         //y[3]=40;//arrayindexoutofboundexception
         int[] d = {10,20,30};//array declaration,creation,initializtion in one line
         //Retrieve or print the value of array by for loop
         int[] b = {5,6,7};
         /*for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
         //For Each Loop Demo How to print array value
         for (int i : b) {
			System.out.println(i);
		}*/
         
         
         
	}

}
