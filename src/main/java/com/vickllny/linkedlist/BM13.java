package com.vickllny.linkedlist;

import com.vickllny.common.ListNode;

public class BM13 {
    
    public static boolean isPail(ListNode head){
        if(head == null){
            return false;
        }
        if(head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (true) {
            if((fast.next) == null){
                //偶数
                fast = slow.next;
                slow = head;
                break;
            }
            fast = fast.next;
            if((fast.next) == null){
                //奇数
                fast = slow.next.next;
                slow = head;
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        fast = reverse(fast);
        //判断是否相等
        while (fast != null) {
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    static ListNode reverse(ListNode root){
        ListNode prev = null;
        while (root != null) {
            ListNode tempNode = root.next;
            root.next = prev;
            prev = root;
            root = tempNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode root = ListNode.buildListNode(new int[]{-1,-2,-3,-2,-1});
        System.out.println(isPail(root));
    }


}
