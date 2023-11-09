package com.vickllny.linkedlist;

import com.vickllny.common.ListNode;

public class BM16 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param head ListNode类
     * @return ListNode类
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write code here
        if(head == null || head.next == null){
            return head;
        }
        ListNode parent = head;
        ListNode p1 = head;
        ListNode p2 = head;
        while ((p2 = p2.next) != null) {
            if(p1.val == p2.val){
                while ((p2 = p2.next) != null && p2.val == p1.val) {
                    
                }
                if(p2 == null){
                    if(head == parent && p1.val == head.val){
                        return null;
                    }
                    parent.next = null;
                    return head;
                }else {
                    if(head == parent){
                        if(p1.val == head.val){
                            head = p2;
                            parent = head;
                        }else {
                            parent.next = p2;
                        }
                        p1 = p2;
                        continue;
                    }
                    p1 = p2;
                    parent.next = p2;
                }
                
            }else {
                if(parent != p1){
                    parent = p1;
                }
                p1 = p1.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        final ListNode root = ListNode.buildListNode(0,1,1,2,2,3,3,4,5,6,6,7,8,9,9);
        ListNode node = deleteDuplicates(root);
        if(node != null){
            System.out.println(node.toString());
        }
    }
}
