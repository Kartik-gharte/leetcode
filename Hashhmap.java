
import java.util.*;

public class Hashhmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          System.out.println("Enter the number for an array size ");
        int n = sc.nextInt();

         System.out.println("Enter the array elements ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
         
        System.out.println("Enter the value of q");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter the number ");
            int number = sc.nextInt();
            System.out.println(map.getOrDefault(number, 0));
        }

        sc.close();
    }
}
