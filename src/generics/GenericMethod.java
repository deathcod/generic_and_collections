package generics;

/**
 * GenericMethod
 */
public class GenericMethod {

  // diamond paramater
  public <T> void showItem(T t) {
    System.out.println(t);
  }

  public <T> void showArrayItem(T[] t) {
    for (T item: t) {
      System.out.println(item + "->");
    }
  }
}