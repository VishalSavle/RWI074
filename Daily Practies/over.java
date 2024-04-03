class over{
	public void run(int a){
		System.out.println("single parameter:"+a);
	}
	public void run(int a,int b){
		System.out.println("Double parameter:"+a+" "+b);
	}
	public void run(int a,String name){
		System.out.println("String parameter:"+a+" "+name);
	}
	public static void main(String[] args) {
	over t=new over();
	t.run(1);
	t.run(12,15);
	t.run(120,"Vishal");
	}
}