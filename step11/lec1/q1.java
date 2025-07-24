package step11.lec1;

//priotrity queue;
public class q1 {
  public static void main(String[] args) {
    // Create a priority queue
    java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();

    // Add elements to the priority queue
    pq.add(5);
    pq.add(1);
    pq.add(3);
    pq.add(2);
    pq.add(4);

    // Print the elements in the priority queue
    System.out.println("Priority Queue: " + pq);

    // Remove the head of the priority queue
    int head = pq.poll();
    System.out.println("Removed head: " + head);

    // Print the elements after removing the head
    System.out.println("Priority Queue after removal: " + pq);
    
  }
  
}
