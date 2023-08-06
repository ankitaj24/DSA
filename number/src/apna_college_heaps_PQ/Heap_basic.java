package apna_college_heaps_PQ;


//insert in min heap
import java.util.*;
public class Heap_basic {
	static class Heap{
		ArrayList<Integer> arr=new ArrayList<>();
		public void add(int data) {
			arr.add(data);
			
			int x=arr.size()-1;
			int parentIdx=(x-1)/2;
			while(arr.get(x)<arr.get(parentIdx)) {
				int temp=arr.get(x);
				arr.set(x, arr.get(parentIdx));
				arr.set(parentIdx, temp);
				x=parentIdx;
				parentIdx=(x-1)/2;
			}
		}
		public int peek() {
			return arr.get(0);
		}
		
		private void heapify(int i) {
			int left=2*i+1;
			int right=2*i+2;
			int min=i;
			if(left<=arr.size()-1&&arr.get(min)>arr.get(left))
				min=left;
			if(right<=arr.size()-1&&arr.get(min)>arr.get(right))
				min=right;
			if(min!=i) {
				int temp=arr.get(i);
				arr.set(i, arr.get(min));
				arr.set(min, temp);
				heapify(min);
			}
		}
		
		public int remove() {
			int data=arr.get(0);
			//swapping of last and first element of arraylist
			int temp=arr.get(0);
			arr.set(0, arr.get(arr.size()-1));
			arr.set(arr.size()-1, temp);
			
			//removing the last min element
			arr.remove(arr.size()-1);
			
			//now fix the minimum heap tree
			heapify(0);
			return data;
		}
		public boolean isEmpty() {
			return arr.size()==0;
		}
	}
	public static void main(String args[]) {
		Heap h=new Heap();
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		while(!h.isEmpty()) {
			System.out.println(h.peek());
			h.remove();
		}
	}
}

