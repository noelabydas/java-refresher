class InsertionSort{
	void sort(int arr[]){
		int n=arr.length;
		for(int i=1;i<n;i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && temp<=arr[j]){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
	}

	void display(int arr[]){
		int n=arr.length;
		for(int k=0;k<n;k++){
			System.out.print(arr[k]+" ");
		}
	}


	public static void main(String[] args) {
		InsertionSort is=new InsertionSort();
		int arr[]={90,45,86,43,65,10,21,96,55,6};
		is.sort(arr);
		is.display(arr);
	}
}