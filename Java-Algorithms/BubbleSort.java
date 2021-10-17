public class BubbleSort {  
        static void print (int a[])  
    {  
        int n = a.length;  
        int i;  
        for (i = 0; i < n; i++)  
        {  
            System.out.print(a[i] + " ");  
        }         
    }  
    static void bubbleSort (int a[])    
    {  
        int n = a.length;  
        int i, j, temp;  
        for (i = 0; i < n; i++)  
        {  
            for (j = i + 1; j < n; j++)  
            {  
                if (a[j] < a[i])  
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
    }  
    public static void main(String[] args) {    
    int a[] = {74,98,42,65,11,39};    
    BubbleSort b1 = new BubbleSort();  
    System.out.println("Before sorting array elements are - ");    
    b1.print(a);  
    b1.bubbleSort(a);  
    System.out.println();  
    System.out.println("After sorting array elements are - ");    
    b1.print(a);  
        
}    
}  