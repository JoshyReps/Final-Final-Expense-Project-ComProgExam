
package classes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public final class AccountHandler {
    
    public static JSONArray accounts = null;
    public static JSONObject account = null;
    private static final JSONParser parser = new JSONParser();
    private static final String FILE_PATH = "src/jsonFiles/accounts.json";
    
    public static int currentAccountIndex = -1;
    
    static {
        
        try(FileReader reader = new FileReader(FILE_PATH)) {
            account = (JSONObject) parser.parse(reader);
            accounts = (JSONArray) account.get("accounts");
        }
        catch(Exception e) {
            System.out.println("e");
        }
    }
    
    public static JSONObject findAccount(String username) {
        
        int index = 0;
        
        for (Object accountObject : accounts) {
            
            JSONObject accountJSONObject = (JSONObject) accountObject;
            String currentAccountUsername = (String) accountJSONObject.get("username");
            
            if(currentAccountUsername.equals(username)) {
                currentAccountIndex = index; return accountJSONObject;
            }
            
            index++;
        }
        
        return null;
    }
    
    
    public static JSONObject addAccount (String username, String password) {
        
        JSONObject supposedAccount = findAccount(username);
        
        if(supposedAccount != null) {
            JOptionPane.showMessageDialog(null, "Username Has Been Taken..."); return null;
        }
        else if (password.isBlank() && password.length() < 5) {
            JOptionPane.showMessageDialog(null, "New Password is too Short (Min : 5)"); return null;
        }
        
        JSONObject newAccount = new JSONObject();
        
        //username, password, restrictions, total spent, rank ------------------
        newAccount.put("username", username);
        newAccount.put("password", password);
        newAccount.put("rank", "BRONZE");
        //----------------------------------------------------------------------
        
        //weekly performance ---------------------------------------------------
        JSONArray weeklyPerformance = new JSONArray();
        for (int i = 0; i < 7; i++)  weeklyPerformance.add(null);
        //----------------------------------------------------------------------
        
         //weekly performance, budget plan, budget Goal, Goal Fulfilled, and Goal Misses -------------------------------------
        newAccount.put("weeklyPerformance", weeklyPerformance);
        newAccount.put("budgetGoal", 0.0);
        //----------------------------------------------------------------------
        
        //expense path ---------------------------------------------------------
        final String pathExpense = "src/expensesJson/" + username + "_expenses.json";
        
        try{
            
            File myObj = new File(pathExpense);
            
            if (myObj.createNewFile())System.out.println("File created: " + myObj.getName());
            
            try (FileWriter writer = new FileWriter(pathExpense)) {
                
                JSONObject newExpense = new JSONObject();
                newExpense.put("expenses", new JSONArray());
                writer.write(newExpense.toJSONString());
            }
            catch (Exception e) {
                System.out.println(e);
            }

        } 
        catch (IOException e) {
            System.out.println(e);
        }
        newAccount.put("expensesPath", pathExpense);
        //----------------------------------------------------------------------
        
        //order path -----------------------------------------------------------
        
        final String pathOrder = "src/ordersJson/" + username + "_orders.json";
        
        try{
            
            File myObj = new File(pathOrder);
            
            if (myObj.createNewFile()) System.out.println("File created: " + myObj.getName());
            
            try (FileWriter writer = new FileWriter(pathOrder)) {
                
                JSONObject newOrder = new JSONObject();
                newOrder.put("order", new JSONArray());
                writer.write(newOrder.toJSONString());
            }
            catch (Exception e) {
                System.out.println(e);
            }

        } 
        catch (IOException e) {
            System.out.println(e);
        }
        
        newAccount.put("orderPath", pathOrder);
        
        // ---------------------------------------------------------------------
        
        //saved budget plan ----------------------------------------------------
        newAccount.put("level", 0);
        //----------------------------------------------------------------------
        
        JOptionPane.showMessageDialog(null, "Successfully Added Account");
        accounts.add(newAccount);
        saveJSONFile();
        
        return newAccount;
    }
    
    public static void updateWeeklyPerformance (String username, String dayOfWeek, Object result) {
        
        JSONObject foundAaccount = findAccount(username);
        
        var intDayOfWeek = switch(dayOfWeek) {
            case "MONDAY" -> 0;
            case "TUESDAY" -> 1;
            case "WEDNESDAY" -> 2;
            case "THURSDAY" -> 3;
            case "FRIDAY" -> 4;
            case "SATURDAY" -> 5;
            case "SUNDAY" -> 6;
            default -> -1;
        };
        
        JSONArray accountWeeklyPerformance = (JSONArray) foundAaccount.get("weeklyPerformance");
        
        accountWeeklyPerformance.set(intDayOfWeek, result);
        saveJSONFile();
    }
    
    public static void updateJSONFile(String username, String key, Object newValue) {
        
        JSONObject loggedAccount = findAccount(username);
        
        if(loggedAccount == null) return;
        
        loggedAccount.put(key, newValue);
        saveJSONFile();
    }
    
    public static void updateOrderFile(String username, String orderPath, OrderList newOrder) {
        
        JSONObject order = new JSONObject();
        
        order.put("order", newOrder.orderListToJSONArray());
        
        try(FileWriter writer = new FileWriter(orderPath)){
            writer.write(order.toJSONString());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public static void addExpenses (String username, JSONArray newExpenses) {
        
        JSONObject foundAccount = findAccount(username);
        
        String expensePath = (String) foundAccount.get("expensesPath");
        JSONObject expense = new JSONObject();
        JSONArray expenses = new JSONArray();
        
        try(FileReader reader = new FileReader(expensePath)){
            expense = (JSONObject) new JSONParser().parse(reader);
            expenses = (JSONArray) expense.get("expenses");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        for(Object o : newExpenses) {
            
            JSONObject jo = (JSONObject) o;
            expenses.add(jo);
        }
        
        try(FileWriter writer = new FileWriter(expensePath)) {
            expense.put("expenses", expenses);
            writer.write(expense.toJSONString());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void saveJSONFile() {
        
        try(FileWriter writer = new FileWriter(FILE_PATH)) {
            account.put("accounts", accounts);
            writer.write(account.toJSONString());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
