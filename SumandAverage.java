import java.util.*;
public class SumandAverage {
    public static void main(String[] args) {

        int sum =0;
        double average = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array that you want to sum and average ");
        int n = sc.nextInt();

        int arr [] = new int [n];

        System.out.println("Enter the number of elements ");
        for ( int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for( int i= 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum = "+sum);

        for(int i =0 ; i<arr.length; i++){
            average = sum/arr.length;
        }
        System.out.println("Average :"+average);
    }

}
