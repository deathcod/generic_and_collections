package generics;

class HashTableImp<K, V> {
  private K key;
  private V value;

  HashTableImp(K key, V value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString() {
    return "Key: " + key.toString() + ", Value: " + value.toString();
  }
}

/**
 * hashTable
 */
public class HashTable {
  public static void main(String[] args) {
    HashTableImp<String, Integer> h = new HashTableImp<>("hash", 55);
    System.out.println(h.toString());
  }
}