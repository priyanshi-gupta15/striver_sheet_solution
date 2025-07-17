package step1.lec6;
import  java.util.*;
// Hashing is a technique used to map data to a fixed-size value (called a hash code or hash value). It is widely used in:
// Hash Tables / HashMaps
// Data retrieval
// Cryptography
// Indexing


// Key Idea:
// Hashing converts input data (like a key) into a number using a hash function, which is used to store or retrieve values efficiently.


public class hashing {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    // Inserting key-value pairs
    map.put("apple", 3);
    map.put("banana", 5);
    map.put("orange", 2);

    // Accessing elements
    System.out.println("Bananas: " + map.get("banana")); // Output: 5

    // Checking existence
    System.out.println("Has apple? " + map.containsKey("apple")); // true

    // Iterating
    for (String key : map.keySet()) {
      System.out.println(key + "=" + map.get(key));
    }

  }
}
// What is a Hash Function?
// A function that converts a key into a fixed-size integer (hash code).

// Example: "apple".hashCode() → returns an int

// Java internally uses it in HashMap to determine where to store the value.


//How HashMap Works (Internally):
// Key is passed to hashCode() → generates a hash value

// That value is modded by the table size to get an index

// Value is stored at that index in a bucket

// In case of collisions, chaining or open addressing is used

// Hash Collisions:
// When two keys get the same hash index.

// Example: key1 and key2 both map to index 5

// Java uses LinkedList or Tree (in buckets) to store multiple entries

