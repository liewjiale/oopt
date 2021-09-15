public class Administration extends Person{
	private int adminId;
	
    public Administration() {}
    
    public Customer(String name,char gender, int adminId) {
    	super(name,gender);
    	this.adminId = adminId;
    }
//set    
    public void setAdminId(int adminId){
    	this.adminId=adminId;
    }  
//get   
    public int getAdminId(){
    	return adminId;
    }
    
    public String toString() { 
		return super.toString() + String.format("\nAdmin ID 1: %s", adminId); 
	} 
}