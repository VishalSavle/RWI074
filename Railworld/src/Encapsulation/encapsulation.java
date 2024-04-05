package Encapsulation;
class emp{
	private int  empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
}
public class encapsulation {
	public static void main(String[] args) {
		emp e=new emp();
		e.setEmpId(120);
		System.out.println(e.getEmpId());
	}
}
