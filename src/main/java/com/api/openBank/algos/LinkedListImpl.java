package com.api.openBank.algos;

class Node{
    int data;
    Node next;

}

public class LinkedListImpl {
    private Node head;
    private void insert(int y){
        Node newNode=new Node();
        newNode.data=y;
        newNode.next=null;

        if (head == null){
            head=newNode;
        }
        else {
            Node x=head;
            while (x.next !=null){
                x=x.next;
            }
            x.next=newNode;
        }

    }

    private void traverse(){
        Node f=head;
        while (f.next != null){
            System.out.print(f.data+" ");
            f=f.next;
        }
        System.out.println("\nLast Node data "+f.data);
    }
    private void deleteNode(int position){
        Node g=head;
        Node n=null;
        if (position == 0){
            head=head.next;
        }
        else {
            for (int i=0; i<position-1; i++){
                g=g.next;
            }
            n=g.next;
            g.next=n.next;
            System.out.println("The node being deleted is "+n.data);
        }
    }
    public static void main(String[] args){
        LinkedListImpl list=new LinkedListImpl();
        list.insert(10);
        list.insert(20);
        list.insert(42);
        list.insert(12);
        list.insert(2);
        list.traverse();
        list.deleteNode(0);
        list.traverse();

    }
}
