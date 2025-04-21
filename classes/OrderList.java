package classes;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

record PurchaseItem (String foodName, String foodType, Integer price, String dateBought, Integer weekYearBought, Integer intMonthBought, Integer budgetGoal){};

public class OrderList {
    
    private final List<PurchaseItem> orderList;
    private Integer sum = 0;
    
    public OrderList () {
        orderList = new ArrayList<>();
    }
    
    public void addFoodItem(FoodItem foodItem, Double budgetGoal) {
        
        LocalDate dateBought = LocalDate.now();
        
        String foodName = foodItem.getName();
        String foodType = foodItem.getType();
        Integer foodPrice = foodItem.getPrice();
        String dateBoughtString = dateBought.toString();
        Integer weekYearBought = dateBought.get(WeekFields.of(Locale.getDefault()).weekOfYear());
        Integer intMonthBought = dateBought.getMonthValue();
        
        PurchaseItem newFoodItem = new PurchaseItem(foodName, foodType, foodPrice, dateBoughtString, weekYearBought, intMonthBought, budgetGoal.intValue());
        
        orderList.add(newFoodItem);
        sum += foodPrice;
    }
    
    public void removeFoodItem (String foodName) {
        
        orderList.forEach(e -> {
            if(e.foodName().equals(foodName)) orderList.remove(e);
        });
    }
    
    public void removeFoodItem (int index) {
        
        sum -= orderList.get(index).price();
        orderList.remove(index);
    }
    
    public int getSize() {
        return orderList.size();
    }
    
    public int getTotalPrice () {
        return sum;
    }
    
    public void printItem () {
        orderList.forEach(System.out::println);
    }
    
    public JSONArray orderListToJSONArray() {
        
        JSONArray toJSONArray = new JSONArray();
        
        for(PurchaseItem item : orderList) {
            
            JSONObject newItem = new JSONObject();
            
            newItem.put("foodName", item.foodName());
            newItem.put("price", item.price());
            newItem.put("type", item.foodType());
            newItem.put("date", item.dateBought());
            newItem.put("weekYearBought", item.weekYearBought());
            newItem.put("monthBoughtInNum", item.intMonthBought());
            newItem.put("budgetGoal", item.budgetGoal());
            
            toJSONArray.add(newItem);
        }
        
        return toJSONArray;
    }
}
