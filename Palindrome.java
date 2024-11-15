public class Palindrome {
  public static void main(String args[]) {
    int n = 123,r,temp;
    temp = n;
    int result = 0;
    while(n > 0){
        r = n % 10;
        result = result * 10 + r;
        n/=10;
        
    }
    if(temp == result){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not a Palindrome");
    }
  }
}
