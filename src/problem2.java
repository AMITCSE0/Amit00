//Problem Statement
//Given an array A of size N. You need to find the root mean square (RMS) of the array i. e you first need to square all values of array and take its mean. Then you need to return the square root of mean. Print the answer with precision upto 6 decimal places.
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class problem2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ar[] = new int [a];
        double arrSize= ar.length;
        for(int i=0;i<arrSize;i++ ){
            ar[i]=in.nextInt();
        }

        for(int i=0;i<arrSize;i++ ){
            ar[i]=ar[i] *ar[i];
        }
        double sum =0 ;
        for(int i=0;i<arrSize;i++ ){
            sum = sum+ar[i];
        }
        double mean = sum/arrSize;

        double root ;
        root= Math.sqrt(mean);

        System.out.println(
                String.format("%.6f", root));
    }
}