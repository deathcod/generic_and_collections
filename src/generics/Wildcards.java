package generics;

import java.util.Arrays;
import java.util.List;

/**
 * Wildcards
 */
public class Wildcards {

  /**
   * Unbounded wild cards
   * Collection<?> : cannot read and add into the collection
   * 
   * Upper bounded wild cards
   * Collection<? extends Nunber> = new ArrayList<Integer>() ->  add or read only integers
   * 
   */
  public static void upperBoundedSum(List<? extends Number> list) {
    
    double sum = 0.0;
    for (Number item : list) { // you cant make it Double or Integer.
      sum += item.doubleValue();
    }

    System.out.println(sum);
  }

  // LowerBoundWildcards: These allows to read inherited class and write too.
  public static void lowerBoundedSum(List<? super Number> list) {

    // list.add(new Float(1.2)); Allowed
    // list.add(new Object(1)); Not allowed
    for (Object var : list) { // Notice we are providing
      System.out.println(var);
    }
  }

  public static void main(String[] args) {
    upperBoundedSum(Arrays.asList(1,2,3,4,5));
    upperBoundedSum(Arrays.asList(1.1,2,3,4,5));
    lowerBoundedSum(Arrays.asList("chinmay", "cool", 1, 2)); // serializable array
  }
}