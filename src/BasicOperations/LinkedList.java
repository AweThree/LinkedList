/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicOperations;

/**
 *
 * @author Misha
 */
public class LinkedList {
    
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int d)
        {
          data=d;
          next=null;
        }
    }   
    
    // inserting a node in the sorted linked list    
    public void insert(Node n){
            
            Node current;
            if (head==null)
                head=n;
            else
            {  
                current=head;
                while(current.next !=null && current.next.data<n.data)
                        current=current.next;
                n.next=current.next;
                current.next=n;
            }
            System.out.println("Node Added");
            
        }
    
    
     public Node newNode(int data)
     {
         Node d= new Node(data);
         return d;
     }
        
     public void removeNode(int data){
          if (head==null)
                System.out.println("List is already empty");
          else{
              Node current=head;
              while(current!=null && current.next.data!=data)
                  current=current.next;
              if(current!=null){
                  Node temp=current.next;
                  current.next=temp.next;}
              else
                  System.out.println("Node does not exist");
        
          }
       
     }
             
   }
    
    
    
