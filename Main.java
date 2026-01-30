public class Main 
{
    public static void main(String[] args) 
    {
      Teacher t = new Teacher("Ms. Johnson", 38, "F", "Computer Science", 62000.0);
      System.out.println(t);


      HighSchoolStudent hs = new HighSchoolStudent("Alex Kim", 16, "M", "A12345", 3.8, 10, "STEM");
      System.out.println(hs);

      Freshman f = new Freshman("Jordan Lee", 14, "F", "F98765", 3.4, "Arts", true);
      System.out.println(f);
      System.out.println(f.getTransitionMessage());

      Senior s = new Senior("Taylor Brooks", 18, "M", "S54321", 4.0, "Global Studies", 7);
      System.out.println(s);
      System.out.println(s.getSeniorStatus());
    }
}



