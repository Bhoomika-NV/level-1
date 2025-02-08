package listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*Input: List = [1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]
Output: List = [1, 10, 2, 3, 4, 5]

Input: List = ["G", "e", "e", "k", "s"]
Output: List = ["G", "e", "k", "s"]*/
public class RemoveArrayListDuplicates {
public static void main(String[] args) {
    // stringList();
     //integerList();
     reverseArrayList();
}

private static void reverseArrayList() {
	List<Integer>list = new ArrayList<Integer>(Arrays.asList(2,4,6,8,9,0));
    Integer start=0;
    Integer end=list.size()-1;
     
    while(start<end) {
    	int temp= list.get(start);
    	list.set(start,list.get(end));
    	list.set(end,temp);
    	start++;
    	end--;
    }
	System.out.println(list);
}

private static void stringList() {
List<String> list = Arrays.asList("G", "e", "e", "k", "s");
List<String> duplicate= new ArrayList<String>();
for(String s : list) {
	if(!duplicate.contains(s)) {
		duplicate.add(s);
	}
}
   System.out.println(duplicate);
}

private static void integerList() {
	List<Integer> list = Arrays.asList(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5);
	List<Integer> duplicates= new ArrayList<Integer>();
	for(Integer i : list) {
		if(duplicates.contains(i)==false) {
			duplicates.add(i);
		}
	}
	System.out.println(duplicates);
}
//Reverse the elements of the arrayList()

}
