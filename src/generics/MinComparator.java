package generics;

/**
 * MinComparator
 */
public class MinComparator {

  public static <T extends Comparable<T>> T calculateMin(T t1, T t2) {
    if (t1.compareTo(t2) > 0) {
      return t1;
    } else {
      return t2;
    }
  }
}