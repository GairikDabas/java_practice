package Assignments;

public class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;

    }

    public Rectangle RectangleArea(){
        double area = length * breadth;
        System.out.println("The area of rectangle is :" + area) ;
        return null;

    }
    public Rectangle RectangleParameter(){
         double parameter = 2 *(length + breadth);
        System.out.println("The parameter of rectangle is :" + parameter);
        return null;
    }


}
