package com.vickllny.linkedlist;

import com.vickllny.common.ListNode;

public class BM15 {
    
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param head ListNode类 
     * @return ListNode类
     */
    public static ListNode deleteDuplicates (ListNode head) {
        // write code here
        if(head == null || head.next == null){
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while ((p2 = p2.next) != null) {
            if(p1.val == p2.val){
                p1.next = p2.next;
            }else {
                p1 = p1.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode root = ListNode.buildListNode(1,1,2,2,2,3,3,3,3,4,5,5,6);
        System.out.println(deleteDuplicates(root).toString());
    }
}
