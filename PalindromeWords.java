import java.util.Scanner;

public class PalindromeWords {
    static boolean isPalindrome(String str){
        int i = 0, j = str.length()-1;

        while (i < j){
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str){
        String reverse ="";

        for(int i =str.length()-1;i>=0;i--)
            reverse += str.charAt(i);
        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word;


        System.out.print("Kelimenizi giriniz : ");
        word = input.nextLine();

        if (isPalindrome(word))
            System.out.println(word+" palindromiktir");
        else
            System.out.println(word+" palindromik değildir");

        System.out.println("<================================================>");

        if (isPalindrome2(word))
            System.out.println(word+" palindromiktir");
        else
            System.out.println(word+" palindromik değildir");

    }
}