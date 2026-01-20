# 10.1-Back-To-School
## Background: 
The HighSchool application, as explained in the lesson, comprises two classes: the Person superclass and the Student subclass. In this lab, you will create four classes—Teacher, HighSchoolStudent, Freshman, and Senior utilizing the concept of inheritance.

The Teacher class, resembling the Person class, will possess additional properties such as salary (indicating the teacher's earnings) and subject (e.g., "Computer Science," "Chemistry," "English," and "Other").

The HighSchoolStudent class extends the Student class by introducing two additional attributes: year (indicating the current level in high school) and academy (e.g., "Classical," "Global Studies"). Additionally, two new methods, of your choice, will be incorporated into the HighSchoolStudent class.

Both the Freshman and Senior classes will extend the HighSchoolStudent class. For each of these classes, there should be an override of one inherited method, and a unique method specific to each class should be created. This structure enhances the hierarchy by showcasing the specialization of the Freshman and Senior classes while maintaining the inheritance chain.


The inheritance hierarchy follows: 

![Inheritance Heirachy](assets/inheritance.png)


Here is the Person base class from the lesson to be used as a starting point for the Teacher class: 
```java
public class Person{ 
	private String myName ; // name of the person 
	private int myAge; // person's age 
	private String myGender; // "M" for male, "F" for female 

// constructor 
	public Person(String name, int age, String gender){ 
		myName = name; 
		myAge = age; 
		myGender = gender; 
	} 

	public String getName(){ 	
		return myName; 
	} 

	public int getAge(){ 
		return myAge; 
	} 

	public String getGender(){ 
		return myGender; 
	} 

	public void setName(String name){ 
		myName = name; 
	} 

	public void setAge(int age){ 
		myAge = age; 
	} 

	public void setGender(String gender){ 
		myGender = gender; 
	} 

	public String toString(){ 
		return myName + ", age: " + myAge + ", gender: " + myGender; 
	} 
} 
```

The Student class is derived from the Person class and used as a starting point for the CollegeStudent class: 

```java
public class Student extends Person{ 
	private String myIdNum; // Student Id Number 
	private double myGPA; // grade point average 

	// constructor 
	public Student(String name, int age, String gender, String idNum, double gpa){ 
		// use the super class' constructor 
		super(name, age, gender); 
		// initialize what's new to Student 
		myIdNum = idNum; 
		myGPA = gpa; 
	} 

	public String getIdNum(){ 
		return myIdNum; 
	} 

	public double getGPA(){ 
		return myGPA; 
	} 

	public void setIdNum(String idNum){ 
		myIdNum = idNum; 
	} 

	public void setGPA(double gpa){ 
		myGPA = gpa; 
	} 

	// overrides the toString method in the parent class 
	public String toString(){ 
		return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA; 
	} 
} 
```
## Assignment: 
1. You will be provided with two source files as shown above: Person.java for the Person class, Student.java for the Student class. These files should be used throughout this assignment. 
2. Write a Teacher class that extends the parent class Person. 
	- Add instance variables to the class for subject (e.g. “Computer Science”, "Chemistry", "English", "Other”) and salary (the teacher’s annual salary). Subject should be of type String and salary of type double. Choose appropriate names for the instance variables.
	- Write a constructor for the Teacher class. The constructor will use five parameters to initialize myName, myAge, myGender, subject, and salary. Use the super reference to use the constructor in the Person superclass to initialize the inherited values. 
	- Write “setter” and “getter” methods for all of the class variables. For the Teacher class they would be: getSubject, getSalary, setSubject, and setSalary. 
	- Write the toString() method for the Teacher class. Use a super reference to do the things already done by the superclass. 
3. Write a HighSchoolStudent subclass that extends the Student class. 
	- Add instance variables to the class for academy and year. Academy should be of type String and year of type int. Choose appropriate names for the instance variables. 
	- Write a constructor for the HighSchoolStudent class. The constructor will use seven parameters to initialize myName, myAge, myGender, myIdNum, myGPA, year, and major. Use the super reference to use the constructor in the Student superclass to initialize the inherited values. 
	- Write “setter” and “getter” methods for all of the class variables. For the CollegeStudent class they would be: getYear, getMajor, setYear, and setMajor. 
	- Write the toString() method for the HighSchoolStudent class. Use a super reference to do the things already done by the superclass. 
4. Write a Freshman subclass that extends the HighSchoolStudent class. 
    - Begin by extending the HighSchoolStudent class, inheriting properties and methods.
    - Introduce a new instance variable, unique to the Freshman class, representing a specific characteristic relevant to freshmen. Choose an appropriate name for this variable.
    - Write a constructor for the Freshman class. Utilize the super reference with the necessary parameters to initialize inherited values and the newly introduced variable.
    - Implement "setter" and "getter" methods for the new instance variable.
    - Override one of the inherited methods from the HighSchoolStudent class, providing a distinct implementation.
    - Create a unique method specific to the Freshman class, showcasing the distinctive attributes or behaviors associated with freshmen.
5. Write a Senior subclass that extends the HighSchoolStudent class.
    - Extend the HighSchoolStudent class to inherit its properties and methods.
    - Introduce a new instance variable, exclusive to the Senior class, representing a characteristic pertinent to seniors. Choose an appropriate name for this variable.
    - Write a constructor for the Senior class. Use the super reference along with the necessary parameters to initialize inherited values and the newly introduced variable.
    - Implement "setter" and "getter" methods for the new instance variable.
    - Override one of the inherited methods from the HighSchoolStudent class, providing a distinct implementation.
    - Create a unique method specific to the Senior class, illustrating the distinctive attributes or behaviors associated with seniors.


  
