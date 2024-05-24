public class Exercise1{
    public static void main(String[] args) {

        System.out.println("Hello dear user");

        String full_name = "Javid Jabiyev";
        System.out.println("My full name is " + full_name);

      //a 

      // In our program, our class in Exercise1(which should start with Capital letter) 
      //and basically it is a blueprint for creating objects. It defines the methods and instances that its objects have.
      //Method signatures is followed by this structure method_name(); Within the paranthesis we can 
      //pass parametrs if we need, but in this case we do not need parametrs for it. 
      //Print statements are also examples of methods. We can use System.out.println(print/printf) as different versions.
      //There are of course differences between them. println: after printing what is written goes to next line(as in \n)
      //print: After printing what is written stays in the same line. printf: it is similar to C style printing and requires format sign 
      //for specifying the data type of the variable(e.g. for floating point numbers %f is the format specifier) and instead of (+ variable_name) 
      //its structure would be ( , variable_name) 

      //b  

      //To compile the java file in comand prompt, first we need to find the directory where the file is located 
      //We will do it with cd [directory where file is located], then we will use javac Exercise.java 
      //(it will produce Exercise1.class file which is btyecode of our initial java file) after that we need to type java Exercise(this time without extention)
      // it will run the file and show the output in the command prompt.
   }
}
   