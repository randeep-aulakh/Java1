package com.example.helloworld;


public class LinkedList {
    Node head;
    private int size;
    
    


   
    public void add(Node newNode){
        if(head == null){
            newNode.next=head;
            head=newNode;
        } else {
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;

            }
            curr.next=newNode;
            newNode.next=null;

        }
        size++;

    }
    
    public void printList(){
        Node curr=head;
        System.out.print("size : "+size+"\t");
        while(curr!=null){
            System.out.print(curr.data +"->");
            curr=curr.next;
        }
        System.out.println("null");

    }
    public void deleteNode(int index){
        int i=0;

        if(head==null){
            System.out.println("list is empty");

        }
        else if(head.next==null){
            head=null;
            size--;

        }else{
            
            Node prev=head;
            Node curr=head;
            while(curr!=null){
                prev=curr;
                curr=curr.next;
                i++;
            
                if(i==index){
                    prev.next=curr.next;
                    size--;
                    
    
                }

            }
        }


    }
    



    

    public void insertNode(Node newNode,int index){
        int i=0;
        Node curr=head;
        Node prev=head;
        if(index>size){
            System.out.println("index out of bounds");
            return;
        }
        if(i == 0){
            newNode.next=head;
            head=newNode;
            size++;
        }
        else {
            while(curr!=null){
                prev=curr;
                curr=curr.next;
                i++;
            
                if(i==index){
                    prev.next=newNode;
                    newNode.next=curr;
                    size++;
    
                }
            }
        }


    }
    



    


}
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }

    

}
class Driver{
    public static void main(String[] args) {
        Node newNode=new Node(1);
        LinkedList list =new LinkedList();
        list.add(newNode);
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        list.add(new Node(5));
        list.add(new Node(6));
        list.printList();
        list.deleteNode(2);
        list.printList();
        list.deleteNode(4);
        list.printList();
        list.insertNode(new Node(7), 0);
        list.printList();
        
    
        
    }

}




    

    


    

    
    


    

