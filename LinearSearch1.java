
// Problem 1 — Find an element
// Given {10, 25, 30, 45, 50}, find the index of 45. If it isn't found, print -1.

// Expected output: 3



// Problem 2 — Search with user input
// Take the array size, elements, and target from the user. Print the index of the target or -1 if absent.

// Test with a target that is not present.



// Problem 3 — Count occurrences
// Given {2, 5, 2, 8, 2, 9}, count how many times 2 appears.

// Expected output: 3

public class LinearSearch1 {
    public static void main(String[] args) {
        
        int arr [] = {10, 25, 30, 45, 50};
        int target = 45;
        for (int i =0 ; i< arr.length; i++){
          if(arr[i] == target){
            System.out.println("index "+i);
          }
        }
    
    }
    
}
