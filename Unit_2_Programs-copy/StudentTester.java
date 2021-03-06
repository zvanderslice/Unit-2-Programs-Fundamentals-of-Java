// Solution to Project 6.1
// Add new constructors to Student class and test them.

public class StudentTester{

   public static void main (String[] args){
      Student s1, s2;      
      String str;
      int i;

      // Instantiate and display a student object
      s1 = new Student("Bill", 84, 86, 88);     
      System.out.println("\nHere is student s1\n" + s1);
      
      // Copy s1 to s2
      s2 = new Student(s1); 
      System.out.println("\nHere is student s2\n" + s2);

      // Change the name of s1
      s1.setName ("Ann");
      
      // Show that this change does not affect s2    
      System.out.println("\nHere is student s1 after name change\n" + s1);
      System.out.println("\nHere is student s2\n" + s2);
   }
                       
}
