package learnHBN;

public class Studentlogin {
	
	private int id;
	private String username;
	private String password;
	
	private Student student;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String toString (){
		return "[ id="+id+",username="+username+",password="+password+"]";
	}
}
