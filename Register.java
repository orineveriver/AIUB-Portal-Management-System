public class Register{
	private String name;
	private String id;
	private String age;
	private String bloodGroup;
	private String phoneNumber;
	private String email;
	private String Address;
	Department department;
	//Admin admin;
	
	
	public Register(){}
	public Register(String name, String id, String age, String email, String bloodGroup, String phoneNumber, String Address){
		this.name = name;
		this.id = id;
		this.age = age;
		this.email = email;
		this.bloodGroup = bloodGroup;
		this.phoneNumber = phoneNumber;
		this.Address = Address;
	}
	
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
	
	/*public void SetAdmin(Admin admin){
		this.admin = admin;
	}
	
	public Admin GetAdmin(){
		return admin;
	}
	*/
	
	public void ShowInfo(){
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