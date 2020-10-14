class LinearSearch{
 	static int search(int arr[],int x){
		int s=arr.length;
		for(int i=0;i<s;i++){
			if(arr[i]==x){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[]={2,9,5,7,4,1,6,8};
		int x=2;

		int value=search(arr,x);
		if(value==-1){
			System.out.println("Not found in the array");
		}
		else{
			System.out.println(x+" was found at index "+value);
		}
	}

}