import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class MaxInVector {
public static void main(String[] args) {
	Vector<Integer> v= new Vector<Integer>();
	v.add(12);
	v.add(23);
	v.add(54);
	v.add(98);
	v.add(97);
	int max=Collections.max(v);
	System.out.println("Vector elements are :");
	Iterator i = v.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+" ,");
	}
	System.err.println();
	System.out.println(max+" is the max in the vector");
	System.out.println(Collections.min(v)+" is the minimun element");
	System.out.println(v.firstElement()+" is the 1st element");
	System.out.println(v.lastElement());
}
}
