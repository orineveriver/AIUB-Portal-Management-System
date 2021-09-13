public class MainActivity{
	
	public static void main(String args[]){
		Department cs = new Department("Cs", "121", 148);
		Student s1 = new Student("nashir", "18-2", "30", "nashirhaque9@gmail.com", "b+", "12", "kuril");
		Admin a = new Admin("Admin", "54321");
		Courses  pl1 = new Courses("C", "11-2");
		a.addNewRegister(s1);
		a.addNewDepartment(cs);
		s1.SetAdmin(a);
		s1.SetDeparment(cs);
		s1.addNewCourses(pl1);
		
		cs.SetAdmin(a);
		Department cse = new Department("Cse", "121", 151);
		Student s2 = new Student("orin", "18-3", "22", "ab@gmail.com", "ab+", "0171", "basundhara");
		Courses  pl2 = new Courses("C++", "11-3");
		a.addNewRegister(s2);
		a.addNewDepartment(cse);
		s2.SetAdmin(a);
		s2.SetDeparment(cse);
		s2.addNewCourses(pl2);
		
		cse.SetAdmin(a);
		
		Department eee = new Department("EEE", "121", 151);
		Student s3 = new Student("Sumon", "18-4", "22", "su@gmail.com", "ab+", "0176", "kuril");
		Courses  dc = new Courses("Dc", "11-4");
		a.addNewRegister(s3);
		a.addNewDepartment(eee);
		s3.SetAdmin(a);
		s3.SetDeparment(eee);
		s3.addNewCourses(dc);
		
		eee.SetAdmin(a);
		
		
		//a.showRegisteredInfo();
		System.out.println("Searching student by their id");
		a.searchStudentInfo("18-4");
		
		/*cs.addNewRegister(s1);
		s1.SetDeparment(cs);
		 
		//Courses  c2 = new Courses("Oop", "11-2"); 
		cs.addNewCourses(c1);
		//cs.addNewCourses(c2);	
			s1.addNewCourses(c1);
		c1.setDepartment(cs);
		//c1.addNewStuden(s1);
	
		//s1.addNewCourses(c2);
		
		
		Department cs2 = new Department("Cs", "121", 148);
		Student s2 = new Student("na", "11", "30", "@", "b+", "12", "fhggh");
		cs2.addNewRegister(s2);
		
		s2.SetDeparment(cs2);
	
		cs.AllRegisteredStudent();
		s1.AllCourseInfo();
		cs.AllCourseInfo();
		
		//cs2.AllRegisteredStudent();
		
		*/
	}
	
	
}