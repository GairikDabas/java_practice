package Practice;

public class Student {
    int id = 102;
    String name ="Gairik";
    public Student(){
        System.out.println("inside the default const ");
    }

    public Student(int id) {
        this(); // this calls the default constructor
        System.out.println(" Inside the id parameter const ");
        this.id = id;
    }

    public Student(int id, String name) {
        this(101);
        System.out.println(" inside id , name parameter const ");
        this.id = id;
        this.name = name;
    }

    public void printStudent(int id, String name){
        System.out.println(this.id);
        System.out.println(this.name);
    }
    public static void main(String[] args){
        Student student = new Student(101, "Pragra");
    }
}
