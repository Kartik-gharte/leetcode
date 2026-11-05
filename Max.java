// public class Max {
//     public static void main(String[] args) {
        
//         int [] arr ={10,29,42,13,16};
//         int max = arr[0];
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }


class Max{
    public static void main(String[] args) {

         
         int arr [] = {12, 13 , 14,9, 30, 6 , 16};
         int max = arr[0];
         
         for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
         }
         System.out.println(max);

    }
}