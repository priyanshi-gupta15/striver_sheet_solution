package step1.lec3;
import java.util.*;
//all the classes in this package are part of the Java Collections Framework
// ex- ArrayList, LinkedList, HashMap, HashSet, etc.
//
public class que1 {
  public static void main(String[] args) {
    //intilaization of all the classes in the java collections framework
      
    //ArrayList
    ArrayList<Integer> list = new ArrayList<>();
    //operations on ArrayList
    list.add(1);
    list.get(0);
    list.set(0, 2);
    list.remove(0);
    list.size();
    list.clear();

    //LinkedList
    LinkedList<Integer> linkedList = new LinkedList<>();
    //operations on LinkedList
    linkedList.add(1);
    linkedList.get(0);
    linkedList.set(0, 2);
    linkedList.remove(0);
    linkedList.size();
    linkedList.clear();
    //HashMap
    HashMap<Integer, String> map = new HashMap<>();
    //operations on HashMap
    map.put(1, "One");
    map.get(1);
    map.remove(1);
    map.size();

    //HashSet
    HashSet<Integer> set = new HashSet<>();
    //operations on HashSet
    set.add(1);
    set.contains(1);
    set.remove(1);
    set.size();

    //TreeSet
    TreeSet<Integer> treeSet = new TreeSet<>();
    //operations on TreeSet
    treeSet.add(1);
    treeSet.contains(1);
    treeSet.remove(1);
    treeSet.size();

    //queue
    Queue<Integer> queue = new LinkedList<>();
    //operations on Queue
    queue.add(1);
    queue.peek();
    queue.poll();
    queue.size();
    //stack
    Stack<Integer> stack = new Stack<>();
    //operations on Stack
    stack.push(1);
    stack.peek();
    stack.pop();
    stack.size();
    //PriorityQueue
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    //operations
    priorityQueue.add(1);
    priorityQueue.peek();
    priorityQueue.poll();
    priorityQueue.size();
    //Deque
    Deque<Integer> deque = new ArrayDeque<>();

    }
  
}
