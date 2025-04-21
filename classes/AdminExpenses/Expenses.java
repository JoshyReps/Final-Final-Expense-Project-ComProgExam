package classes.AdminExpenses;

import classes.FoodType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Expenses {
    
    private final FoodType type;
    
    private int sum;
    
    private final List<Object[]> overall;
    
    private final List<Object[]> daily;
    private final List<Object[]> weekly;
    private final List<Object[]> monthly;
    
    private final List<List<Object[]>> dailyPur;
    private final List<List<Object[]>> weeklyPur;
    private final List<List<Object[]>> monthlyPur;
    
    public Expenses(FoodType type) {
        
        this.type = type;
        
        overall = new ArrayList<>();
        
        daily = new ArrayList<>();
        weekly = new ArrayList<>();
        monthly = new ArrayList<>();
        
        dailyPur = new ArrayList<>();
        weeklyPur = new ArrayList<>();
        monthlyPur = new ArrayList<>();
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
    public FoodType getType() {
        return type;
    }
    
    public List<Object[]> getOverall() {
        return overall;
    }

    public List<Object[]> getDaily() {
        return daily;
    }

    public List<Object[]> getWeekly() {
        return weekly;
    }

    public List<Object[]> getMonthly() {
        return monthly;
    }

    public List<List<Object[]>> getDailyPur() {
        return dailyPur;
    }

    public List<List<Object[]>> getWeeklyPur() {
        return weeklyPur;
    }
    
    public List<List<Object[]>> getMonthlyPur() {
        return monthlyPur;
    }

    private double getAverage (List<Object[]> list) {
        
        double sum = 0;
        
        for (var item : list) {
            
            double number = (Double) item[2];
            sum += number;
        }
        
        return sum / list.size();
    }
    
    private int getSalesAverage (List<Object[]> list) {
        
        int sum = 0;
        
        for (var item : list) {
            
            int number = (int) item[1];
            sum += number;
        }
        
        
        
        return sum / list.size(); 
    }
    
    public double getOverallAverage() {
        return getAverage(overall);
    }
    
    public double getDailyAverage() {
        return getAverage(daily);
    }
    
    public double getWeeklyAverage() {
        return getAverage(weekly);
    }
    
    public double getMonthlyAverage() {
        return getAverage(monthly);
    }
    
    
    public int getOverallSalesAverage() {
        return getSalesAverage(overall);
    }
    
    public int getDailySalesAverage() {
        return getSalesAverage(daily);
    }
    
    public int getWeeklySalesAverage() {
        return getSalesAverage(weekly);
    }
    
    public int getSalesAverage() {
        return getSalesAverage(monthly);
    }
    
    public Object[] getRecentDay () {
        return daily.getLast();
    }
    
    public Object[] getRecentWeek () {
        return weekly.getLast();
    }
    
    public Object[] getRecentMonth () {
        return monthly.getLast();
    } 
    
    
   
}
