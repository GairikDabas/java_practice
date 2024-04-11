public class Comparison {
    public static void main(String[] args){
        int x =50;
        int y =70;
        int z= 30;
        if(x>y && x>z){
            System.out.println(x + " is the greater than " + y +" and " + z);
        }
        else if(y>z){
            System.out.println(y + " is greater than " + x + " and " + z);
        }
        else{
            System.out.println(z + " is greater than " + x + " and " + y);
        }
    }
}
