package classes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class Test {
    
    public static void main(String... args) {
        
        DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());
        System.out.println(dayOfWeek.toString());
    }
}
