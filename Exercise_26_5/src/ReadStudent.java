import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadStudent
{
   public static void main(String[] args)
   {
      String fileName = "c:/students.txt";
      ArrayList<Student> list = new ArrayList<>();
      
      File myFile = new File(fileName);
      
      Scanner scanText = null;
      
      try{
         scanText = new Scanner(myFile);
      }
      catch(FileNotFoundException e)
      {
         e.printStackTrace();
      }
      while(scanText.hasNext())
      {
         String str1 = scanText.nextLine();
         String[] token = str1.split(",");
         
         list.add(new Student(Integer.parseInt(token[0].trim()), Integer.parseInt(token[1].trim()), token[2], token[3], Integer.parseInt(token[4].trim()),Integer.parseInt(token[5].trim()), Integer.parseInt(token[6].trim())));
      }
      
      scanText.close();
      
      for(int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i));
      }
      
      System.out.print("Enter grp number of the students u want to see");
      Scanner input = new Scanner(System.in);
      int grpNumber = input.nextInt();
      
      for(int i = 0; i < list.size(); i++)
      {
         if(list.get(i).getGrpNumber() == grpNumber)
            System.out.println(list.get(i));
      }
      
      System.out.print("Change data on a student - enter student number: ");
      int studentNumber = input.nextInt();
      Student selectedStudent = findStudent(list, studentNumber);
      
      int choise = 0;
      System.out.println(selectedStudent.getName());
      do{
         System.out.println("What will u change?");
         System.out.println("1: - name");
         System.out.println("2: - day of birth");
         System.out.println("3: - month of birth");
         System.out.println("4: - year of birth");
         System.out.println("-1 - terminate");
         choise = input.nextInt();
         
         
         switch(choise)
         {
            case 1:
               System.out.println("enter the new name:");
               selectedStudent.setName(input.nextLine());
               input.next();
               break;
            case 2:
               System.out.println("Enter day of the birth: ");
               selectedStudent.setDay(input.nextInt());
               break;
            case 3:
               System.out.println("Enter month of birth");
               selectedStudent.setMonth(input.nextInt());
               break;
            case 4:
               System.out.println("Enter year:");
               selectedStudent.setYear(input.nextInt());
               break;
         }

      }while(choise != -1);
      
      //overwrite the file with the new content
      File file = new File(fileName);
      
      try{
         PrintWriter printWriter = new PrintWriter(file);
      
         for(int i = 0; i < list.size(); i++)
         {
            printWriter.println(list.get(i));
         }
         
         printWriter.flush();
         
         printWriter.close();
      }
      catch(FileNotFoundException e)
      {
         e.printStackTrace();
      }
      
      
      
      System.out.println("The program have terminated");
   }

   private static Student findStudent(ArrayList<Student> list, int studentNumber)
   {

      for(int i = 0; i < list.size(); i++)
      {
         if(list.get(i).getStudentNumber() == studentNumber)
            return list.get(i);
      }
      
      return null;
   }
   
}
