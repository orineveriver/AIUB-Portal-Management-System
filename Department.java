public class Department{
	protected  String deptName;
	protected  String id;
	protected  int credit;
	Admin admin;
	Student[] newStudents;
	Courses[] course;
	//Semester[] semesters;
	int totalRegister;
	int totalCourseCount;
	
	
	public Department(){
		
		newStudents = new Student[200];
		course = new Courses[200];
		totalRegister = 0;
		totalCourseCount =  0;
	}
	
	
	
	public Department(String deptName, String id, int credit){
			this.deptName = deptName;
			this.id = id;
			this.credit = credit;
			newStudents = new Student[200];
			course = new Courses[200];
			totalRegister = 0;
			totalCourseCount = 0;
	}
	
	public void SetAdmin(Admin admin){
		this.admin = admin;
	}
	
	public Admin GetAdmin(){
		return admin;
	}
	
	
	
	
	public void addNewRegister(Student std){
		newStudents[totalRegister++] = std;
	}
	
	public void addNewCourses(Courses crs){
		course[totalCourseCount++] = crs; 
	}

	
	public void showInfo(){
		System.out.println("Deparment Name: " + deptName);
		System.out.println("Deparment Id: " + id);
		System.out.println("Deparment totalCredit: " + credit);
	}

	
	public void AllRegisteredStudent(){
		for(int i=0; i<totalRegister; i++){
			newStudents[i].ShowInfo();
		}
	}
	public void AllCourseInfo(){
		for(int i=0; i<totalCourseCount; i++){
			course[i].showInfo();
		}
	}
	
	
	
	
	
	
	
	
	
	
}