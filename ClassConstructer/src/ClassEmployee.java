public class ClassEmployee{
	int id;
	String name;
	char gender;
	
	ClassEmployee(int id,String name, char gender){
		this.id=id;
		this.name=name;
		this.gender=gender;
	}
	void Details() {
		System.out.println("Employee having Employee ID "+id+" of name "+name+" is "+gender );
	}

}