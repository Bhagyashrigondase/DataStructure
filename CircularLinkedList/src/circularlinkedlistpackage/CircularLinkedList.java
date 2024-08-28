package circularlinkedlistpackage;

public class CircularLinkedList {
	
	private Node head;
	
	public CircularLinkedList() {
		head=null;	
	}
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		
		//If list is empty
		if(head==null)
		{
			head=newNode;
			newNode.setNext(head);
			
			return true;
		}
		
		Node last=head;
		while(last.getNext()!=head)
		{
			last=last.getNext();
		}
		last.setNext(newNode);
		newNode.setNext(head); //Extra step in circular 
		
		return true;
		
	}
	
	//Insert at Position
	public boolean insertAtposition(int data,int position)
	{
		Node newNode=new Node(data);
		//validation
		if(position<=0 || (head==null && position>1))
		{
			return false;
		}
		
		if(position==1)
		{
			if(head==null)
			{
			head=newNode;
			newNode.setNext(head);
			return true;
			}
			//Bhagyashri !!!Tu visrli hoti heeee!!!!!!!!.
			//Extraaaaaa in circular linked list!!!!!
			Node last=head;
			while(last.getNext()!=head)
			{
				last=last.getNext();
			}
			
			newNode.setNext(head);
			head=newNode; //Mandatory!!!!!!!!!
			last.setNext(head);
			return true;
		}
		
		//If position is in between
		Node priviousNode=head;
		
		for(int i=1;i<position-1;i++)
		{
			priviousNode=priviousNode.getNext();
			if(priviousNode==head)
			{
				System.out.println("Invalid position!!!");
				return false;
			}
		}
		newNode.setNext(priviousNode.getNext());
		priviousNode.setNext(newNode);
		return true;
		
	}
	
public boolean deleteByValue(int data)
{
	Node temp=head;
	if(temp.getData()==data)
	{
		while(temp.getNext()!=head)
		{
			temp=temp.getNext();
		}
		head=head.getNext();
		temp.setNext(head);
		return true;
	}
	
	Node del=head;
	Node previousNode=head;
	while(del.getData()!=data)
	{
		previousNode=del;
		del=del.getNext();
		if(del==head)
		{
			return false;
		}
	}
	previousNode.setNext(del.getNext());
	return true;
}

//Delete by position
public boolean deleteByPosition(int position)
{
	Node last=head;
	if(position==1)
	{
		
		while(last.getNext()!=head)
		{
			last=last.getNext();
		}
		head=head.getNext();
		last.setNext(head);
		return true;
	}
	
	Node del=head;
	Node previousNode=head;
	for(int i=1;i<
			position;i++)
	{
		previousNode=del;
		del=del.getNext();
	}
	previousNode.setNext(del.getNext());
	
	return true;
}
	
	public void display() {
		Node temp=head;
		
		do
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}while(temp!=head);
	}

	//Sort the circular linked list
	public void sortList()
	{
		Node temp1=head;
		while(temp1.getNext()!=head)
		{
			Node temp2=temp1.getNext();
			while(temp2!=head)
			{
				if(temp1.getData()<temp2.getData())
				{
					int swap=temp1.getData();
					temp1.setData(temp2.getData());
					temp2.setData(swap);
				}
				temp2=temp2.getNext();
			}
			temp1=temp1.getNext();
		}
	}
	
	//Find the mid element(Second Shift Question)
	public void findMidElement()
	{
		Node temp=head;
		int count=0;
		do {
			count++;
			temp=temp.getNext();
		}while(temp!=head);
		//System.out.println("Count of list:"+count);
		
		Node findMid=head;
		for(int i=0;i<(count-1)/2;i++)
		{
			findMid=findMid.getNext();
		}
		System.out.println("Middle element: "+findMid.getData());
	}
	
	//Sorting 2nd method
	public void sortLinkedList()
	{
		Node t1=head;
		Node t2=t1.getNext();
		int count=0;
		do {
			count++;
			t1=t1.getNext();
		}while(t1!=head);
		
		for(int i=1;i<count;i++)
		{
			t1=head;
			t2=t1.getNext();
			while(t2!=head)
			{
				if(t1.getData()>t2.getData())
				{
					int temp=t1.getData();
					t1.setData(t2.getData());
					t2.setData(temp);
				}
				t2=t2.getNext();
				t1=t1.getNext();
			}
		}
		System.out.println("\nAfter sorting:");
		Node show=head;
		do
		{
			System.out.print(show.getData()+" ");
			show=show.getNext();
		}while(show!=head);
	}
}
