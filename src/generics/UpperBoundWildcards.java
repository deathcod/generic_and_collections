package generics;

import java.util.Arrays;
import java.util.List;

/**
 * Wildcards
 */
public class UpperBoundWildcards {

  /**
   * Unbounded wild cards
   * Collection<?> : cannot read and add into the collection
   * 
   * Upper bounded wild cards
   * Collection<? extends Nunber> = new ArrayList<Integer>() ->  add or read only integers
   * 
   */

  public static void sum(List<? extends Number> list) {
    
    double sum = 0.0;
    for (Number item : list) { // you cant make it Double or Integer.
      sum += item.doubleValue();
    }

    System.out.println(sum);
  }

  public static void main(String[] args) {
    sum(Arrays.asList(1,2,3,4,5));
    sum(Arrays.asList(1.1,2,3,4,5));
  }
}