package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	   public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> students=new LinkedList<String>();
		students.add("Jenifer");
		students.add("Bob");
		students.add("Mike");
		students.add("Nancy");
		students.add("Paul");
		students.remove();
		students.peek();
		students.poll();

		   Iterator it = students.iterator();
		   while (it.hasNext()){
		   	System.out.println(it.next());
		   }
		for(String Life: students){
			System.out.println("Names removed : "+students.remove()+"Peek Names :"+students.peek()+" Poll Names :"+students.poll());

		}


	}

}
