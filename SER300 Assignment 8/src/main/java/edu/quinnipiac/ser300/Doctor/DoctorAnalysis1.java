
package edu.quinnipiac.ser300.Doctor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multiset;

import edu.quinnipiac.ser300.Doctor.DoctorHolder;

//Tyler Dresselhouse and Alex Baez

public class DoctorAnalysis1 {

	private ArrayList<DoctorHolder> list = new ArrayList<DoctorHolder>();
	private ListMultimap<Integer, Integer> multi;
	private Multiset<Double> set;

	public DoctorAnalysis1(String fileName) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File(fileName));
		int count = 0;

		while (scanner.hasNext()) {
			if (count > 1) {
				String s = scanner.nextLine();
				String[] boxes = s.split(",");
				list.add(new DoctorHolder(boxes[0], Integer.valueOf(boxes[1]), Integer.valueOf(boxes[2]),
					Double.valueOf(boxes[3]), Double.valueOf(boxes[4])));
			} else {
				@SuppressWarnings("unused")
				String extra = scanner.nextLine();
			}
			count++;
		}
		scanner.close();
	}

	public ArrayList<Integer> ranges() {

		ArrayList<Integer> result = new ArrayList<Integer>();

		int lessThanHalf = 0;
		int moreThanHalf = 0;
		set = HashMultiset.create();

		for (DoctorHolder item : list) {
			set.add(item.getHealth());
		}

		Set<Double> elements = set.elementSet();

		for (double i : elements) {
			if ((i > 0) && (i < 0.5)) {
				lessThanHalf = lessThanHalf + set.count(i);
			}
			if ((i > 0.5) && (i < 1)) {
				moreThanHalf = moreThanHalf + set.count(i);
			}
		}

		result.add(lessThanHalf);
		result.add(moreThanHalf);

		return result;
	}
	
	public double average() {

		multi = ArrayListMultimap.create();

		for (DoctorHolder i : list) {
			multi.put(i.getDoctors(), i.getChildren());
		}

		List<Integer> list2 = new ArrayList<Integer>();
		list2 = multi.get(4);
		double average = 0;
		double total = 0;

		for (int item : list2) {
			total = total + item;
		}

		average = (total / list2.size());

		return average;
	}
}
