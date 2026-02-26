import java.util.*;

public class Queue {
	public static void main(String[] args) {
		Q q = new Q();
		q.enqueue(3);	
		q.enqueue(4);
		q.enqueue(2);	
		q.enqueue(7);	
		q.enqueue(1);
		
		q.display();	
		q.dequeue();
		q.dequeue();
		q.display();	
		System.out.println(q.front());
	}
}

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Q {
	Node root = null;
	public boolean isEmpty() {
		return root == null;
	}

	public void enqueue(int x) {
		Node newNode = new Node(x);
		if (root == null) {
          	        root = newNode;
           	        return;
                }
		Node temp = root;
       	while (temp.next != null) {
            		temp = temp.next;
        	}
        	temp.next = newNode;
    	}

	
	public void dequeue() {
        	if (isEmpty()) {
            		System.out.println("Queue is empty");
            		return;
        	}

        	System.out.println("Removed: " + root.data);
        	root = root.next;
        	System.out.println();
    	}
    	
    	public void display() {
        	if (isEmpty()) {
            		System.out.println("Queue is empty");
            		return;
        	}

        	Node temp = root;
        	while (temp != null) {
            		System.out.print(temp.data + " -> ");
            		temp = temp.next;
        	}
        	System.out.println();
        }
        
        public int front() {
        	if (isEmpty()) {
            		System.out.println("Queue is empty");
            		return -1;
        	}
        	
        	return root.data;       	
        }

}










