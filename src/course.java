import java.util.*;

public class course {
String code ; 
String name;
ArrayList<Double> grades = new ArrayList<>(); 

course(){
	
}
public course(String code, String name , ArrayList grades) {
	this.name = name;
	this.code = code;
	this.grades = grades;
}
}
