import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int reversed = 0;
    num = sc.nextInt();
    // float digit;
    while (num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    System.out.println(reversed);
  }
}
