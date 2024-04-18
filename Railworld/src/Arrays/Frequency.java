package Arrays;

public class Frequency {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[]= {1, 2, 8, 3, 2, 2, 2, 5, 1};
		int visited=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==visited) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					
					arr[j]=visited;
				}
			}
			System.out.println(arr[i]+" : "+count);
		}
	}
}
