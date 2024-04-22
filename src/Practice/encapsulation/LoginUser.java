package Practice.encapsulation;

public class LoginUser {
    private String userName;
    private String password;

    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void isAuthenticatedUser(String userName, String password){
        if(this.userName.equals(userName) && this.password.equals(password)){
            System.out.println("You are  authenticated as an user ");
            System.out.println("Welcomne " + userName);
        } else {
            System.out.println("Invalid User !! Please try again later :) ");
        }
    }
}
