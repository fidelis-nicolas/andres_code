package conditions;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your password");
        String password = in.nextLine();

        System.out.println("UserName");
        String userName = in.nextLine();

        if(!password.isEmpty() || !userName.isEmpty()){
            if(userName.equals("fid") & password.equals("12345") ){
                System.out.println("Welcome!!");
            }else{
                System.out.println("You're an intruder!!");
            }
        }else {
            System.out.println("Values cannot be blank!!");
        }
    }
}
