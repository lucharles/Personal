package studio3;

import java.util.LinkedList;
import java.util.List;

import studio2.lists.ListNode;

public class UnorderedList<T extends Comparable<T>> implements PriorityQueue<T> {

	public LinkedList<T> list;
	
	public UnorderedList() {
		list = new LinkedList<T>();
	}
	
	@Override
	public boolean isEmpty() {
		if (list.peekFirst() == null) {
			return true;
		}
				
		//
		return false;
	}

	@Override
	public void insert(T thing) {
		list.addFirst(thing);
		// 
		//
	}

	@Override
	public T extractMin() { 
		T min = list.getFirst();
		for (T l:list) {
			if(l.compareTo(min)<0) {
				min = l;
			}
		}
		list.remove(min);
		return min;
	}
	

}
