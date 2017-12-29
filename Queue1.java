import java.util.*;

//James Michael 788456
public class Queue1<E> {
	/*I was originally using ArrayDeque to complete this, but realised
	 *after looking at the Java documentation that LinkedList would be 
	 *more useful for reversing and randomising, since it can use these
	 *methods from 'Collections'.
	 */
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

		/*This is the code I was originally using
		 *with an ArrayDeque.
		 *It adds the elements again in reverse order and then
		 *removes the original elements.
		 *
		 *int queueSize = length();
		 *for (E e : list) {
		 *	list.addFirst(e);
		 *}
		 *int newQueueSize = length();
		 *for (int i = queueSize; i < newQueueSize; i++) {
		 *	list.removeLast();
		 *}
		 */
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