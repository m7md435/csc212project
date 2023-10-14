import linklist.node;

public class linkedlistadt<T> {

	private node<T> head;
	private node<T> current;
	public linkedlistadt() {
		head=null;
		current=null;
	}
	public boolean isempty() {
		 if(head ==null) return true;
		 return false;
	 }
	 public boolean isfull() {
		 return false;
	 }
	 public void findfirst() {
		 current =head;
	 }
	 public boolean last() {
		 if(current.next !=null)
			 return false;
		 return true;
	 }
	 public void findnext() {
		 current=current.next;
	 }
	 public T retrieve() {
		 return current.data;
	 }
	 public void update(T e) {
		 current.data= e;
	 }
	 public void insert(T e) {
		 node<T> p=new node<T>(e);
		if(head==null) {
			head=p;
			current=p;
		}
		else
			p.next=current.next;
		  current.next =p;
		  current=p;
		 
	 }
	 public void remove() {
			if(current==head) {
				head=head.next;
				current=current.next;
			}
			else {
			 node<T> p=head;
			 while(p.next!=current) {
				 p=p.next;
				 
			 }
			 p.next =current.next;
			 if(current.next ==null) {
				 current=head;
			 }else {
				 current =current.next;
			 }
			}

				 
		 }
	 public boolean search(T v) {
		 node<T> p=head;
		 while(p!=null) {
			 if(p.data.equals(v))
				 return true;
			 else p=p.next;
		 }
		 return false;
	 }
	 public void display() {
		 node<T> p=head;
		 while(p!=null) {
			 System.out.print(p.data+" ");
			 p=p.next;
		 }
	 }
}
