package com.vickllny.common;

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int val){
        this.val = val;
    }

    public static ListNode buildListNode(int... number){
        if(number == null || number.length == 0){
            return null;
        }
        if(number.length == 1){
            return new ListNode(number[0]);
        }
        ListNode root = new ListNode(number[0]);
        ListNode tempNode = root;
        for(int i = 1; i < number.length; i++){
            tempNode.next = new ListNode(number[i]);
            tempNode = tempNode.next;
        }
        return root;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder().append(this.val);
        ListNode node = this;
        while ((node = node.next) != null) {
            sb.append(",").append(node.val);
        }
        return sb.toString();
    }
    
}
