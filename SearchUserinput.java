
import java.util.Scanner;

public class SearchUserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the asize of an array");
        int n = sc.nextInt();

        int arr [] = new int[n];

        System.out.println("Enter the array elements ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target ;
       
        System.out.println("Enter the target element: ");
        for (int i =0; i<arr.length; i++){
           System.out.println( target = arr[i]);
            
        }
       
       
    }
}
