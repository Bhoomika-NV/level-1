import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorFDEmo {
public static void main(String[] args) {
	List li = new ArrayList();
	for(int i =0;i<=5;i++) {
		li.add(i);
	}
	ListIterator i = li.listIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
