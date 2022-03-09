package datastructures;
public class ReverseLinkedList {

	public static void main(String[] args) {
		TreeNode head = new TreeNode(1);
		head.next = new TreeNode(2);
		head.next.next = new TreeNode(3);
		head.next.next.next = new TreeNode(4);
		head = reverse(head);
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}	
	private static TreeNode reverse(TreeNode head) {
		TreeNode prev = null;
		// null -> 1 -> 2 -> 3
		// save head.next
		// point head.next to prev
		// point prev to head
		// point head to savedhead.next
		// null <- 3 <- 2<- 1
		while(head != null) {
			TreeNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
}
