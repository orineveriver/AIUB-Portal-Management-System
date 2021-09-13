public class Transaction{
	
	protected String TransactionName;
	protected String TransactionId;
	Student student;
	
	
	public Transaction(String TransactionName, String TransactionId){
		this.TransactionName = TransactionName;
		this.TransactionId = TransactionId;
		
	}
	

  public void SetStudent(Student stu){
	this.student = stu;
    }

  public Student getStudent(){
	return student; 
   }
   
   
   
   
   


	
	
	
}