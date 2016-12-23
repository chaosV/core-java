
public class Information {
	protected int ID;
	protected String name;
	protected int salary;
	protected int sort;
	
	
	public Information(int ID,int sort,int salary,String name){
		this.ID=ID;
		this.sort=sort;
		this	.salary=salary;
		this.name=name;
		
	}


	public Information() {
		// TODO Auto-generated constructor stub
}			


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getSort() {
		return sort;
	}


	public void setSort(int sort) {
		this.sort = sort;
	}


	@Override
	public String toString() {
		return "Information [ID=" + ID + ", name=" + name + ", salary=" + salary + ", sort=" + sort + ", getID()="
				+ getID() + ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getSort()=" + getSort()
				+  "]";
	}
	

}
