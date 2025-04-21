package classes;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public final class FoodItemHandler {
    
    public static HashMap<String, List<FoodItem>> foodItemsMap = new HashMap<>();
    public final static String[] categoriesArray = new String[] {"foods", "drinks","desserts"};
    
    public static JSONObject foodItem = null;
    
    private static final JSONParser parser = new JSONParser();
    private static final String FOOD_ITEM_PATH = "src\\jsonFiles\\foodItem.json";
    
    private OrderList referencedList;
    private JProgressBar progressBar;
    private DefaultListModel list;
    private boolean alreadyHaveAnOrder;
    
    public FoodItemHandler (OrderList referencedList, JProgressBar progressBar, DefaultListModel list, boolean alreadyHaveAnOrder) {
        
        this.referencedList = referencedList;
        this.progressBar = progressBar;
        this.list = list;
        this.alreadyHaveAnOrder = alreadyHaveAnOrder;
        
        try(FileReader reader = new FileReader(FOOD_ITEM_PATH)) {
            foodItem = (JSONObject) parser.parse(reader);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        convertJsonToList();
    }
    
    private void convertJsonToList () {
        
        for(String categoryString : categoriesArray) {
            
            List<FoodItem> listFoodItems = new ArrayList<>();
            
            JSONArray foodItemsArray = (JSONArray) foodItem.get(categoryString);
            
            for(Object foodItemObject : foodItemsArray) {
                
                JSONObject item = (JSONObject) foodItemObject;
                
                String imagePath = (String) item.get("imagePath");
                String foodName = (String) item.get("foodName");
                String foodType = (String) item.get("foodType");
                Integer foodPrice =  Integer.valueOf(String.valueOf(item.get("foodPrice")));
                Integer amountBought =  Integer.valueOf(String.valueOf(item.get("amountBought")));
                
                FoodItem newItem = new FoodItem(imagePath, foodName, foodType, foodPrice, amountBought);
                
                newItem.setReferencedList(referencedList);
                newItem.setProgressBar(progressBar);
                newItem.setList(list);
                newItem.setAlreadyHaveAnOrder(alreadyHaveAnOrder);
                
                listFoodItems.add(newItem);
            }
            
            foodItemsMap.put(String.valueOf(categoryString), listFoodItems);
        }
    }
}
