
import java.util.*;

public class Test1 {

	public static void main(String[] args) {

		List<String> meeting = new ArrayList<>();

		meeting.add("1 2");
		meeting.add("3 4");
		meeting.add("5 9");		
		meeting.add("8 9");
		meeting.add("5 9");
		

		int count = 0;
		List<Integer> startTime = new ArrayList<Integer>();
		List<Integer> endTime = new ArrayList<Integer>();
		for (String s : meeting) {
			String start = s.substring(0, s.indexOf(" "));
			String end = s.substring(s.indexOf(" ") + 1);

			startTime.add(Integer.parseInt(start));
			endTime.add(Integer.parseInt(end));

		}

		Collections.sort(startTime);
		Collections.sort(endTime);

		Iterator<Integer> i = startTime.listIterator();
		Iterator<Integer> j = endTime.listIterator();
		int a = 0, b = 0;

		System.out.println(startTime);
		System.out.println(endTime);

		int iteration = 1;
		while (i.hasNext() && j.hasNext()) {

			if (iteration == 1) {
				a = i.next();
				b = j.next();
				if (a < b) {
					count++;
					a = b;
				}

			} else {
				b = i.next();
				if (a < b) {
					a = j.next();
				} else {
					count++;
				}
			}
			iteration++;
		}

		System.out.println(count);
		

	}

}
