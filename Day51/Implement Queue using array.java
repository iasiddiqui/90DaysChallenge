//Implement a Queue using an Array. Queries in the Queue are of the following type:
//(i) 1 x   (a query of this type means  pushing 'x' into the queue)
//(ii) 2     (a query of this type means to pop element from queue and print the poped element)

class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue()
    {
        front=0;
        rear=0;
    }
    
    //Function to push an element x in a queue.
    void push(int x)
    {
        arr[rear++] = x;
    } 

    //Function to pop an element from queue and return that element.
    int pop()
    {
        if(rear == front){
            front = 0;
            rear = 0;
            return -1;
        }
        return arr[front++];
    } 
}
