class sort{
	public static void main(String[] args) {
		int i,j;
		int arr[]={1,2,3,8,65,4,5};
		for(i=0;i<arr.length;i++){
			for(j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					int s=arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
			}
			
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
/*int i,j;
		int arr[]={1,2,3,8,65,4,5};
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int s=arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
			}
		}*/
		