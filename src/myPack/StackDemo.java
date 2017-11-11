package myPack;

import java.util.ArrayList;

interface Stack{
	
	void push(int i);
	
	int pop();
	
}

class FixedStack implements Stack{
	
	int size;
	int[] stack; 
	int stackPointer;
	
	public FixedStack(int stackSize)
	{
		this.size = stackSize;
		stack = new int[size];
		stackPointer = -1;
	}

	public void push(int i)
	{
		if(stackPointer < size -1)
		{
			stackPointer++;
			stack[stackPointer] = i;	
			System.out.println("Pushed Integer: " + i +" at: " + stackPointer);

		}
		
		else
		{
			System.out.println("Stack Overflow");
		}
		
	}
	
	public int pop()
	{
		System.out.println("StackPointer at: " + stackPointer);

		int poppedInteger = stack[stackPointer];
		stackPointer--;

 		return  poppedInteger;
	}
}
class VariableStack implements Stack{
	
	int size;
	ArrayList<Integer> stack; 
	int stackPointer;
	
	public VariableStack(int stackSize)
	{
		this.size = stackSize;
		stack = new ArrayList<Integer>(size);
		stackPointer = 0;
	}

	public void push(int i)
	{
		stack.add(i); 
		System.out.println("Pushed Integer: " + i +" at: " + stack.lastIndexOf(i));
	}

	public int pop()
	{
		int poppedInteger = stack.remove(stackPointer);
 		return poppedInteger;
	}

}

public class StackDemo{
	
	public static void main(String args[]){
		
		FixedStack fixedStack = new FixedStack(2);
		
		VariableStack variableStack = new VariableStack(2);
		
		System.out.println("\n-----Fixed Stack-----");
		fixedStack.push(10);
		fixedStack.push(20);
		fixedStack.push(30);
		fixedStack.push(10);
		System.out.println(" Popped the integer " + fixedStack.pop());
		System.out.println(" Popped the integer " + fixedStack.pop());

		System.out.println("\n-----Variable Stack-----");

		variableStack.push(10);
		variableStack.push(20);
		variableStack.push(30);
		variableStack.push(10);
		System.out.println(" Popped the integer " + variableStack.pop());
		System.out.println(" Popped the integer " + variableStack.pop());
		System.out.println(" Popped the integer " + variableStack.pop());
		System.out.println(" Popped the integer " + variableStack.pop());
 
  	}
}
