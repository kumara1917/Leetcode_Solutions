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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result=new ListNode();

        if ((list1==null && list2==null)||list1==null){
            return list2;
        }else if (list2==null){
            return list1;
        }
    else{


        if (list1.val<list2.val){
            result=list1;
            list1=list1.next;
        }else{
            result=list2;
            list2=list2.next;
        }
        
        ListNode temp=result;
        while(!(list1== null)&& !(list2==null)){
            if (list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }
        if (list1==null){
            temp.next=list2;
        }else{
            temp.next=list1;
        }}
        return result;
    }
}