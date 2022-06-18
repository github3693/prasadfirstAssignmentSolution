package mainpackage.subpackage3;

import mainpackage.Superdepartment;
import mainpackage.subpackage1.Admindepartment;
import mainpackage.subpackage2.Hrdepartment;


public class Techdepartment extends Superdepartment {
	
	public String departmentName () {
		 
     	System.out.println(" welcome to the Tech Department");
     	return null;
		
	}

	public String getTodaysWork() {
		
		System.out.println("complete coding of module 1");
	    return null;
	}
	
	public String getWorkDeadline() {
		
		System.out.println("complete by EOD");
		return null;
	}
	
	
	public String getTechStackinformation() {
		
		System.out.println("core java");
		return null;
	}
}

class Driver {
	
	public static void main(String[] args) {
		Superdepartment s= new  Superdepartment();
		 Admindepartment a=new  Admindepartment();
		 Hrdepartment h=new  Hrdepartment();
		 Techdepartment t= new Techdepartment();
	 
		s.departmentName (); 
	    s.getTodaysWork();
	    s.getWorkDeadline();
	    s.isTodayAHoliday();
	    
	}
	
	
}


