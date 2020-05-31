package com.bridgeLabz.annotation.classLevel;

@Course(cId = "C-45", cName = "java", cCost = 20000)
public class Student {
	private String sid;
	private String sName;
	private String saddr;

	public Student(String sid, String sName, String saddr) {

		this.sid = sid;
		this.sName = sName;
		this.saddr = saddr;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	public void getStudentDetails() {
		System.out.println("Student details");
		System.out.println("Student name : " + sName);
		System.out.println("Student id : " + sid);
		System.out.println("Student address : " + saddr);

	}

}
