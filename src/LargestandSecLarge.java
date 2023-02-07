import java.util.Scanner;

public class LargestandSecLarge {
    public static void largeandSecLarge(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("First largest element is :: " + max);
        int secMax = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > secMax && arr[i] < max ) {
                secMax = arr[i];

            }
        }

        System.out.println("second largest element is :: " + secMax);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements ");
        int n = sc.nextInt(), i;
        int arr[] = new int[n];

        for (i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        largeandSecLarge(arr);


    }
}