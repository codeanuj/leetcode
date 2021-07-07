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
 
 //1st approach
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     
        int carry=0;
        int i1;
        int i2;
        StringBuilder sb1=new StringBuilder();
        
        while(l1!=null && l2!=null){
            
            i1=l1.val;
            i2=l2.val;
            i1=i1+i2+carry;
            carry=(i1>9)?1:0;
            sb1.append(String.valueOf(i1%10));
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!=null){
            i1=l1.val+carry;
            carry=(i1>9)?1:0;
            sb1.append(String.valueOf(i1%10));
            l1=l1.next;
        }
        while(l2!=null){
            i2=l2.val+carry;
            carry=(i2>9)?1:0;
            sb1.append(String.valueOf(i2%10));
            l2=l2.next;
        }
        
        if(carry!=0)
            sb1.append(String.valueOf(carry));
        
        ListNode head=null;
        ListNode prev_node=null;
        String s= sb1.reverse().toString();
        
        for(int i=s.length()-1; i>=0 ;i--){
            
            ListNode l = new ListNode(s.charAt(i)-'0',null);
            if(head==null){
                head=l;
            }
            if(prev_node!=null){
                prev_node.next=l;
            }
            prev_node=l;                        
        }
        
        return head;
   }
}
//2nd approach

 int carry = 0;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        
        int val1 = l1 == null ? 0 : l1.val;
        int val2 = l2 == null ? 0 : l2.val;
        
        int sum = val1 + val2 + carry;
        carry = sum/10;
        
        l1 = l1 == null ? null : l1.next;
        l2 = l2 == null ? null : l2.next;
        
        ListNode ans = new ListNode(sum%10, addTwoNumbers(l1, l2));
        
        return ans;
    }




