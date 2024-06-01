/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        
        ListNode fast = head.next; #find the midpoint of the list given 
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next; #reverse the second list since we need to rearrange the list based on given criteria
        ListNode prev = null;
        slow.next=null;

        while(mid!=null){ #rearrange the list
            ListNode temp = mid.next;
            mid.next= prev;
            prev =mid;
            mid =temp;
        }

        ListNode first = head;
        ListNode second = prev;

        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2= second.next;
            first.next= second;
            second.next=temp1;
            first= temp1;
            second= temp2;
        } 
        }}
        
    
