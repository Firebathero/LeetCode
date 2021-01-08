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
    
public int getDecimalValue(ListNode head) {
       
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);   // toss head on stack, then point to next and store
            head = head.next;
        }
        int sum = 0;
        int index = 0;                   //store index to traverse data and increment power
        while (!stack.isEmpty()) {       
            if (stack.pop() == 1) {     
                sum = sum + (int)Math.pow(2, index);    //when binary = 1, add 2^index to running sum
            }
            index++;
        }
        return sum;
    }
}