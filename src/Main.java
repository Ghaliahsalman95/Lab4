import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("TEST EACH METHODS OF EACH OBJECT");
//-------------------------CREATE OBJECT----------------------
        Triangle triangle=new Triangle(3,4);
        Rectangle rectangle=new Rectangle(2,2);
        Circle circle=new Circle(5);

        //---------------------------if i use as polymorphism------------
//        Shape triangleShape= new Triangle(3,4);
//        Shape rectangleShape=new Rectangle(2,2);
//        Shape circleShape=new Circle(5);
        System.out.println("--------------Triangle with base is 4 and height is 3---------------");
      //  System.out.println("Its Area is "+triangleShape.calculateArea());
        System.out.println("Its Circumference is "+triangle.calculateCircumference());
      //  System.out.println("Polymorphism Abstraction"); System.out.println("_______________________________________");
        System.out.println();
        System.out.println("Its Area is "+triangle.calculateArea());
        System.out.println("Its Circumference is "+triangle.calculateCircumference());

        System.out.println("--------------Rectangle with height and width are 2---------------");
        System.out.println("Its Area is "+rectangle.calculateArea());
        System.out.println("Its Circumference is "+rectangle.calculateCircumference());
        //System.out.println("Polymorphism Abstraction Rectangle");
      //  System.out.println("_______________________________________");
        System.out.println();
       // System.out.println("Its Area is "+rectangleShape.calculateArea());
     //   System.out.println("Its Circumference is "+rectangleShape.calculateCircumference());
        System.out.println("--------------Circle with radius is 5--------------");
        DecimalFormat decimalFormat=new DecimalFormat("0.00");
        System.out.println("Its Area is "+ decimalFormat.format(circle.calculateArea()));
        System.out.println("Its Circumference is "+ decimalFormat.format(circle.calculateCircumference()));
        System.out.println("_______________________________________");
        System.out.println();
       // System.out.println("Polymorphism Abstraction Circle");
        System.out.println();
//        System.out.println("Its Area is "+ decimalFormat.format(circleShape.calculateArea()));
//        System.out.println("Its Circumference is "+ decimalFormat.format(circleShape.calculateCircumference()));


    }
}