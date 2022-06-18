package mainpackage;

import mainpackage.subpackage1.Admindepartment;
import mainpackage.subpackage2.Hrdepartment;
import mainpackage.subpackage3.Techdepartment;

public class Driver {
	
	
		
		public static void main(String[] args) {
			Superdepartment s= new  Superdepartment();
			 Admindepartment a=new  Admindepartment();
			 Hrdepartment h=new  Hrdepartment();
			 Techdepartment t= new Techdepartment();
			 
	
		   
		    
		    
		    
		    a.departmentName (); 
		    a.getTodaysWork();
		    a.getWorkDeadline();
		    
		    
		    
		    h.departmentName (); 
		    h.getTodaysWork();
		    h.getWorkDeadline();
		    h.doActivity();
		    
		    
		    
		    t.departmentName (); 
		    t.getTodaysWork();
		    t.getWorkDeadline();
		    t.getTechStackinformation();
		    
		    
		    
		    

		}
}
