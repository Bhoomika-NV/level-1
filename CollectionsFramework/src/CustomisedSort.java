import java.util.TreeSet;

public class CustomisedSort {
public static void main(String[] args) {
	Mycomparator m = new Mycomparator();
	TreeSet s = new TreeSet(m);
	s.add("Bhoomi");
	s.add("Manu");
	s.add("Krishna");
	s.add("Sahana");
	s.add("Baalu");
	s.add(2);
	
	System.out.println(s);
}
}
