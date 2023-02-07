//Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        Node temp = head;
        int count=1;
        while(temp.next!=null){
         temp= temp.next;  
         count++;
        }
        //Code here
       return count;
        
    }
}
