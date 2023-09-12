package CollectionPrgm;

import java.util.ArrayList;

public class AddElements {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("Array1 is empty  "+arr.isEmpty());
		arr.add("Ram");
		arr.add("Seeta");
		arr.add("Hanuman");
		System.out.println("ArrayList1  "+arr);
		arr.add(2, "Ravan");
		System.out.println("ArrayList1  "+arr);

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Lashkman");
		ar2.add("Bharath");
		arr.addAll(ar2);
		System.out.println("ArrayList2  "+ar2);
		System.out.println("ArrayList1  "+arr);
		System.out.println("ArrayList1  "+arr);

		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Urmila");
		ar3.add("Dasharath");
		System.out.println("ArrayList3  "+ar3);
		arr.addAll(3,ar3);
		System.out.println("ArrayList1  "+arr);
		System.out.println();
		
		System.out.println("Remove Method");
		arr.remove("Ravan");
		System.out.println("ArrayList1 "+arr);
		arr.remove(2);
		System.out.println("ArrayList1 "+arr);
		arr.removeIf(str->str.contains("Dasharath"));
		System.out.println("ArrayList1 "+arr);
		arr.removeAll(ar2);
		System.out.println("ArrayList1 "+arr);
//		arr.removeAll(arr);
//		System.out.println("ArrayList1 "+arr);
//		arr.clear();
//		System.out.println("ArrayList1 "+arr);
		System.out.println();

		System.out.println("Retain Method");
		System.out.println("Array 1 " +arr);
		ar2.add("Ram");
		ar2.add("Seeta");
		System.out.println("Array 2 " +ar2);
		arr.retainAll(ar2);
		System.out.println("Array 1 " +arr);
		System.out.println();
		
		System.out.println("Array1 is empty  "+arr.isEmpty());

	}

}
