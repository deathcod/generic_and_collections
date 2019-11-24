package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://docs.oracle.com/javase/tutorial/java/generics/genTypeInference.html">TypeInference</a>
 */
public class TypeInference {
  public static void main(String[] args) {
    List<Bucket<String>> listOfBucket = new ArrayList<>();
    String item = "chinmay";

    // type witness
    Bucket.<String>addStore(item, listOfBucket);

    Bucket.addStore(item, listOfBucket);
  }
}

/**
 * InnerTypeInference
 */
class Bucket<T> {
  public static <T> void addStore(T item, List<Bucket<T>> listOfBucket) {
    System.out.println(String.format("%s is in the list", item));
  }
}