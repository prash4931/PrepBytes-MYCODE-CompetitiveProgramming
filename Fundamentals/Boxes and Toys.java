import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int arr[][] = new int[N][2];
    
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < 2; j++) {
            arr[i][j] = sc.nextInt();
        }
    }
    
    int difference = 0;
    int count = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < 1; j++) {
            difference = arr[i][j+1] - arr[i][j];
            if (difference >= 2) {
                count++;
            }
        }
    }
    System.out.println(count);
    
  }
}
