package Algorithms;

public class AddTwoNumbers {
    public static class ListNode { // Definition for singly-linked list in task
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { // main operation
        int number1 = getNumber(l1);
        int number2 = getNumber(l2);
        int sum = number1 + number2;
        ListNode resultList = getListNode(sum);
        visualList(l1);
        System.out.println("FirstList");
        visualList(l2);
        System.out.println("SecondList");
        visualList(resultList);
        System.out.println("ResultList");
        return resultList;
    }

    public int getNumber(ListNode listNode) { // making from LinkedList to int number
        int digToNum = 0;
        int enumeration = 1;
        while (listNode != null) {
            int numberFromList = listNode.val;
            digToNum += numberFromList * enumeration;
            enumeration *= 10;
            listNode = listNode.next;
        }
        return digToNum;
    }

    public void visualList(ListNode listNode) { // just for watching like looks like list , only for me
        while (listNode != null) {
            System.out.print(listNode.val + "-->");
            listNode = listNode.next;
        }
    }

    public ListNode getListNode(int number) { // making from number to linkedlist
        ListNode resultListNode = new ListNode(number % 10);
        ListNode NodeList = resultListNode;
        number = number / 10;
        while (number > 0) {
            int put = number % 10;
            NodeList.next = new ListNode(put);
            number = number / 10;
            NodeList = NodeList.next;
        }
        return resultListNode;
    }
}
