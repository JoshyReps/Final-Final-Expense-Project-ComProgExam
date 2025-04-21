package classes;

import frames.BetterAdminAnalysis;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class OrderListHandler {
    
    private JSONObject orderJSON;
    private JSONArray allOrders;
    private final String FILE_PATH = "src\\jsonFiles\\orders.json";
    
    public OrderListHandler () {
        
        try(FileReader reader = new FileReader(FILE_PATH)) {
            orderJSON = (JSONObject)new JSONParser().parse(reader);
            allOrders = (JSONArray) orderJSON.get("orders");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
    private JSONObject findItem (String username) {
        
        for(Object o : allOrders) {
            
            JSONObject jo = (JSONObject) o;
            
            String joUsername = (String) jo.get("username");
            if(joUsername.equals(username)) return jo;
        }
        
        return null;
    }
    
    public void removeItem (String username) {
        
        JSONObject foundItem = findItem(username);
        
        if(foundItem == null) return;
        
        allOrders.remove(foundItem);
        save();
    }
    
    public void addItem(String username, String orderPath, int totalItems, int totalCost) {
        
        JSONObject newOrder = new JSONObject();
        
        newOrder.put("username", username);
        newOrder.put("orderPath", orderPath);
        newOrder.put("totalItems", totalItems);
        newOrder.put("totalCost", totalCost);
        newOrder.put("date", LocalDate.now().toString());
        newOrder.put("time", LocalTime.now().toString().substring(0, LocalTime.now().toString().lastIndexOf(":")));

        allOrders.add(newOrder);
        save();
        
        Object[] newOrderObjectAr = {username, totalCost, totalItems, LocalDate.now().toString(), LocalTime.now().toString().substring(0, LocalTime.now().toString().lastIndexOf(":"))};
        
        ExpenseProject.admin.model.addRow(newOrderObjectAr);
    }
    
    public JSONObject getItem (int index) {
        return (JSONObject) allOrders.get(index);
    }
    
    public JSONObject getItemBasedUsername (String username) {
        
        for(Object o : allOrders) {
            JSONObject jo = (JSONObject) o;
            
            String joUsername = (String) jo.get("username");
            
            if(joUsername.equals(username)) {
                return jo;
            }
        }
        
        return null;
    }
    
    public JSONObject getOrder (int index) {
        
        return (JSONObject) allOrders.get(index);
    }
    
    public JSONArray getOrderPath(int index) {
        
        JSONObject jsonOrder = (JSONObject) allOrders.get(index);
        
        String orderPath = (String) jsonOrder.get("orderPath");
        
        JSONArray jsonOrderArray = null;
        
        try(FileReader reader = new FileReader(orderPath)) {
            jsonOrderArray = (JSONArray) ((JSONObject) new JSONParser().parse(reader)).get("order");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        return jsonOrderArray;
    }
    
    private void save() {
        
        try(FileWriter writer = new FileWriter(FILE_PATH)) {
            orderJSON.put("orders", allOrders);
            writer.write(orderJSON.toJSONString());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public JSONArray getAllOrders() {
        return allOrders;
    }
}
