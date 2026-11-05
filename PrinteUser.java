
import java.util.Scanner;

// 4. Your next three problems
// Solve these yourself in Java using Scanner.

// Problem A — User Input

// Take n from the user, input n integers into an array, and print all elements.

// Problem B — Sum and Average

// Take n numbers and calculate their sum and average.

// Hint: use a double for the average.

// Problem C — Minimum Element

// Take an array from the user and find its smallest element. Make sure your solution also works when all elements are negative.
public class PrinteUser {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size ");
        int n = sc.nextInt();

        int arr [] = new int[n];

        System.out.println("Enter array elements :");

        for(int i= 0; i< arr.length; i++){
          arr[i] = sc.nextInt();
        }

        System.out.println("Printed elements:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
