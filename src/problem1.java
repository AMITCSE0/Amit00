//Given a side of a square, your task is to calculate its area.

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
class problem1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int area =s*s;
        System.out.println(area);
    }
}
