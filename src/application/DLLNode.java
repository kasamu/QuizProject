/**
 * 
 */
package application;

/**
 * @author AkinAde
 *
 */
public class DLLNode {

	//declare all instance variable
	private String fileUrl;
	
	private DLLNode next;
	
	private DLLNode previous;
	
	/**
	 * 
	 */
	public DLLNode(String fileUrl) {
		
		this.fileUrl = fileUrl;
		
		this.next = null;
		
		this.previous = null;
		
		
	}

	/**
	 * @return the fileUrl
	 */
	public String getFileUrl() {
		
		return fileUrl;
	
	}

	/**
	 * @param fileUrl the fileUrl to set
	 */
	public void setFileUrl(String fileUrl) {
		
		this.fileUrl = fileUrl;
	
	}

	/**
	 * @return the next
	 */
	public DLLNode getNext() {
		
		return next;
	
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(DLLNode next) {
		
		this.next = next;
	
	}

	/**
	 * @return the previous
	 */
	public DLLNode getPrevious() {
		
		return previous;
	
	}

	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(DLLNode previous) {
		
		this.previous = previous;
	
	}
	
}
