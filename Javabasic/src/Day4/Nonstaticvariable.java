package Day4;

public class Nonstaticvariable {
    int age=10;
    short rollno=12;
	public static void main(String[] args) {
		Nonstaticvariable x1= new Nonstaticvariable(); //object is mandatory in Non static variable and x1 is called reference
		//Nonstaticvariable x2= new Nonstaticvariable();  
       System.out.println("Program Starts");
       System.out.println("1st ref of Nonstaticvariable:" + x1.age);
       System.out.println("1st ref of Nonstaticvariable:" + x1.rollno);
       x1.age=13;
       x1.rollno=20;
       System.out.println("2nd new ref of Nonstativvariable:" + x1.age);
       System.out.println("2nd new ref of Nonstaticvariable:" + x1.rollno);
       Nonstaticvariable x2= new Nonstaticvariable();
       System.out.println("2nd ref of Nonstaticvariable:" + x2.age);
       System.out.println("2nd ref of Nonstaticvariable:" + x2.rollno);
       x1.age=65;
       x1.rollno=20000;
       System.out.println("2nd new ref of Nonstativvariable:" + x1.age);
       System.out.println("2nd new ref of Nonstaticvariable:" + x1.rollno);
       
       System.out.println("Program Ends");
	}

}
