package com.java.bean;

public class CreateJson {
	
	private String name;  
    private String school;  
    private boolean has_girlfriend;  
    private double age;  
    private Object car;  
    private Object hourse;  
    private String[] major;  
    private String birthday;
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public boolean isHas_girlfriend() {
		return has_girlfriend;
	}
	public void setHas_girlfriend(boolean has_girlfriend) {
		this.has_girlfriend = has_girlfriend;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public Object getCar() {
		return car;
	}
	public void setCar(Object car) {
		this.car = car;
	}
	public Object getHourse() {
		return hourse;
	}
	public void setHourse(Object hourse) {
		this.hourse = hourse;
	}
	public String[] getMajor() {
		return major;
	}
	public void setMajor(String[] major) {
		this.major = major;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}         
}

//快捷方式生成get和set方法，在新建好了全部private变量之后，点击Eclipse中的Source，
//点击点击Generate Getters and Setters，然后勾选全部，就快速帮你创建好了set和get方法