 class Stack   
{  
    int max=100;
    int top;
    int a[]=new int[max];

    Stack(){
        top=-1;
    }

    boolean empty(){
        if(top<0){
            System.out.println("Stack Underflow");
            return true;
        }
        return false;
        
    }

    void push(int x){
        if (top>=(max-1)){
            System.out.println("Stack overflow");
        }
        else{
            a[++top]=x;
            System.out.println(x+"is pushed into the stack");
        }
    }

    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x=a[top--];
            System.out.println(x+"is popped from the stack");
            return x;
        }
    }

    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            System.out.println(x+"is at the top of the stack");
            return x; 
        } 
    }

    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(70); 
        s.push(30); 
        s.push(90); 
        s.peek();
        s.pop(); 
      	s.peek();
    } 
}

