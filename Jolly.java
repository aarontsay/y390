public class Jolly {
  int[] array;
  int n;
  int[]restOf;
  
  public Jolly(int[] a) {
    this.array = a;
    n = a[0];
    restOf = new int[n];
    
    for (int i = 0; i < n; i++) {
      restOf[i] = array[i + 1];
    }
  }
    
  // determines if two numbers, n1 - n2, fulfills the need for n-1
  public String isJolly() {
    boolean result = false;
    int[] compareTo = new int[n - 1];
    for (int k = 1; k < n; k++) {
       compareTo[k - 1] = k;
    }
     
    // compares differences to compareTo, if there is a match, then compareTo changes matched value to zero    
    for (int i = 0; i < n; i++) {
      int difference = 0;
      if (i != n-1) {                                            // if i is not at out of range bound, aka n-1 where n + 1 would crash
        difference = (Math.abs(restOf[i] - restOf[i + 1]));
        for (int j = 0; j < compareTo.length; j++) {
          if(compareTo[j] == difference) {
            compareTo[j] = 0;
          }
        }
      }
    }
    
    // if compareTo has anything other than a zero at this point, then our conditions have not been met
    for (int ik = 0; ik < compareTo.length; ik++) {
      if (compareTo[ik] != 0) {
        result = false;
        break;
      } else {
        result = true;
      }
    }
    
    if (result == true) {
      return "Jolly";
    } else {
      return "Not jolly";
    }
  }
  
  // to String
  public String toString() {
    String result = "[";
    
    for (int i = 0; i < array.length; i++) {
      if (i != array.length - 1) {
        result += array[i] + ", ";
      } else {
        result += array[i] + "]";
      }
    }
    return result;
  }
 
  
  public static void main(String[] args) {
    int[] a1 = {4, 1, 4, 2, 3};
    Jolly j1 = new Jolly(a1);
    System.out.println(j1.isJolly());
    
    int[] a2 = {5, 1, 4, 2, -1, 6};
    Jolly j2 = new Jolly(a2);
    System.out.println(j2.isJolly());
    
    int[] a3 = {9, 1, 3, 4, 5, 6, 11, 3, 2, 8};
    Jolly j3 = new Jolly(a3);
    System.out.println(j3.isJolly());
    
  }
}