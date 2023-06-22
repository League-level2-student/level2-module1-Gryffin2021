package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> beans = new ArrayList<String>();
		//2. Add five Strings to your list
		beans.add("Black Beans");
		beans.add("Pinto Beans");
		beans.add("Brown Beans");
		beans.add("Cocao Beans");
		beans.add("Lima Beans");
		int even_maker = 0;
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < beans.size(); i++){
			String s = beans.get(i);
			System.out.println(i + ": " + s);
		}
		//4. Print all the Strings using a for-each loop
		System.out.println(" ");
		for(String s : beans){
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println(" ");
		for(int i = 0; i < beans.size(); i++){
			String s = beans.get(i);
			even_maker = i++;
			System.out.println(even_maker + ": " + s);
		}
		//6. Print all the Strings in reverse order.
		System.out.println(" ");
		for(int i = beans.size() - 1; i > 0; i--){
			String s = beans.get(i);
			System.out.println(i + ": " + s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println(" ");
		for(int i = 0; i < beans.size(); i++){
			String s = beans.get(i);
		if(s.contains("e")) {
			System.out.println(i + ": " + s);
		}
		else {
			System.out.println(":( No bEans?");
		}
		}
	}
}
