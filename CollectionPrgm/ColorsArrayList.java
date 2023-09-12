package CollectionPrgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColorsArrayList {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Black");
		ar.add("Blue");
		ar.add("White");
		ar.add("Red");
		ar.add("Yellow");
		System.out.println(ar);
	
//		iterating through the loop
		Iterator itr = ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
//		insert an element at the 1st position
		ar.add(0, "Purple");
		ar.add(4, "Orange");
		
		for(String lst:ar) {
			System.out.println(lst);
		}
		System.out.println();
		
//		Retrieve elements from ArrayList
		String ele = ar.get(0);
		System.out.println("First element -- "+ele);
		ele = ar.get(4);
		System.out.println("Fifth element -- "+ele);
		System.out.println();
		
//		Updating an element
		ar.add(2, "Green");
		ar.add(4, "Indigo");
		System.out.println(ar);
		
//		remove an element
		ar.remove(2);
		ar.remove(5);
		System.out.println(ar);
		System.out.println();
		
//		Search for an element
		String clr = "Black";
		if(ar.contains(clr)) {
			System.out.println(clr+" color is found");
		}else {
			System.out.println(clr+" color is not found");
		}
	    System.out.println();
		
//		Sorting the ArrayList
	    System.out.println("Before Sorting "+ar);
		Collections.sort(ar);
		System.out.println("After Sorting "+ar);
		
//		Copying one list to another
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.addAll(ar);
		System.out.println("\n"+ar2);

//		Shuffle elements of 
		Collections.shuffle(ar);
		System.out.println("\n"+ar);
		
//		reverse an ArrayList
		System.out.println("\nBefore Reverse "+ar);
		Collections.reverse(ar);
		System.out.println("After Reverse "+ar);
	
//		extract the portion of the list
		List<String> Sub = ar.subList(2, 6);
		System.out.println("\n"+Sub);
		
//		Compare two arrayList
		System.out.println("\n"+ar);
		ar2.remove(2);
		System.out.println(ar2);
		if(ar2.containsAll(ar)) {
			System.out.println("Both List are equal");
		}else {
			System.out.println("Both List are unequal");
		}
		
//		list is empty or not
		System.out.println("\nlist1 is empty --  "+ar.isEmpty());
		
//		trim to size
		ar.trimToSize();
		System.out.println("\noriginal capacity -- "+ar);
	
//		increase ArrayList size
		ar.ensureCapacity(8);
		ar.add("Neon");
		ar.add("Pink");
		ar.add("Green");
		ar.add("Orange");
		System.out.println("\nNew arraylist "+ar);
		System.out.println(ar.size());
		
//		replace the element
		ar.set(8, "Brown");
		System.out.println(ar);
		System.out.println();
		
//	    print elements using array position
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}
