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

    private static boolean isValueInArrayAdvanced(int[] arr, int T) {

        System.out.println("\nAdvanced Version");

        //make a sum for each possible string
        int[] sum = new int[arr.length];


        if (arr[0] == T)  {
            System.out.print(" < Found sum equal to T > " );
            return true;
        }
        sum[0] = arr[0];

        int[] lastval;
        for (int i=1;i<arr.length;i++) {

/*
			1: 1
			2: 2 / 2,1
			3: 3 / 3,2 / 3,2,1
			4: 4 / 4,3 / 4,3,2 / 4,3,2,1

			i1: arr[i];
			i2: arr[i] ; arr[i] + i1
			i3: arr[i] ; arr[i] + i1 ; arr[i] + i2 + i1 ;

*/



            sum[i] = sum[i-1] + arr[i];
            System.out.println(sum[i]);

            if (sum[i] == T ) {
                System.out.print(" < Found sum equal to T > " );
                return true;
            }

        }

        return false;
    }


    private static boolean isValueInArrayBasic(int[] arr, int T) {

        System.out.println("Basic Version");

        int sum = 0;
        if (arr==null) return false;
        if (arr.length ==0) return false;

        int n = arr.length;
        int iterations = 0;

        sum = 0;
        //loop over starting index
        for (int i=0; i<(arr.length); i++ ) {

            //loop from that point on to the rest of the array
            for (int j=i; j<(arr.length); j++ ) {

                System.out.print(j + ": " + arr[j] + ", ");
                //System.out.print( arr[j] + ", " );
                sum = sum + arr[j];
                iterations++;
                if (sum == T) {
                    System.out.print(" < Found sum equal to T > " );
                    //	return true;
                }
            }
            System.out.print(" Sum = " + sum );
            sum = 0;
            System.out.println( "" );




        }
        System.out.println( "Iterations:"+ iterations + ", n=" + n  );

        return false;
    }

}
