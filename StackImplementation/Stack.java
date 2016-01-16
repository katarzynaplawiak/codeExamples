package StackImplementation;

import java.util.Arrays;

public class Stack {
	private String[] stackArray;
	private int sizeOfStack;
	private int topOfStack=-1;
	
	public Stack(int size){
		 sizeOfStack = size;
		 stackArray = new String[size];
		 
		 //filled the array with -1 for an easier display(not necessary)
		 Arrays.fill(stackArray,"-1");
	}

	
	public static void main(String[] args){
		Stack MyStack = new Stack(5);
		MyStack.push("3");
		MyStack.push("2");
		MyStack.push("5");
		MyStack.push("6");
		MyStack.push("7");
		MyStack.push("8");
		MyStack.peek();
		MyStack.pop();
		MyStack.peek();
		MyStack.pop();
		MyStack.pop();
		MyStack.pop();
		MyStack.pop();
		MyStack.peek();
		MyStack.push("7");
		MyStack.peek();
		
		
		
	}
	
	//push the item onto the stack
	public void push(String item) {
		
		if(topOfStack +1 <sizeOfStack){
			topOfStack++;
			stackArray[topOfStack]=item;
			System.out.println("PUSH " + stackArray[topOfStack]+ " was added to the stack");
			displayStack();
		
		}
		else{
			System.out.println("Can't push onto the full stack");
		}
		
	}
	
	
	public void displayStack() {
		for(int i = 0; i < sizeOfStack; i++){
			if(stackArray[i]!="-1"){
				System.out.print(stackArray[i] + "  ");
			}
		}
		System.out.println();
		
	}


	//check the last item and remove it
	public String pop() {
		if(!isEmpty()){
			System.out.println("POP "+ stackArray[topOfStack]+ " was removed from the stack");
			stackArray[topOfStack]="-1";
			//return and then decrement topOfStack count
			return stackArray[topOfStack--];
		}
		else{
			System.out.println("The stack is empty");
			return "-1";
		}
		
	}
	
	//check the last element without removing it
	public String peek() {
		if(!isEmpty()){
		System.out.println("PEEK "+ stackArray[topOfStack]+ " is at the top of the stack");
		return stackArray[topOfStack];
		}
		else{
			System.out.println("The stack is empty");
			return "-1";
		}
	}
	
	//check if the stack is empty
	public boolean isEmpty() {
		return topOfStack < 0;
	}
	
	//return the size of the stack
	public int size() {
		return topOfStack+1;
	}
	
	
}
