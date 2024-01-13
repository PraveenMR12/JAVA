
class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class Loop {
	public static void main(String[] args) {
		// Example linked list with a loop: 1 -> 2 -> 3 -> 4 -> 5 -> 2 (points back to 2)
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = head.next; // creating a loop

		detectAndRemoveLoop(head);

		// Print the modified linked list
		printList(head);
	}

	private static void detectAndRemoveLoop(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		// Detect the loop using the "Tortoise and Hare" algorithm
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				// Loop detected, break the cycle
				removeLoop(head, slow);
				break;
			}
		}
	}

	private static void removeLoop(ListNode head, ListNode meetingPoint) {
		ListNode ptr1 = head;
		ListNode ptr2 = meetingPoint;

		// Move one pointer to the head and then move both pointers one node at a time
		// The meeting point of both pointers will be the start of the loop
		while (ptr1.next != ptr2.next) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		// Break the loop by setting the next of the meeting point to null
		ptr2.next = null;
	}

	private static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}