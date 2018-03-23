/**
 * 
 */
package collection.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @description:
 * @author: Admin
 * @time: 9:46:38 PM
 * @date: Mar 7, 2018
 */
public class Main {
	/**
	 * @description: start program
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 7, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 7, 2018
	 * @exception:
	 * @param strings
	 */
	public static void main(String... strings) {

		ArrayList<String> list = new ArrayList<String>();

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("PHP");
		arrayList.add("Python");
		arrayList.add("Java");
		arrayList.add("C++");
		System.out.println("Các phần tử của ArrayList");
		System.out.print("\t" + arrayList + "\n");

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("PHP");
		linkedList.add("Python");
		linkedList.add("Java");
		linkedList.add("C++");
		System.out.println("Các phần tử của LinkedList");
		System.out.print("\t" + linkedList + "\n");

		// new TreeSet() sẽ sắp xếp các phần tử
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("PHP");
		hashSet.add("Python");
		hashSet.add("Java");
		hashSet.add("Java");
		hashSet.add("C++");
		System.out.println("Các phần tử của Set");
		System.out.print("\t" + hashSet + "\n");

		// new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Windows", "2000");
		hashMap.put("Windows", "XP");
		hashMap.put("Language2", "Java");
		hashMap.put("Language1", ".Net");
		System.out.println("Các phần tử của Map");
		System.out.println("\t" + hashMap);

		// test IteratorCollection
		System.out.println("test IteratorCollection");
		IteratorCollection iteratorCollection = new IteratorCollection();
		iteratorCollection.runIteratorCollection();
		System.out.println();

		// testArrayListInJava
		System.out.println("test ArrayListInJava");
		ArrayListInJava arrayListInJava = new ArrayListInJava();
		arrayListInJava.showArrayListInJava();
	}

}
