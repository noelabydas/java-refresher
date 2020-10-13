import java.util.Scanner;  
class Stack   
{  
    int max=100;
    int top;
    int a[]=new int[max];

    int empty(){
        if(top<0){
            System.out.println("Stack Underflow");
        }
        return 0;
    }

    Stack(){
        top=-1;
    }

    int push(int x){
        if (top>=(max-1)){
            System.out.println("Stack overflow");
            return 0;
        }
        else{
            a[++top]=x;
            System.out.println(x+"is pushed into the stack");
            return 1;
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
            System.out.println(x+"is at the top of the stack")
            return x; 
        } 
    }

    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.peek();
        s.pop(); 
    } 
}

