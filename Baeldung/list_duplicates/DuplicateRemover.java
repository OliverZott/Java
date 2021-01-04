package list_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * https://www.baeldung.com/java-remove-duplicates-from-list
 * 
 * @author HAL9000
 *
 */
public class DuplicateRemover {

	public void showCollection(int[] collectionToShow) {
		for (int collectionItem : collectionToShow) {
			System.out.println(collectionItem);
		}
	}

	/**
	 * Remove duplicates by using plain Java HashSet conversion
	 * 
	 * @param collection
	 * @return
	 */
	static List<Integer> removeDuplicatesByUsingHashSet(List<Integer> collection) {

		// List listWithDuplicates = Arrays.asList(collection);
		System.out.println("List with duplicates: " + collection + " of type: " + collection.getClass().getName());

		List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(collection));
		System.out.println("List without duplicates: " + listWithoutDuplicates + " of type: "
				+ listWithoutDuplicates.getClass().getName());
		return listWithoutDuplicates;
	}

	/**
	 * Remove duplicates by using Google-Guava library
	 * https://github.com/google/guava
	 * 
	 * 
	 * @param collection
	 * @return
	 */
	static List<Integer> removeDuplicatesByUsingGuava(List<Integer> collection) {

		// List listWithDuplicates = Arrays.asList(collection);
		System.out.println("List with duplicates: " + collection + " of type: " + collection.getClass().getName());

		List<Integer> listWithoutDuplicates = Lists.newArrayList(Sets.newHashSet(collection));
		return listWithoutDuplicates;
	}

	static List<?> removeDuplicatesByJavaStream(List<?> collection) {

		// List listWithDuplicates = Arrays.asList(collection);
		System.out.println("List with duplicates: " + collection + " of type: " + collection.getClass().getName());

		List<?> listWithoutDuplicates = collection.stream().distinct().collect(Collectors.toList());
		System.out.println("List with duplicates: " + listWithoutDuplicates + " of type: " + listWithoutDuplicates.getClass().getName());

		return listWithoutDuplicates;
	}

	public static void main(String[] args) {

		List<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 0, 3, 4, 0, 1, 1));

		// List<Integer> newList =
		// DuplicateRemover.removeDuplicatesByUsingHashSet(listWithDuplicates);
		// List<Integer> newList =
		// DuplicateRemover.removeDuplicatesByUsingGuava(listWithDuplicates);
		List<Integer> newList = (List<Integer>) DuplicateRemover.removeDuplicatesByJavaStream(listWithDuplicates);

		/*
		 * Three types of outputs for ArrayList-Object
		 */
		System.out.println("Iterating1 - List without duplicates: ");
		for (Integer listItem : newList) {
			System.out.println(listItem);
		}

		System.out.println("Iterating2 - List without duplicates: ");
		for (int i = 0; i < newList.size(); i++) {
			System.out.println(newList.get(i));
		}

		System.out.println("Stream-output - List without duplicates: ");
		newList.stream().forEach(v -> System.out.println(v));
	}
}
