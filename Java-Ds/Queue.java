class Queue{
    static int front,rear,capacity,queue[];

    Queue(int c){
        front=rear=0;
        capacity=c;
        queue= new int[capacity];
    }


    void enqueue(int item){
        if (capacity==rear){
            System.out.println("Queue is full \n");
        }
        else{
            queue[rear]=item;
            rear++;
        }
    }

    static void dequeue(){
        if(front==rear){
            System.out.println("Queue is empty\n");
        }
        else{
            for(int i=0;i<rear-1;i++){
                queue[i]=queue[i+1];
            }
        rear--;
        }
    }

    void display(){
        if(front==rear){
            System.out.println(" Queue is empty\n");
        }
        for(int j=front;j<rear;j++){
            System.out.printf(" %d <= ", queue[j]);
        }
    }
    
    static void displayFront() 
    { 
        if (front == rear) { 
            System.out.printf(" Queue is empty\n"); 
        } 
        System.out.printf("\n Front Element of the queue: %d", queue[front]);
    } 

    public static void main(String[] args) { 
        Queue q = new Queue(5); 
        System.out.println("\n Initial Queue:");
        q.display(); 
        q.enqueue(10); 
        q.enqueue(30); 
        q.enqueue(50); 
        q.enqueue(70); 

        System.out.println("\n Queue after enqueue eperation:");
        q.display(); 
        q.displayFront(); 
        
        System.out.println("\n Queue after enque operation");
        q.enqueue(90); 
        q.display(); 
   
        q.dequeue(); 
        q.dequeue(); 
        System.out.printf("\n Queue after two dequeue operations:"); 
 
        q.display(); 
        q.displayFront(); 
    } 
}

