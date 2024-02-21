package carparkmanagementsystem.dataStructures;

public class Heap{
	int array[];
	int capacity;
	public int size;
	//parent  = (index-1)/2
	//left child = index*2+1
	//right child = index*2+2
	public Heap(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
		size = 0; 
	}
	public void insert(int data) {
		if(size>=capacity) {
			grow();
		}
		array[size] = data;
		size++;
		int i = size-1;
		while(i>0 && array[i]<array[(i-1)/2]) {
			int temp = array[i];
			array[i] = array[(i-1)/2];
			array[(i-1)/2] = temp;
			i = (i-1)/2;
		}
	}
	public int delete() {
		if(size<=0) {
			return -1;
		}
		int temp = array[0];
		array[0] = array[size-1];
		size--;
		int i=0;
		while(i<=size) {
			int min = i;
			if((i*2+1)<=size && array[i*2+1]<array[min]) {
				min = i*2+1;
			}
			if((i*2+2)<=size && array[i*2+2]<array[min]) {
				min = i*2+2;
			}
			int t = array[i];
			array[i] = array[min];
			array[min] = t;
			
			if(i==min) {
				break;
			}
			else {
				i = min ;
			}
		}
		if(size<=capacity/2) {
			shrink();
		}
		return temp;
	}
	public int peek() {
		if(size<=0) {
			return -1;
		}
		return array[0];
	}
	public void grow() {
		if(capacity==0) {
			capacity=1;
		}
		capacity = capacity*2;
		int temp[]=new int[capacity];
		for(int i=0;i<size;i++) {
			temp[i] = array[i];
		}
		array=temp;
	}
	public void shrink() {
		capacity = capacity/2;
		int temp[]=new int[capacity];
		for(int i=0;i<size;i++) {
			temp[i] = array[i];
		}
		array=temp;
	}
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
	}
                        public boolean find(int number){
                            for(int i=0;i<size;i++){
                                if(array[i]==number){
                                    return true;
                                }
                            }
                            return false;
                        }
}
