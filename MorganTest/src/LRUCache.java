
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;

public class LRUCache {
	
	static Deque<Integer> deque;
	static HashSet<Integer> set;
	static int csize;
	static int pageFault;

	LRUCache(int n) {
		deque = new LinkedList<>();
		set = new HashSet<>();
		csize = n;
		pageFault = n;
	}

	public void refer(int x) {
		if (!set.contains(x)) {
			if (deque.size() == csize) {
				int last = deque.removeLast();
				set.remove(last);
				pageFault++;
			}
		} else {
			int index = 0, i = 0;
			Iterator<Integer> itr = deque.iterator();
			while (itr.hasNext()) {
				if (itr.next() == x) {
					index = i;
					break;
				}
				i++;
			}
			deque.remove(index);
		}
		deque.push(x);
		set.add(x);
	}

	public static void main(String[] args) {
		LRUCache lr = new LRUCache(4);
		lr.refer(5);
		lr.refer(0);
		lr.refer(1);
		lr.refer(3);
		lr.refer(5);
		lr.refer(5);
		/*lr.refer(1);
		lr.refer(0);
		lr.refer(5);*/
		
		System.out.println(lr.pageFault);

		Iterator<Integer> itr = deque.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}
	


	
}
