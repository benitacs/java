package pOne;

import java.util.ArrayList;

//MIN HEAP

public class Heap {
	ArrayList<Integer> heapArr = new ArrayList<>();
	
	private int HeapSize() {
		int size = heapArr.size();
		if(size >0) {
			return size;
		}
		return -1;
	}
	
	private int ParentIndex(int index) {
		int parentIn = (index -1)/2;
		if(parentIn >= 0) {
			return parentIn;
		}else {
			return -1;
		}
	}
	
	private int LeftChildIndex(int index) {
		int leftIn = (index*2) + 1;
		
		if(leftIn < HeapSize()) {
			return leftIn;
		}else {
			return -1;
		}
	}
	
	private int RightChildIndex(int index) {
		int rightIn = (index*2) + 2;
		if(rightIn < HeapSize()) {
			return rightIn;
		}
		return -1;
	}
	
	//MIN HEAP
	private void heapifyDown(int index) {
		int left = LeftChildIndex(index);
		int right = RightChildIndex(index);
		int valueInIndexToMove  = index;
		
		if (left >=0 && right >=0) {
			if( heapArr.get(index) > heapArr.get(left)
					&& heapArr.get(right) > heapArr.get(left)) {
				valueInIndexToMove = left;
			}else if(heapArr.get(index) > heapArr.get(right)
					&& heapArr.get(left) > heapArr.get(right)) {
				valueInIndexToMove = right;
			}
		}
		
		// If there is only one leaf - no right leaf
		if(left >=0 && heapArr.get(left)< heapArr.get(index)) {
			valueInIndexToMove = left;
		}
		
		if(valueInIndexToMove != index) {
			int temp = heapArr.get(index);
			heapArr.set(index, heapArr.get(valueInIndexToMove));
			heapArr.set(valueInIndexToMove, temp);
			heapifyDown(valueInIndexToMove);
		}
		
	}
	//MIN HEAP
	private void heapifyUp(int index) {
		int parentIndex = ParentIndex(index);
		
		if(parentIndex >=0 && heapArr.get(parentIndex)> heapArr.get(index)) {
			int temp = heapArr.get(index);
			heapArr.set(index, heapArr.get(parentIndex));
			heapArr.set(parentIndex, temp);
			heapifyUp(parentIndex);
		}

	}
	
	public void Insert(int value) {
		heapArr.add(value);
		heapifyUp(HeapSize()-1);
	}
	
	
	public void Display() {
		if(HeapSize() >0) {
			System.out.println(" Heap DS - Display");
			for(int i=0;i<HeapSize();i++) {
				System.out.print(" "+heapArr.get(i));
			}
		}
		System.out.println("");
	}
	
	public void DeleteMin() {
		if(HeapSize()<=0 ) {
			System.out.println("Heap is empty");
		}else {
			
		int minValue = heapArr.get(0);
		System.out.println("Minium value "+minValue+" is Deleted");
		heapArr.set(0, heapArr.get(HeapSize()-1));
		heapArr.remove(HeapSize()-1);
		heapifyDown(0);
		}
	}
	
	public void ExtractMin() {
		if(HeapSize()>0) {
			System.out.println("Min Value= "+heapArr.get(0));
		}else {
			System.out.println("Heap is empty"); 
		}
	}
	

}
