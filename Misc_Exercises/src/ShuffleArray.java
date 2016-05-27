import java.util.*;

/**
 * Created by jruedin on 5/27/2016.
 */
public class ShuffleArray {

    /* How would you randomly shuffle an array of ints ?
     */

    public static void main(String[] args) {

        int[] A = {1,2,3,4,5,6,7,8};

        shuffle1(A);

        shuffle2(A);

    }

    private static void shuffle2(int[] A) {
        //in n time and space
        int[] A0 = A.clone();
        Random rand = new Random();
        int temp;

        for (int i=0; i<A.length ;i++) {

            //swap current value with a random value in range
            int j = rand.nextInt(A.length); // get a random value in the range
            temp = A[j]; //make a temp copy of the random'th index value
            A[j] = A[i]; //copy i'th index value to random'th index value
            A[i] = temp; //copy temp value back into i'th value

        }

        //big O:  O(n) in time, n in space (optimal)

        //done, print output
        System.out.println("Shuffle2 method:");
        System.out.println(Arrays.toString(A0));
        System.out.println(Arrays.toString(A));

    }

    private static void shuffle1(int[] A) {
        //using Collections

        List<Integer> B = new ArrayList<Integer>();
        for( int i =0 ; i<A.length; i++) {
            B.add(A[i]);
        }
        Collections.shuffle(B);

        //big O: n to put into ArrayList, n to shuffle : O(2N)

        //done, print output
        System.out.println("Shuffle1 method:");
        System.out.println(Arrays.toString(A));
        System.out.println(B);

    }

}
