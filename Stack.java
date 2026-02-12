import java.util.*;

public class Stack {

	static class Stk {
		int[] arr;
		int capacity;
		int top;
		
		Stk(int size) {
			arr = new int[size];
			capacity = size;
			top = -1; 		
		}
		
		void push(int x) {
			if (top == capacity-1) {
				System.out.println("Stack Overflow");
				return;
			}
			arr[++top] = x;	
			System.out.println("Element "+x+" is pushed Successfully...");	
		}
		
		void pop() {
			if(top == -1) {
				System.out.println("No elements present to remove");
				return;
			}	
			int y = arr[top--];
			System.out.println("Ooops "+y+" Element Popped...");
		}
		
		void peek() {
			if(top == -1) {
				System.out.println("Stack is empty");
				return;
			}
			System.out.println("Top Element: "+ arr[top]);
		}
		
		boolean isEmpty() {
			return top == -1;
		}
		
		boolean isFull() {
			return top == capacity-1;
		}
		
			
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of Stack: ");
		int size = sc.nextInt();
		System.out.println();
		
		Stk s = new Stk(size);
		
		while(true){
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Check IsFull");
			System.out.println("5. Check IsEmpty");
			System.out.println("6. Exit");
			System.out.print("Select operation: ");
			int n = sc.nextInt();
			System.out.println();
			
			switch(n) {
			case 1: System.out.print("Enter Element to push: ");
				int x = sc.nextInt();
				System.out.println();
				s.push(x);
				break;
			case 2: s.pop();
				break;
			case 3: s.peek();
				break;
			case 4: System.out.println(s.isFull());
				break;
			case 5: System.out.println(s.isEmpty());
				break;
			case 6: return;
			
			default: System.out.println("Invalid command");
				 break;				
			}
		}
		
	}
}

