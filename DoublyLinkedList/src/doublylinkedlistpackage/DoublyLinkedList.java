package doublylinkedlistpackage;

public class DoublyLinkedList {
	private Node head;
	
	public DoublyLinkedList() {
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		//If list is empty
		if(head==null)
		{
			head=newNode;
			return true;
		}
		//Locate last Node
		Node temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		newNode.setPrev(temp);;
		return true;
	}
	
	public boolean insertAtPosition(int data,int position) {
		Node newNode=new Node(data);
		if(position<=0 || (head==null && position>1))
		{
			return false;
		}
		if(position==1)
		{
			if(head!=null)
			{
			newNode.setNext(head);
		    head.setPrev(newNode);
			}
			head=newNode;
		    return true;
		}
	
		Node prev=head;
		for(int i=1;i<position-1;i++)
		{
			prev=prev.getNext();
		}
		newNode.setPrev(prev);//First we need to set the prev of newNode
		if(prev.getNext()!=null) //Here we need to check if position is last!!
		{//if position is not last then perform these operation ,otherwise it does not matter
			newNode.setNext(prev.getNext());
			prev.getNext().setPrev(newNode);
		}
		prev.setNext(newNode); //Then set the next of the prev!!
		return true;
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	
	public boolean deleteByValue(int data) {
		//Suppose data is present at first position
		if(head.getData()==data)
		{
			head=head.getNext();
			head.setPrev(null);
			return true;
		}
		Node temp=head;
		while(temp.getData()!=data)
		{
			temp=temp.getNext();
			if(temp==null)
			{
				return false;
			}
		}
		Node previousnode=temp.getPrev();
		previousnode.setNext(temp.getNext());
		if(temp.getNext()!=null)
		{
		temp.getNext().setPrev(previousnode);
		}
		return true;
	}
	
	public boolean deleteByPosition(int position) {
		
		if(position<=0 || (head==null && position>1))
		{
			return false;
		}
		
		if(position==1)
		{
			head=head.getNext();
			head.setPrev(null);
			return true;
		}
		
		Node del=head;
		for(int i=1;i<position;i++)
		{
			del=del.getNext();
			if(del==null)
			{
				return false;
			}
		}
		Node prevNode=del.getPrev();
		Node nextNode=del.getNext();
		prevNode.setNext(nextNode);
		if(nextNode!=null)
		{
		nextNode.setPrev(prevNode);
		}
		
		
		return true;
	}

}
