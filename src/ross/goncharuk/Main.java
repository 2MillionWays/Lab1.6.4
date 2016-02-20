package ross.goncharuk;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        int[] arr = {22, 33, 99, 35, 49, 51, 88, 11, 1};

        //Added a function to enter searched value from keyboard
        System.out.print("Enter searched value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Arrays.sort(arr);

        System.out.println("Array element: " + Arrays.binarySearch(arr, a));

    }
}
