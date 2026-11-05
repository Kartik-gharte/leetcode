import java.util.*;
public class Main2 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         
          System.out.println("Enter the string ");
          String s = sc.nextLine();

  //precompute
           int hash[] = new int[256];

           for(int i=0; i<s.length(); i++){
                 char ch = s.charAt(i);
                //  hash[ch - 'a']++;
                hash[ch]++;
                 
           }
 //fetching

       System.out.println("Enter the value of q");
int q = sc.nextInt();

while (q-- > 0) {
    System.out.println("Enter the character");
    char ch = sc.next().charAt(0);

    System.out.println("index:"+ch+ "="+hash[ch]);
}

    }
}
