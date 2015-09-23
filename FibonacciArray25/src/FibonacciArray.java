
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * author: Gothbag <josemariacagigalso@gmail.com>
 * This represents a an array with a Fibonacci sequence
 */

public class FibonacciArray {
	
	public static void main(String[] args) {
		List<Integer> fibo = new ArrayList<>(25);
		fibo.add(0, 0);
		fibo.add(1, 1);
		//we assign values to each element of the array
		for (int i=2; i < 25; i++) {
			//each element is the addition of the two previous numbers
			fibo.add(i, fibo.get(i-1) + fibo.get(i-2) );
		}
		//we print out the array the "regular" way
		for (int i=0; i < 25; i++) {
			System.out.print(fibo.get(i) + " ");
		}
		System.out.println();
		//now we use a Java "for each" loop
		for (Integer iFi : fibo) {
			System.out.print(iFi + " ");
		}
		System.out.println();
		//now we employ an iterator
		ListIterator<Integer> fibIt = fibo.listIterator();
		while (fibIt.hasNext()) {
			System.out.print(fibIt.next() + " ");
		}
		System.out.println();
		System.out.println("The position in the array of value 2584 is: " + fibo.indexOf(2584) + ".");
		if (fibo.indexOf(4311) >= 0) {
			System.out.println("Number 4311 can be found in position " + fibo.indexOf(4311) + " of the array.");
			
		} else {
			System.out.println("Number 4311 cannot be found in the array.");
			
		}
	}

}
