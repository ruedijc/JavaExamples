/**
 * Created by jruedin on 5/27/2016.
 */
public class SubsetSequenceSum {

    /*
    Problem: Given a sequence of nonnegative integers A and an integer T, return whether there
    is a *continuous sequence* of A that sums up to exactly T

    Example
    [23, 5, 4, 7, 2, 11], 20. Return True because 7 + 2 + 11 = 20
    [1, 3, 5, 23, 2], 8. Return True because 3 + 5 = 8
    [1, 3, 5, 23, 2], 7 Return False because no sequence in this array adds up to 7

    Note: We are looking for an O(N) solution. There is an obvious O(N^2) solution which is a
    good starting point but is not the final solution we are looking for.
    */

    public static void main(String[] args) {

        int[] A = {1,3,5,23,2};
        int T = 7;
        System.out.println("Result: " + testArray(A, T) );
    }

    private static boolean testArray(int[] A, int T) {

        int sum = 0;
        for (int i = 0; i < (A.length - 1); i++) {

            sum += A[i];

            System.out.println(sum);

            //stop loop when sum is T
            if (sum == T) return true;

            //reset sum when sum is >T
            if (sum > T) sum = 0;

        }
        //stop loop when end is reached
        // covered by end of loop
        return false;

    }
}
