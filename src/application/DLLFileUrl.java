package application;

/**
 * @author AkinAde
 *
 */
public class DLLFileUrl {

	private static DLLNode head;
	
	private static DLLNode currentNode;
	
	//public DLLFileUrl() {}
	
	/**
	 * 
	 */
	public DLLFileUrl(String fileUrl) {
		
		createHead(fileUrl);
		
	}

	/**
	 * @return the head
	 */
	public DLLNode getHead() {
		
		return head;
		
	}

	/**
	 * @param set the head to head
	 */
	public void createHead(String fileUrl) {
		
		head = new DLLNode(fileUrl);
		
		setCurrentNode(head);
	
	}

	/**
	 * @param fileUrl
	 */
	public void insert(String fileUrl) {
		
		
		DLLNode newNode = new DLLNode(fileUrl);
		
		//to insert at the correct spot front
		currentNode.setNext(newNode);
		newNode.setPrevious(currentNode);
		setCurrentNode(currentNode.getNext());
		
		return;
				
	}

	/**
	 * @return the currentNode
	 */
	public DLLNode getCurrentNode() {
		return currentNode;
	}

	/**
	 * @param currentNode the currentNode to set
	 */
	public void setCurrentNode(DLLNode inCurrentNode) {
		currentNode = inCurrentNode;
	}
	
	public void display(){
		
		System.out.print("***list*** ");
		DLLNode current = head;
		
		while (current != null){
			
			System.out.print(current.getFileUrl() + " - ");
			current = current.getNext();
		}
		
		System.out.println("****");
		
		System.out.println("Current Node: " + currentNode.getFileUrl());
		
	}


}
