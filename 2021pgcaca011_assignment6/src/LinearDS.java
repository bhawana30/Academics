import java.util.Scanner;

public interface LinearDS {
	 int MAXSIZE = 10;
	void add(int x);
	void remove();
	void displayElement();
	
}
class MyStack{
	int arr[] = new int[10];
	int curr;
	
	MyStack(){
		
		curr=0;
	}
	
	void add(int x) {
		if(curr==10) {
			System.out.println("Stack overflow..");
		}else {
			arr[curr] = x;
			curr++;
			
			System.out.println("adding element successfully...");
		}
		displayElement();
	}
	void remove() {
		if(curr==-1) {
			System.out.println("Stack underflow..");
		}else {
			int x = arr[curr];
			
			curr--;
			System.out.println(x+" deleted successfully..");
		}
	displayElement();
	}
	void displayElement() {
		if(curr==-1) {
			System.out.println("Stack is empty..");
		}else {
			System.out.println("current Stack is: ");
			for(int i=curr-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
class MyQueue{
	int arr[] = new int[100];
	int front,rear;
	int size ;
	MyQueue(){
		
		front=0;
		rear =0;
		size =0;
	}
	
	void add(int x) {
		if(size==10) {
			System.out.println("queue overflow..");
		}else {
			arr[rear] = x;
			rear++;
			size++;
			
			System.out.print("adding element successfully...");
		}
		displayElement();
	}
	void remove() {
		if(size==0) {
			System.out.println("queue underflow..");
		}else {
			int x = arr[front];
			
			front++;
			size--;
			System.out.println(x+" deleted successfully..");
		}
	 displayElement();
	}
	void displayElement() {
		if(front>rear) {
			System.out.println("Stack is empty..");
		}else {
			System.out.println("current queue is: ");
			for(int i=front;i<rear;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
class prog3{
	public static void main(String [] args) {
		int choice,f;
			MyStack s = new MyStack();
			MyQueue q = new MyQueue();
			System.out.println("MENU\n1.Stack\n2.Queue");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			do {
			if(choice==1) {
				System.out.println("******Stack Menu********");
				System.out.println("1.push\n2.pop\n3.display");
				int c = sc.nextInt();
				switch(c) {
				case 1:{
					System.out.println("enter value: ");
					int x;x = sc.nextInt();
					s.add(x);
					break;
				}
				case 2:{
					s.remove();
					break;
				}
				case 3:{
					s.displayElement();
					break;
				}
				default:System.out.println("wrong choice");
				}
			}else if(choice==2) {
				System.out.println("******Queue Menu********");
				System.out.println("1.Add\n2.Remove\n3.Display");
				int c = sc.nextInt();
				switch(c) {
				case 1:{
					System.out.println("enter value: ");
					int x;x = sc.nextInt();
					q.add(x);
					break;
				}
				case 2:{
					q.remove();
					break;
				}
				case 3:{
					q.displayElement();
					break;
				}
				default:System.out.println("wrong choice");
				}
			}else
				System.out.println("wrong choice!!");
			System.out.print("do yu want to continue(0/1): ");
			f = sc.nextInt();
		}while(f==1);
	}
}