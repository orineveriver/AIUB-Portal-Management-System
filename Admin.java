public class Admin{
	
	private String userName;
	private String passWord;
	Student[] addNewStudent;
	Department[] department;
	//Courses[] courses;
	int totalRegisterCount;
	int totalDepartmentCount;
	int totalCourseCount;
	
	
	public Admin(){
		addNewStudent = new Student[200];
		
		department = new Department[10];
		//courses = new Courses[200];
		totalRegisterCount = 0;
		totalDepartmentCount = 0;
		totalCourseCount = 0;
		
	}
	
	public Admin(String userName, String passWord){
		this.userName = userName;
		this.passWord = passWord;
		addNewStudent = new Student[200];
		
		department = new Department[10];
		//courses = new Courses[200];
		totalRegisterCount = 0;
		totalDepartmentCount = 0;
		totalCourseCount = 0;
	}
	
	public void SetUserName(String userName){
		this.userName = userName;			
	}
	public String GetUserName(){
		return userName;
	}
		
	public void SetpassWord(String passWord){
		this.userName = userName;
			
	}
	public String GetPassword(){
		return passWord;
	}
	
	public void addNewRegister(Student NewStudent){
		addNewStudent[totalRegisterCount++] = NewStudent;
		
	}
	
	//public void removeNewStudent(Student removeNewStudent){
		
		
		
	//}
	
	public void addNewDepartment(Department dept){
		department[totalDepartmentCount++] = dept;
	}
	
	/*public void addNewCourse(Courses crs){
		courses[totalCourseCount++] = crs;
	}
	
	*/
	
	
	
	
	public void showDepartmentInfo(){
		for(int i=0; i<totalDepartmentCount; i++){
			department[i].showInfo();
		}
	}
	
	public void showRegisteredInfo(){
		for(int i=0; i<totalRegisterCount; i++){
			addNewStudent[i].showInfo();
			addNewStudent[i].AllCourseInfo();
			 
		}
		
	}
	
	public void searchStudentInfo(String stdId){
		 //department[num].showInfo();
		 boolean isStudentRegistered = false;
		 for(Student total : addNewStudent){
			if(total != null){
				if(total.getId() == stdId){
					System.out.println("student found");
					isStudentRegistered = true;
					total.showInfo();
		 }
				 
			 }
				
			
		 
							
				}
			if(!isStudentRegistered){
				System.out.println("No student found");
			}
			
				
			 
		 }
		 
		 

				
		 

		 }
		 		 
		 //courses[num].showInfo();
		
	
	
	/*public void showCourseInfo(){
		for(int i=0; i<totalCourseCount; i++){
			courses[i].showInfo();
		}
	}
	*/
	
	
	
	
	
	
	
	

	
	
