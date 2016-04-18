package com.toothless.binaryheap;

public class BinaryHeap {

	public int[] heap;
	public int heapsize;
	public int currsize = 0;

	public BinaryHeap(int size) {

		heapsize = size;
		heap = new int[heapsize];

	}

	public void insert(int data) {

		heap[currsize++] = data;
		minheap(currsize - 1);

	}

	public void minheap(int childind) {

		int tmp = heap[childind];
		int parentind = parent(childind);

		while ((childind > 0) && (tmp < heap[parentind])) {

			heap[childind] = heap[parentind];
			childind = parentind;
			parentind = parent(childind);

		}

		heap[childind] = tmp;

	}

	public int parent(int ind) {

		int pind;
		pind = ((ind - 1) / 2);
		return pind;

	}

	public void delete() {

		int value = 0;
		deletemin(value);

	}

	public void deletemin(int ind) {

		int temp = heap[ind];

		heap[ind] = heap[currsize - 1];
		currsize--;
		sinkify(ind);

	}

	public void sinkify(int ind) {

		int tmp = heap[ind];
		int childind;

		while (kthChild(ind, 1) < currsize) {

			childind = child(ind);
			if (heap[childind] < tmp) {
				heap[ind] = heap[childind];
			} else {
				break;
			}

			ind = childind;

		}

		heap[ind] = tmp;

		/**
		 * deleted one while((childind <= currsize) &&(tmp > heap[childind])){
		 * 
		 * heap[ind] = heap[childind]; ind = childind; childind =
		 * child(childind);
		 * 
		 * }
		 */

	}

	public int kthChild(int ind, int val) {

		int kthchild = 0;
		kthchild = (2 * ind) + val;

		return kthchild;

	}

	public int child(int ind) {

		int bestchild;

		if (heap[(ind * 2) + 1] < heap[(ind * 2) + 2]) {
			bestchild = (ind * 2) + 1;
		} else {
			bestchild = (ind * 2) + 2;
		}

		return bestchild;

	}

	public void printHeap() {

		for (int i = 0; i < currsize; i++) {
			System.out.println(heap[i]);
		}

	}

}
