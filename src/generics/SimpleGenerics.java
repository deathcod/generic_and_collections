package generics;

class Store<T> {

  private T item;

  /**
   * @return the item
   */
  public T getItem() {
    return item;
  }

  /**
   * @param item the item to set
   */
  public void setItem(T item) {
    this.item = item;
  }
  
}
/**
 * simple_generics
 */
public class SimpleGenerics {

  public static void main(String[] args) {
    Store<String> strStore = new Store<String>();
    strStore.setItem("hello");
    strStore.getItem();
  }
}