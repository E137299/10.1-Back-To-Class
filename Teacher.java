public class Teacher extends Person
{
    private String subject; //STEM
    private double salary; //annual salary

    //Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) 
    {
        super(name, age, gender);
        this.subject=subject;
        this.salary=salary;
    }
    public String getSubject()
    {
        return subject;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSubject(String subject)
    {
        this.subject=subject;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    public String toString()
    {
        return super.toString()+",subject: " + subject + ", salary: $" + salary;
    }
}
