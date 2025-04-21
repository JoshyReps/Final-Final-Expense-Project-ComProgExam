
package classes;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class SimplifiedAccount {
    
    private JSONObject account;
    
    private String username;
    private String password;
    private Rank rank;
    private JSONArray weeklyPerformance;
    private String expensesPath;
    private String orderPath;
    private Double budgetGoal;
    private int level;
    
    public SimplifiedAccount(JSONObject account) {
        
        this.account = account;
        
        this.username = this.<String>getValue("username");
        this.password = this.<String>getValue("password");
        stringToRank((String) account.get("rank"));
        this.weeklyPerformance = (JSONArray) account.get("weeklyPerformance");
        this.expensesPath = this.<String>getValue("expensesPath");
        this.orderPath = this.<String>getValue("orderPath");
        this.budgetGoal = this.<Double>getValue("budgetGoal");
        this.level = Integer.parseInt(String.valueOf(account.get("level")));
        
    }
    
    
    private <T> T getValue (String key) {
        return (T) account.get(key);
    }
    
    
    private List<String> jsonArrayToList (JSONArray jsonArray) {
        
        if(jsonArray == null) return null;
        
        var list = new ArrayList<String>();
        for(Object object : jsonArray) list.add(String.valueOf(object));
        return list;
    }
    
    
    private void stringToRank(String rank) {
        
        this.rank = switch(rank) {
            case "BRONZE" -> Rank.BRONZE;
            case "SILVER" -> Rank.SILVER;
            case "ROSE" -> Rank.ROSE;
            case "GOLD" -> Rank.GOLD;
            case "ELITE" -> Rank.ELITE;
            case "PREMIUM" -> Rank.PREMIUM;
            default -> null;
        };
    }
    
    
    private Boolean[] weekBooleanArrayConversion (JSONArray jsonArray) {
        
        int numOfDaysInAWeek = 7;
        
        Boolean[] weekPerformanceBooleanArray = new Boolean[numOfDaysInAWeek];
        
        for (int i = 0; i < numOfDaysInAWeek; i++) {
            weekPerformanceBooleanArray[i] = (Boolean) jsonArray.get(i);
        }
        
        return weekPerformanceBooleanArray;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public JSONArray getWeeklyPerformance() {
        return weeklyPerformance;
    }

    public String getExpensesPath() {
        return expensesPath;
    }

    public void setExpensesPath(String expensesPath) {
        this.expensesPath = expensesPath;
    }

    public JSONObject getAccount() {
        return account;
    }

    public void setAccount(JSONObject account) {
        this.account = account;
    }

    public String getOrderPath() {
        return orderPath;
    }

    public void setOrderPath(String orderPath) {
        this.orderPath = orderPath;
    }
    
    public Double getBudgetGoal() {
        return budgetGoal;
    }

    public void setBudgetGoal(Double budgetGoal) {
        this.budgetGoal = budgetGoal;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        
        this.level = level;
        
        if(level >= 42) {
            this.rank = Rank.PREMIUM;
        }
        else if (level >= 35) {
            this.rank = Rank.ELITE;
        }
        else if (level >= 28) {
            this.rank = Rank.ROSE;
        }
        else if (level >= 21) {
            this.rank = Rank.GOLD;
        }
        else if (level >= 14) {
            this.rank = Rank.SILVER;
        }
        else {
            this.rank = Rank.BRONZE;
        }
        
        AccountHandler.updateJSONFile(this.username, "rank", this.rank.toString());
    }
    
    public Object getDayInWeeeklyPerformance(String dayOfWeek) {
        
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
        
        return weeklyPerformance.get(intDayOfWeek);
    }
    
    public void setDayInWeeklyPerformance(String dayOfWeek, Object result) {
        
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
        
        weeklyPerformance.set(intDayOfWeek, result);
    }
    
    public JSONArray getOrder () {
        
        JSONArray accountOrder = new JSONArray();
        
        try (FileReader reader = new FileReader(orderPath)) {
            accountOrder = (JSONArray) ((JSONObject) new JSONParser().parse(reader)).get("order");
        }
        catch (Exception e) {
            System.out.println(e + " mewtwo");
        }
        
        return accountOrder;
    }
    
    public int getOrderSum() {
        
        int sum = 0;
        
        for(Object o : getOrder()) {
            
            JSONObject jo = (JSONObject) o;
            int price = Integer.parseInt(String.valueOf(jo.get("price")));
            sum += price;
        }
        
        return sum;
    }
    
    
    
    public void print() {

        System.out.println(username);
        System.out.println(password);
        System.out.println(rank);
        System.out.println(weeklyPerformance);
        System.out.println(expensesPath);
        System.out.println(orderPath);
        System.out.println(budgetGoal);
    }
}
