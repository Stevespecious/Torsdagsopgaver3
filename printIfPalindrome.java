public class printIfPalindrome {
 public static void main(String[] args) {
    String laks = "den laks skal ned";
    String reverse = "";
    int len = laks.length();
    int i = len-1;
    while(i>=0){
        reverse = reverse + laks.charAt(i);
        i--;
    }

    if(laks.equals(reverse)){
            System.out.printf("The sentence " + laks + " is a Palindrome sentence");
        }
        else{
            System.out.printf("The sentence " + laks + " is NOT a Palindrome sentence");
        }
    }
}