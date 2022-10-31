package test;

import java.util.Arrays;

class Node{
	public int data;
	public Node next; 
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class Linkedlist{
	
	Node head = null;
	
	private int size = 0;
	
	public void add(int data) {
		Node newNode=new Node(data);
		size = size() + 1;
		if(head==null) {
			head = newNode;
		}else {
			Node last = head;
			while(last.next !=null)
				last=last.next;

			last.next=newNode;				
	}
}
	public void print_list() {
		Node curr= head;
		System.out.print("[");
		
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.print("]\n");
	}
	
	
	
	public int size() {
		return size;
	}
	


}



public class Ques5 {
		public static void main(String[] args) {
		
		Linkedlist lk = new Linkedlist();
		
		lk.add(2);
		lk.add(7);
		lk.add(4);
		lk.add(3);
		lk.add(5);
		
		
		lk.print_list();
		
		int arr[] = sortBy(lk.head,lk.size());
		
		System.out.println(Arrays.toString(arr));
		
		lk.print_list();
		

	}
	public static int[] sortBy(Node curr , int size) {
	
		int arr[]= new int[size];
		int idx=0;
		
		while(curr.next!=null) {
			int skip =0, max=curr.data;
			boolean found = false;
			
			Node temp = curr.next;
			
			while(temp!=null) {
				skip++;
				if(max < temp.data) {
					max=temp.data;
					found=true;
					break;
				}
				temp=temp.next;
			}
			
			if(found) {
				while(skip-->0) 
					arr[idx++]=max;
				
				curr = temp;
				
			}else {
				arr[idx++]=max==curr.data? 0 : max;
				curr=curr.next;
			}
				
		}
			
		return arr;
		
	}

}
