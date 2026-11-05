import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        System.out.println("Enter the array numbers");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Pre-computation
        int[] hash = new int[13];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

       for(int i=0; i<hash.length;i++){
            System.out.println("index:"+i+ "="+hash[i]);
       }
  
         
        // // Fetch queries
        // System.out.println("Enter value of q");
        // int q = sc.nextInt();

        // while (q-- > 0) {
        //     System.out.println("Enter the number");
        //     int number = sc.nextInt();

        //     System.out.println("Frequency: " + hash[number]);
        // }

        sc.close();
    }
}