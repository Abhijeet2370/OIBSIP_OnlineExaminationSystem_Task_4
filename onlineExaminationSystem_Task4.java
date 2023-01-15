import java.util.Scanner;
public class onlineExaminationSystem_Task4 {

    public static void fun(){
        System.out.println("***** Select option from below *****");
        System.out.println("1. Profile");
        System.out.println("2. Password change");
        System.out.println("3. My Exams");
        System.out.println("4. Logout");
        System.out.println("5. Quit");

    }
    public static void main(String[] args){
        String name = "Abhijeet";
        String examid = "EP01";
        int password = 12345678;
        Scanner obj = new Scanner(System.in);
        System.out.println("----- Examination Portal -----");
        System.out.println("Enter Exam id : ");
        String eId = obj.next();
        System.out.println("Enter Password :");
        int pw = obj.nextInt();
        if(eId.equals(examid) && password==pw){
            System.out.println("Login Successfully");
            System.out.println("Welcome "+name);
        }
        else{
            System.out.println("Invalid credentials");
        }
        fun();
        int op = obj.nextInt();
        switch(op){
            case 1:
                   System.out.println("----- Your Profile -----");
                   System.out.println("Name : "+name);
                   System.out.println("Exam ID : "+examid);
                   System.out.println("Password : "+password);
                   System.out.println("------------------------");
                   fun();
                   op = obj.nextInt();
            case 2:
                 System.out.println("Enter current password : ");
                 int cpassword = obj.nextInt();
                 if(cpassword==password){
                     System.out.println("Enter new password");
                     int npassword = obj.nextInt();
                     npassword = password;
                     System.out.println("Your new password : "+npassword);
                     System.out.println("Password updated successfully");
                 }
                 else{
                    System.out.println("Please enter valid current password");
                 }
                 System.out.println("------------------------");
                 fun();
                 op = obj.nextInt();
            case 3:
                 System.out.println("***** Select your subject *****");
                 System.out.println("1. Java");  
                 System.out.println("2. python");
                 int sub = obj.nextInt();
                 int score = 0;
                 if(sub==1){
                    
                    
                    System.out.println("Q.1 Who invented Java Programming?\n 1) Guido van Rossum\n 2) James Gosling\n 3) Dennis Ritchie\n 4) Bjarne Stroustrup");
                    int jans1=obj.nextInt();
                    if(jans1==2){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.2 Which statement is true about Java?\n 1) Java is a sequence-dependent programming language\n 2) Java is a code dependent programming language\n 3) Java is a platform-dependent programming language\n 4) Java is a platform-independent programming language");
                    int jans2=obj.nextInt();
                    if(jans2==4){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.3 Which one of the following is not a Java feature?\n 1) Object-oriented\n 2) Use of pointers\n 3) Portable\n 4) Dynamic and Extensible");
                    int jans3=obj.nextInt();
                    if(jans3==2){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.4 What is the extension of java code files?\n 1) .js\n 2) .txt\n 3) .class\n 4) .java");
                    int jans4=obj.nextInt();
                    if(jans4==4){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.5 What is the extension of compiled java classes?\n 1) .txt\n 2) .js\n 3) .class\n 4) .java");
                    int jans5=obj.nextInt();
                    if(jans5==3){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.6 Which of these are selection statements in Java?\n 1) break\n 2) continue\n 3) for()\n 4) if()");
                    int jans6=obj.nextInt();
                    if(jans6==4){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.7  Which one of the following is not an access modifier?\n 1) Protected\n 2) Void\n 3) Public\n 4) Private");
                    int jans7=obj.nextInt();
                    if(jans7==2){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.8 Which component is used to compile, debug and execute the java programs?\n 1) JRE\n 2) JIT\n 3) JDK\n 4) JVM");
                    int jans8=obj.nextInt();
                    if(jans8==3){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.9 Which of these cannot be used for a variable name in Java?\n 1) identifier & keyword\n 2) identifier\n 3) keyword\n 4) none of the mentioned");
                    int jans9=obj.nextInt();
                    if(jans9==3){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.10 Which of the following is not an OOPS concept in Java?\n 1) Polymorphism\n 2) Inheritance\n 3) Compilation\n 4) Encapsulation");
                    int jans10=obj.nextInt();
                    if(jans10==3){
                        score++;
                    }
                    else{
                        score = score;
                    }

                    System.out.println("Press 1 to Submit exam");
                    int Submit = obj.nextInt();
                    if(Submit==1){
                        System.out.println(" Submitted ");
                    }
                    else{
                        System.out.println(" ");
                    }

                    System.out.println("Your Score : "+score);
                    if(score>8){
                        System.out.println("Good Performance");
                    }
                    else{
                        System.out.println("Bad Performance");
                    }
                 }
                 else if(sub==2){
                    System.out.println("Q.1 Who developed Python Programming Language?\n a) Wick van Rossum\n b) Rasmus Lerdorf\n c) Guido van Rossum\n d) Niene Stom");
                    int pans1=obj.nextInt();
                    if(pans1==3){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.2 Which type of Programming does Python support?\n a) object-oriented programming\n b) structured programming\n c) functional programming\n d) all of the mentioned");
                    int pans2=obj.nextInt();
                    if(pans2==4){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.3 Which of the following is the correct extension of the Python file?\n a) .python\n b) .pl\n c) .py\n d) .p");
                    int pans3=obj.nextInt();
                    if(pans3==3){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.4 Which of the following is used to define a block of code in Python language?\n a) Indentation\n b) Key\n c) Brackets\n d) All of the mentioned");
                    int pans4=obj.nextInt();
                    if(pans4==1){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.5 Which keyword is used for function in Python language?\n a) Function\n b) def\n c) Fun\n d) Define");
                    int pans5=obj.nextInt();
                    if(pans5==2){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.6 What does pip stand for in python?\n a) Pip Installs Python\n b) Pip Installs Packages\n c) Preferred Installer Program\n d) All of the mentioned");
                    int pans6=obj.nextInt();
                    if(pans6==3){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.7  Which of the following functions is a built-in function in python?\n a) factorial()\n b) print()\n c) seed()\n d) sqrt() ");
                    int pans7=obj.nextInt();
                    if(pans7==2){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.8 Which one of the following is not a keyword in Python language?\n a) pass\n b) eval\n c) assert\n d) nonlocal");
                    int pans8=obj.nextInt();
                    if(pans8==2){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.9 What arithmetic operators cannot be used with strings in Python?\n a) *\n b) -\n c) +\n d) All of the mentioned");
                    int pans9=obj.nextInt();
                    if(pans9==2){
                        score++;
                    }
                    else{
                        score = score;
                    }
                    System.out.println("Q.10 What are the two main types of functions in Python?\n a) System function\n b) Custom function\n c) Built-in function & User defined function\n d) User function");
                    int pans10=obj.nextInt();
                    if(pans10==3){
                        score++;
                    }
                    else{
                        score = score;
                    }
                 }
                 System.out.println("------------------------");
                 fun();
                 op = obj.nextInt();
                 
            case 4:
                 System.out.println("  Logout Successfully ");
                 
                 System.out.println("------------------------");
                 fun();
                 op = obj.nextInt();
            case 5:
                System.out.println("Portal Closed successfully");        
        }
        obj.close();      
    }  
}
