public class Freshman extends HighSchoolStudent
{
    private boolean hasOlderSibling; // unique character

    public Freshman(String name, int age, String gender, String idNum, double gpa, String academy, boolean hasOlderSibling) 
    {
        super(name, age, gender, idNum, gpa, 9, academy);
        this.hasOlderSibling = hasOlderSibling;
    }
    public boolean hasOlderSibling()
    {
        return hasOlderSibling;
    }

    public void setHasOlderSibling(boolean hasOlderSibling)
    {
        this.hasOlderSibling= hasOlderSibling;
    }

    @Override
    public String getYearName()
    {
        String base = super.getYearName();
        if(hasOlderSibling)
        {
            return base +"(With sibling guide)";
        }
        return base + "(New to building)";
    }

    public String getTransitionMessage()
    {
        if(hasOlderSibling)
        {
            return "I'm a little nervous, but my older sibling is helping my classes";
        }
        else{
            return "I am excited, but still this is all new and overwhelming";
        }
    }
    @Override
    public String toString()
    {
        return super.toString() + ", has older sibling at school: " + hasOlderSibling;   
    }
}
