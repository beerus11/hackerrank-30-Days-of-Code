public static Node removeDuplicates(Node head) {
     //Write your code here
       Node currentNode = head;
       while(currentNode!=null && currentNode.next!=null)
           {
           Node node = currentNode;
           while(node.next!=null)
               {
               if(node.next.data==currentNode.data)
                   {
                   Node next = node.next.next;
                   Node temp= node.next;
                   node.next=next;
                   temp=null;

               }
               else{
               node=node.next;
               }
           }
           currentNode=currentNode.next;
       }
       return head;
   }
