import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args) {
        Authentication user = new Authentication();
        try {
            user.read();
        } catch (UserException e) {
            e.show();
        }
    }
}

class UserException extends Exception {
    void show() {
        System.out.println("Authentication Failed!!");
    }
}

class Authentication {
    String username, password;

    void read() throws UserException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        username = input.nextLine();
        System.out.print("Enter password: ");
        password = input.nextLine();

        if (username.equals("rahul") && password.equals("mca")) {
            System.out.println("Authentication Successful!");
        } else {
            System.out.println("Authentication Failed!");
        }
        input.close();
    }
}