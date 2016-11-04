
public class Student
{
   private int grpNumber;
   private int studentNumber;
   private String name;
   private String countryCode;
   private int day;
   private int month;
   private int year;
   
   
   public Student(int grpNumber, int studentNumber, String name, String countryCode, int day, int month, int year)
   {
      this.grpNumber = grpNumber;
      this.studentNumber = studentNumber;
      this.name = name;
      this.countryCode=countryCode;
      this.day = day;
      this.month=month;
      this.year = year;
   }
   
   public int getGrpNumber()
   {
      return grpNumber;
   }

   public int getStudentNumber()
   {
      return studentNumber;
   }

   public void setStudentNumber(int studentNumber)
   {
      this.studentNumber = studentNumber;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String fName)
   {
      this.name = fName;
   }


   public String getCountryCode()
   {
      return countryCode;
   }

   public void setCountryCode(String countryCode)
   {
      this.countryCode = countryCode;
   }

   public int getDay()
   {
      return day;
   }

   public void setDay(int day)
   {
      this.day = day;
   }

   public int getMonth()
   {
      return month;
   }

   public void setMonth(int month)
   {
      this.month = month;
   }

   public int getYear()
   {
      return year;
   }

   public void setYear(int year)
   {
      this.year = year;
   }

   public void setGrpNumber(int grpNumber)
   {
      this.grpNumber = grpNumber;
   }
   
   public String toString()
   {
      return grpNumber + ", " + studentNumber + ", " + name + ", " + countryCode + ", " + day + ", " + month + ", " + year;
   }

}
