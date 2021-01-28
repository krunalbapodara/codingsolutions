package com;

/***
 * implement stack for O(1) searching minimum number
 */
import java.util.Stack;

public class StackMin {
	Stack<Integer> s;
	Integer minEle;

	StackMin() {
		s = new Stack<Integer>();
	}

	void getMin() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Min ele in stack is " + minEle);
		}
	}

	void peek() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		} else {
			Integer t = s.peek();
			System.out.println("Top most element is: ");
			if (t < minEle) {
				System.out.println(minEle);
			} else {
				System.out.println(t);
			}
		}
	}

	void pop() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		} else {
			System.out.println("Top most element removed");
			Integer t = s.pop();

			if (t < minEle) {
				System.out.println(minEle);
				minEle = 2 * minEle - t;
			} else {
				System.out.println(t);
			}
		}
	}

	void push(Integer x) {
		if (s.isEmpty()) {
			minEle = x;
			s.push(x);
			System.out.println("Number inserted: "+x);
		} else {
			if(x < minEle) {
				s.push(2*x - minEle);
			} else {
				s.push(x);
			}
			System.out.println("Number inserted: "+x);
		}
	}
	
	public static void main(String[] args) {
		StackMin p = new StackMin();
		
		p.push(3);
		p.push(5);
		p.getMin();
		p.push(2);
	}
}