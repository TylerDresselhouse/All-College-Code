
package edu.quinnipiac.ser300.Doctor;

//Tyler Dresselhouse and Alex Baez

public class DoctorHolder {

	private String num;
	private int doctors;
	private int children;
	private double access;
	private double health;

	//This class is used to hold information temporarily
	//from the "doctor" file
	
	public DoctorHolder(String n, int d, int c, double a, double h)  {
		setNum(n);
		setDoctors(d);
		setChildren(c);
		setAccess(a);
		setHealth(h);
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getDoctors() {
		return doctors;
	}

	public void setDoctors(int doctors) {
		this.doctors = doctors;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public double getAccess() {
		return access;
	}

	public void setAccess(double access) {
		this.access = access;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
	
}
