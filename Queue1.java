import java.util.*;

//James Michael
public class Queue1<E> {
	private LinkedList<E> queue;

	public Queue1() {
		queue = new LinkedList<E>();
	}
	
	//Adds a new element to the back of the queue.	
	public void add(E e) {
		queue.addLast(e);
	}	

	//Shows the element at the front of the queue.
	public E front() {
		return queue.peekFirst();
	}
	
	//Shows the element at the back of the queue.	
	public E back() {
		return queue.peekLast();
	}

	//Removes the element at the front of the queue.
	public void dequeue() {
		queue.remove();
	}

	//Shows the size of the queue.
	public int length() {
		return queue.size();
	}

	//Checks if a certain element is inside the queue.
	public boolean contains(E e) {
		if (queue.contains(e)) {
			return true;
		}
		return false;
	}

	//Reverses the order of the queue.
	//Uses the reverse method found in Collections.
	public void reverse() {
		Collections.reverse(queue);
	}

	//Randomises the order of elements inside the queue.
	//Uses the shuffle method found in Collections.
	public void randomise() {
		Collections.shuffle(queue);
	}

	public String toString() {
		return "Queue: " + queue.toString();
	}
}