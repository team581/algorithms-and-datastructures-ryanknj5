package assignment;

public class App {

  public static int get(LinkedList list, int index) {
    LinkedList.Node item = list.head; // O(1)
    int length = list.length();
    for (int i = 0; i < length; i++) { // O(n)
      if(i==index){
        return item.data;
      } // This would make it so that if index is in the bounds of length then it will return the data other wise return null right?
      item = item.next; // O(1)

    }
    return item.data; // O(1)
  } // Algorithmic Complexity = O(n)

  public static void set(LinkedList list, int index, int value) {
    LinkedList.Node item = list.head; // O(1)
    int length = list.length();
    for (int i = 0; i < length; i++) { // O(n)
      if(i==index){
        item.data = value;
      }
      item = item.next; // O(1)
    }
  } // Algorithmic Complexity = O(n)

  public static void remove(LinkedList list, int index) {

    LinkedList.Node item = list.head; // O(1)
    if (index == 0) { // O(1)
      list.head = list.head.next; // O(1)
    }
    for (int i = 0; i < index - 1; i++) { // O(n)
      item = item.next; // O(1)
    }
    if (item.next.next == null) { // O(1)
      item.next = null; // O(1)
    } else { // O(1)
      item.next = item.next.next; // O(1)
    }
  } // Algorithmic Complexity = O(n)

  public static LinkedList reverse(LinkedList list) {
    // LinkedList reversedList = new LinkedList(); // O(1)
    // LinkedList.Node item = list.head; // O(1)
    // int length = list.length();
    // for (int i = 0; i < length; i++) { // O(n)
    //   reversedList.prepend(item.data); // O(1)
    //   item = item.next; // O(1)
    // }
    // return reversedList; // O(1)
    LinkedList.Node item = list.head; // O(1)
    int length = list.length();
    int counter = 0;
    for (int i = 0; i < length; i++) { // O(n)
      list.prepend(item.data); // O(1)
      counter++;
      remove(list, counter);
      item = item.next; // O(1)
    }
    return list; // O(1)
  } // Algorithmic Complexity = O(n)

  public static boolean isSortedAscending(LinkedList list) {
    LinkedList.Node item = list.head; // O(1)
    while (item.next != null) { // O(n)
      if (item.data < item.next.data) { // O(1)
        item = item.next; // O(1)
      } else { // O(1)
        return false; // O(1)
      }
    }
    return true; // O(1)
  } // Algorithmic Complexity = O(n)

  // Linked List practice
  // Write .get
  // Write .set
  // Write method to delete index
  // Reverse linked list
  // Is linked list sorted?
  // Find algorithmic complexity of each solution

  private App() {}
}
