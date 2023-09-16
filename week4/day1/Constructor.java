package week4.day1;

public class Constructor {
	int empid;
	String empName;
	boolean empStatus;
	
	public Constructor() {
		//this(300,"Nihar1",true);
		empid=100;
		System.out.println("Default constructor");
		
	}
	
	public Constructor(int empid,String empName,boolean empstatus) {
		
		this.empid=empid;
		this.empName=empName;
		this.empStatus=empstatus;
		System.out.println("parametrized constructor");
		
	}
	public static void main(String[] args) {
		
		Constructor lc=new Constructor(200,"Nihar1",true);
		
		System.out.println(lc.empid +" " + lc.empName + lc.empStatus);
		
		
	}

}