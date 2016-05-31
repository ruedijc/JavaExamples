import java.util.Arrays;

/**
 * Created by jruedin on 5/31/2016.
 */
public class ReverseArrary {


    public static void main(String[] args) {

        int[] A = {1,2,3,4,5,6};
        int[] B;

        B = reverseArray(A);
        System.out.println("Result1:");
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        B = reverseArray2(A);
        System.out.println("Result2:");
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

    }

    private static int[] reverseArray(int[] A) {
        //example of handling null input -
        if (A == null) {
            throw new NullPointerException();
        }
        int[] b = A.clone();
        int ticks = 0; //for performance measuring

        //loop through
        //note, if length is 5,  I want index to count from 0,1,2,3,4
        for (int i=(A.length-1) ;i >=0 ;i--) {
            b[i] = A[(A.length-1)-i];
            ticks++;
        }

        //other loops
        System.out.println("Counting up if using i for index:");
        for (int i=0 ;i <A.length ;i++) {
            System.out.println("i: " + i);
        }
        System.out.println("Counting down if using i for index (wrong):");
        for (int i=A.length ;i >0 ;i--) {
            System.out.println("i: " + i);
        }
        System.out.println("Counting down if using i for index (right):");
        for (int i=(A.length-1) ;i >=0 ;i--) {
            System.out.println("i: " + i);
        }
        System.out.println("ticks: " + ticks);

        return b;
    }

    // trying by swapping
    private static int[] reverseArray2(int[] A) {
        //null check omitted
        int[] b = A.clone();

        int ticks = 0; //for performance measuring

        int temp;
        for (int i=0;i<b.length/2;i++) {   //only need to go halfway
            //swap
            temp = b[(b.length-1) - i];   //copy from the back
            b[(b.length-1) - i] = b[i];
            b[i] = temp;

            ticks++;
        }
        System.out.println("ticks: " + ticks);
        return b;
    }


}
