package Practice.encapsulation;

public class LoginMain {
    public static void main(String[] args) {
        LoginUser loginuser = new LoginUser("Gairik" , " Gairik1234");
        loginuser.isAuthenticatedUser("Gairik", " gairik");
        String userName = loginuser.getUserName();
        System.out.println("My username " + userName);
        loginuser.setPassword("Dabas1234");
        loginuser.isAuthenticatedUser("Gairik" , "Dabas1234");

    }
}
