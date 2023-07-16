package oops.collection.linkedlist;

import java.util.LinkedList;

public class DeleteLinkedList {


        Node head;
        // Node Class
        class Node{
            int data;
            Node next;

            Node(int x) // parameterized constructor
            {
                data = x;
                next = null;
            }
        }
        public Node insert(int data)
        {
            // Creating newNode memory & assigning data value
            Node newNode = new Node(data);
            // assigning this newNode's next as current head node
            newNode.next = head;

            // re-assigning head to this newNode
            head = newNode;

            return head;
        }

        public void display()
        {
            Node node = head;
            //as linked list will end when Node reaches Null
            while(node!=null)
            {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println();
        }
        void deletepos(int pos)
        {
            Node temp = head;
            Node previous = null;

            int size = calcSize(head);

            if(pos < 1 || pos > size){
                System.out.println("Enter valid position");

                return;
            }

            //if the head node itself needs to be deleted
            if(pos == 1){
                //changing head to next in the list
                head = temp.next;
                System.out.println("Deleted Item: "+ temp.data);
                return;
            }

            //run until we find the value to be deleted in the list
            while (--pos > 0) {
                // store previous link node as we need to change its next val
                previous = temp;
                temp = temp.next;
            }

            // (pos-1)th node's next assigned to (pos+1)nth node
            previous.next = temp.next;
            System.out.println("Deleted Item: "+ temp.data);

        }

        public int calcSize(Node node){
            int size = 0;
            // traverse to the last node each time incrementing the size
            while(node!=null){
                node = node.next;
                size++;
            }
            return size;
        }

        public static void main(String args[])
        {
            DeleteLinkedList ll = new DeleteLinkedList();

            ll.insert(60);
            ll.insert(50);
            ll.insert(40);
            ll.insert(30);
            ll.insert(20);
            ll.insert(10);

            ll.display();

            ll.deletepos(1);
            ll.display();

            ll.deletepos(3);
            ll.display();

            ll.deletepos(4);
            ll.display();

            ll.deletepos(-2); // not valid as pos negative
            ll.deletepos(10); // not valid as breaches size of Linked List

        }
    }