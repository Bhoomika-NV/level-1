package listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*Input: List = [1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]
Output: List = [1, 10, 2, 3, 4, 5]

Input: List = ["G", "e", "e", "k", "s"]
Output: List = ["G", "e", "k", "s"]*/
public class RemoveArrayListDuplicates {
	public static void main(String[] args) {
		stringList();
		integerList();
		reverseArrayList();
		reverseUsingThe_reverseMethod();
	}

	private static void reverseUsingThe_reverseMethod() {
         List<Integer> list= new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,1));
         Collections.reverse(list);
         System.out.println(list);
	}

	private static void reverseArrayList() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,1));
		//reverse list without another array using another array
		int start=list.get(0);
		int end=list.size()-1;
             while(start<end) {
    	         start=list.set(start,list.get(end));
    	         end=list.set(start,list.get(start));
    	         start++;
    	         end--;
      }
      for(Integer i: list) {
    	  System.out.print(i+" ");
      }
	}

	private static void stringList() {
		List<String> list = Arrays.asList("G", "e", "e", "k", "s");
		List<String> duplicate = new ArrayList<String>();
		for (String s : list) {
			if (!duplicate.contains(s)) {
				duplicate.add(s);
			}
		}
		System.out.println(duplicate);
	}

	private static void integerList() {
		List<Integer> list = Arrays.asList(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5);
		List<Integer> duplicates = new ArrayList<Integer>();
		for (Integer i : list) {
			if (duplicates.contains(i) == false) {
				duplicates.add(i);
			}
		}
		System.out.println(duplicates);
	}
//Reverse the elements of the arrayList()

}
