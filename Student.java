public class Student{
	
	private String name;
	private String id;
	private String age;
	private String bloodGroup;
	private String phoneNumber;
	private String email;
	private String Address;
	Admin admin;
	Department department;
	Courses[] courses;
	//Transaction[] transactions;
	//Result[] result;
	protected int balance;
//	Department department;
	int totalCourseCount;
	
	
	public Student(){
		courses = new Courses[200];
		//transactions = new Transaction[100];
		//result = Result[10];
		//this.department = department;
		totalCourseCount = 0;
		//totalTransaction = 0;
		
	}
	public Student(String name, String id, String age, String email, String bloodGroup, String phoneNumber, String Address){
		
		//transactions = new Transaction[100];
		//result = Result[10];
		//this.department = department;
		this.name = name;
		this.id = id;
		this.age = age;
		this.email = email;
		this.bloodGroup = bloodGroup;
		this.phoneNumber = phoneNumber;
		this.Address = Address;
		courses = new Courses[200];
		totalCourseCount = 0;
		//totalTransaction = 0;
	}
	
	
	//Admin admin;
	
	
	
	
	
	
	public void SetName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void SetId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	public void setAge(String age){
		this.age = age;
	}
	
	public String getAge(){
		return age;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	

	
	public void setAddress(String Address){
		this.Address = Address;
	}
	
	public String getAddress(){
		return Address;
	}
	
	
	
	
	
	
	
	public void SetBloodGroup(String bloodGroup){
		this.bloodGroup = bloodGroup;
	}
	
	public String getBloodGroup(){
		return bloodGroup;
	}
	
	public void SetDeparment(Department department){
		this.department = department;
	}
	public Department GetDeparment(){
		return department;
	}
	
	public void SetAdmin(Admin admin){
		this.admin = admin;
	}
	
	public Admin GetAdmin(){
		return admin;
	}
	
	
	
	
	
	public void addNewCourses(Courses crc){
		courses[totalCourseCount++] = crc;
		
	}
	/*public void addNewTransaction(Transaction transactions){
		Transaction[totalcount++] = transactions;
		
	}
	public void setResult(Result results){
		this.results = results;
	}
	public result getResult(){
		this.results = results;
	}
	
	
	public void deposit(int amount){
		balance += amount;
		System.out.println("Deposited: " + amount);
		System.out.println("your balance: " + balance);
		//addTransaction(this, this, amount, "self-deposit");
		
	}
	
	public void ShowTransaction(){
			for(int i=0; i<=totalTransaction; i++){
				transactions[i].showInfo();
			}
	}
	*/
			
	public void AllCourseInfo(){
		for(int i=0; i<totalCourseCount; i++){
			courses[i].showInfo();
		}
		
	}
	
	public void showInfo(){
		department.showInfo();
		System.out.println("Student Name: " + name);
		System.out.println("Student Id: " + id);
		System.out.println("Student Age: " + age);
		System.out.println("Student BloodGroup: " + bloodGroup);
		System.out.println("Student Email: " + email);
		System.out.println("Student phoneNumber: " + phoneNumber);
		System.out.println("Student Address: " + Address);
		
		//Department.showInfo();
		//System.out.println("Student Name: " + );
		//System.out.println("")
		
	}
	
	
	
	
	
	
	
	
}
	
	
	
