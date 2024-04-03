class prime{
	public static void main(String[] args) {
		int x= 7,count=0;
		for(int i=1;i<=7;i++){
			if (i%7==0)
				count++;
		}
		if(count==2){
				System.out.println("Its a prime number");
			}else{
				System.out.println("Its not a prime number");
			}
	}
}