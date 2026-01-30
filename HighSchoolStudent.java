public class HighSchoolStudent extends Student
{
    private int year;
    private String academy;
    
    public HighSchoolStudent(String name, int age, String gender, String idNum, double gpa, int year, String academy) 
    {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.academy=academy;
    }

    public int getYear()
    {
        return year;
    }
    public String getAcademy()
    {
        return academy;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
    
    public void setAcademy(String academy)
    {
        this.academy = academy;
    }
    
    public boolean isUpperclassman()
    {
        return year>=11;
    }
    
    public String getYearName()
    {
        switch(year)
        {
            case 9: return "Freshman";
            case 10: return "Sophomore";
            case 11: return "Junior";
            case 12: return "Senior";
            default: return "Unknown";
        }
    }
    public String toString()
    {
        return super.toString() + ", year: "+ year +"("+ getYearName() + "), academy: "+ academy;
    }
}
