public class Test {
	public static void main(String[] args) {
		//Creates two separate instances of the queue, one Integer and one String.
		Queue1<Integer> queueInt = new Queue1<Integer>();
		Queue1<String> queueString = new Queue1<String>();
		
		//Demonstration of the Integer queue.
		System.out.println("Integer Queue:");
		queueInt.add(new Integer(1));
		queueInt.add(new Integer(2));
		queueInt.add(new Integer(3));
		queueInt.add(new Integer(4));
		System.out.println(queueInt.toString());
		System.out.println("*Front of Queue: " + queueInt.front());
		System.out.println("*Back of Queue: " + queueInt.back());
		System.out.println("*Length of Queue: " + queueInt.length());
		System.out.println("*Queue Contains '16'? "+ queueInt.contains(16));
		System.out.println("*Queue Contains '3'? " + queueInt.contains(3));

		queueInt.dequeue();
		System.out.println("\nFront Element Dequeued...");
		System.out.println(queueInt.toString());
		System.out.println("Front of Queue: " + queueInt.front());
		System.out.println("Length of Queue: " + queueInt.length());
		
		queueInt.reverse();
		System.out.println("\nQueue Reversed...");
		System.out.println(queueInt.toString());
		System.out.println("*Front of Queue: " + queueInt.front());
		System.out.println("*Back of Queue: " + queueInt.back());

		queueInt.randomise();
		System.out.println("\nQueue Randomised...");
		System.out.println(queueInt.toString());
		System.out.println("*Front of Queue: " + queueInt.front());
		System.out.println("*Back of Queue: " + queueInt.back());

		//Demonstration of the String queue.
		System.out.println("\n*****************************");
		System.out.println("\nString Queue:");
		queueString.add("Hello");
		queueString.add("World");
		queueString.add("Queue");
		queueString.add("Test");
		System.out.println(queueString.toString());
		System.out.println("*Front of Queue: " + queueString.front());
		System.out.println("*Back of Queue: " + queueString.back());
		System.out.println("*Length of Queue: " + queueString.length());
		System.out.println("*Queue Contains 'Testing'? "+ queueString.contains("Testing"));
		System.out.println("*Queue Contains 'Test'? " + queueString.contains("Test"));

		queueString.dequeue();
		System.out.println("\nFront Element Dequeued...");
		System.out.println(queueString.toString());
		System.out.println("Front of Queue: " + queueString.front());
		System.out.println("Length of Queue: " + queueString.length());
		
		queueString.reverse();
		System.out.println("\nQueue Reversed...");
		System.out.println(queueString.toString());
		System.out.println("*Front of Queue: " + queueString.front());
		System.out.println("*Back of Queue: " + queueString.back());

		queueString.randomise();
		System.out.println("\nQueue Randomised...");
		System.out.println(queueString.toString());
		System.out.println("*Front of Queue: " + queueString.front());
		System.out.println("*Back of Queue: " + queueString.back());
	}
}