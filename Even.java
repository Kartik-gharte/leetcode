
// public class Even {
//     public static void main(String[] args) {
//         int count = 0;
//         int[] arr = {10, 20, 30, 40, 53};

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 count++;
//             }
//         }

//         System.out.println(count);
//     }
// }



class Even{
    public static void main(String[] args) {
        
        int arr [] = {1,2,3,4,5,6,7,8,9};
        int count = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i]%2 == 0){
                count++;
            }else{
                System.out.println("Odd numbers are :" +arr[i]);
            }
        }
        System.out.println("Even numbers count are :"+count);
    }
}