public class Senior extends HighSchoolStudent 
{
    private int collegeAppsSubmitted;

        public Senior(String name, int age, String gender, String idNum, double gpa, String academy, int collegeAppsSubmitted) 
        {
        super(name, age, gender, idNum, gpa, 12, academy);
        this.collegeAppsSubmitted=collegeAppsSubmitted;
        }

        //getter/setter
        public int getCollegeAppsSubmiited()
        {
            return collegeAppsSubmitted;
        }
        public void setCollegeAppsSubmitted(int collegeAppsSubmitted)
        {
            this.collegeAppsSubmitted=collegeAppsSubmitted;
        }

        @Override
        public String toString()
        {
            return super.toString() + ", College applications submitted: "+ collegeAppsSubmitted;
        }
        public String getSeniorStatus()
        {
            if(collegeAppsSubmitted>=5)
            {
                return "Seniorritis is real, but most applications are in, almost free!";
            }
            else if(collegeAppsSubmitted>=1)
            {
                return "Still working on those last few applications... send help!";
            }
            else
            {
                return "I should probably start applying to colleges soon...";
            }
            
        }
}
