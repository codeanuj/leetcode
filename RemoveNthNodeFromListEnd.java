/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class RemoveNthNodeFromListEnd {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        
        ListNode tmp=A;
      
        int count=0;
      //to get length of linkedlist
        while(tmp!=null){
            count++;
            tmp=tmp.next;
        }
      //B is greater than nthe length or length==B remove the first node
        if(B>count || count==B){
           ListNode temp = A.next;
           A.next=null;
           A=temp;
           return A;
        }
        
        int cnt=1;
        tmp=A;
       //to get the n-1 node
        while(cnt!=count-B){
            cnt++;
            tmp=tmp.next;
        }
        
        if(tmp.next.next==null){
            tmp.next=null;
        }else{
            tmp.next= tmp.next.next;
        }
        return A;
    }
}
