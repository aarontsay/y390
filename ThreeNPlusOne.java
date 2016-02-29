public class ThreeNPlusOne {
  
  // finds max Cycle of an integer
  // @param i is the low number
  // @param j is the high number
  public static String findMaxCycle(int i, int j) {
    
    int maxCycle = 0;
    int counter = 0;
    int f = 0;
    
    
    for (f = i; f <= j; f++) {
      while (f > 1) {
        if (f % 2 == 1) {
          f = (f * 3) + 1;
          counter++;
        } else if (i % 2 == 0) {
          f = f / 2;
          counter++;
        }
      }
      if (counter > maxCycle) {
        maxCycle = counter;
      }
      counter = 0;            // reset counter
    }
    System.out.println(i + " " + j + " " + maxCycle);
    return i + " " + j + " " + maxCycle;
    
  }
        
        
  public static void main(String[] args) {
    System.out.println(findMaxCycle(1, 10));
  }
}
