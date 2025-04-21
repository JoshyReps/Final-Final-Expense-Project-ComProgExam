package classes;

import frames.BetterAdminAnalysis;
import frames.BetterFoodMenu;
import frames.BetterLogIn;
import frames.BetterStudentProfile;

public class ExpenseProject {
    
    public static BetterLogIn logIn;
    public static BetterStudentProfile studentProfile;
    public static BetterFoodMenu foodMenu;
    public static BetterAdminAnalysis admin;
    
    public static void main(String[] args) {
        
        new AccountHandler();
        
        logIn = new BetterLogIn();
        admin = new BetterAdminAnalysis();
    }
}
