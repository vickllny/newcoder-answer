package com.vickllny.linkedlist;

import com.vickllny.common.ListNode;

/**
 * https://www.nowcoder.com/practice/02bf49ea45cd486daa031614f9bd6fc3?tpId=295&tqId=1073463&ru=/exam/company&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Fcompany
 */
public class BM14 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public static ListNode oddEvenList (ListNode head) {
        // write code here
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode h1 = null;
        ListNode h2 = head.next;
        ListNode p1 = null;
        ListNode p2 = null;
        ListNode current = head;
        boolean odd = true;
        while (current != null){
            ListNode next = current.next;
            if(odd){
                if(p1 == null){
                    p1 = current;
                    h1 = current;
                }else {
                    p1.next = current;
                    p1 = p1.next;
                }
            }else {
                if(p2 == null){
                    p2 = current;
                }else {
                    p2.next = current;
                    p2 = p2.next;
                }
            }
            current = next;
            odd = !odd;
        }
        p2.next = null;
        p1.next = h2;

        return h1;
    }

    public static void main(String[] args) {
        ListNode root = ListNode.buildListNode(new int[]{1,2,3,4,5,6,7});
        System.out.println(oddEvenList(root));
    }
}
