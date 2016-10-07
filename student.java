package assignment1.assignment1;
import java.util.Date;

public class student {
private int age;
private String Name;
private Date DOB;
private String ID;

public student(String Name,int age,Date DOB, String ID){
	this.Name=Name;
	this.age=age;
	this.DOB=DOB;
	this.ID=ID;
}
public String getName(){
	return Name;
}
public int getAge(){
	return age;
}
public Date DOB(){
	return DOB;
}
public String ID(){
	ID= Name + age;
	return ID;
}
}
