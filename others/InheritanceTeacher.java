package others;

public class InheritanceTeacher {

	public static void main(String[] args) 
	{
		Student s = new Student();
		
		s.setId(10);
		s.setName("Rohan");
		s.setAddress("Marathalli");
		s.setmarks(78);
		s.setSalary(45000);
		
		System.out.println("Id is : "+s.getId());
		System.out.println("Name is : "+s.getName());
		System.out.println("Address is : "+s.getaddresss());
		System.out.println("Marks is : "+s.getmarks());
		System.out.println("Salary is : "+s.getSalary());		
		
	}
	
}


class Teacher 
{
	//instance variable 
		int id ;
		String address;
		String name;
		Float salary;
		
		
	//setter method to store id
	void setId(int id)
	{
		this.id= id;
	}
	
	//getter method to retrive id 
	int getId()
	{
		return id;
	}
	
	//to store name 
	void setName(String name)
	{
		this.name= name;
	}
	
	//to get name 
	String getName()
	{
		return name;
	}
	
	//to store address
	void setAddress(String address)
	{
		this.address=address;
	}
	
	//to get address
	String getaddresss()
	{
		return address;
	}
	
	//to store salary
	void setSalary(float salary)
	{
		this.salary=salary;
	}
	
	//to get salary
	float getSalary()
	{
		return salary;
	}
}



class Student extends Teacher
{
	
int marks;

//to store marks
void setmarks(int marks)
{
	this.marks=marks;
}

//to get marks
int getmarks()
{
	return marks;
}
}

