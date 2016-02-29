import java.util.Scanner;

public class Factovisors {
  
  public static void main(String[] args) {
    int fresult = 1;
    
    Scanner in = new Scanner(System.in);
    System.out.println("enter n and m");
    
    int n = in.nextInt();
    int m = in.nextInt();
    
    for (int i = n; i > 1; i--) {
      if (i == 1) {
        fresult = fresult * 1;
        System.out.println(fresult);
      } else {
        fresult = fresult * (i - 1);
        System.out.println(fresult);
      }
    }
    
    System.out.println(fresult);
    
    if (fresult % m == 0) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}

