import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
public static void main(String[] args) {
	List<Integer>  l = new ArrayList ();
	for(int i =0;i<=10;i++) {
		l.add(i);
	}
	Iterator i = l.iterator();
	while(i.hasNext()) {
		Integer I=(Integer)i.next();
		if(I%2==0) {
			i.remove();
		}
		else
			System.out.println(I);
	}
}
}
