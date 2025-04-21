package classes;

import java.util.Comparator;

public class ComparatorClasses {

    public static int indexOfValueField;
    public static boolean fromDaily;
    
    private ComparatorClasses() {
        // Private constructor to prevent instantiation
    }

    public static Comparator<Object[]> getComparator(int index) {
        
        return switch (index) {
            case 0 -> new NewestComparator();
            case 1 -> new OldestComparator();
            case 2 -> new MostBoughtComparator();
            case 3 -> new LeastBoughtComparator();
            default -> null;
        };
    }

    private static int compareAt(Object[] o1, Object[] o2, int index, boolean ascending) {
        
        Double val1 = Double.valueOf(String.valueOf(o1[index]));
        Double val2 = Double.valueOf(String.valueOf(o2[index]));
        
        boolean is1or0 = index == 0 || index == 1;
        
        if(fromDaily && is1or0) {
            
            String date1 = String.valueOf(o1[1]);
            String date2 = String.valueOf(o2[1]);
            
            Integer getYear1 = Integer.valueOf(date1.substring(0, date1.indexOf("-")));
            Integer getMonth1 = Integer.valueOf(date1.substring(date1.indexOf("-") + 1, date1.lastIndexOf("-")));
            Integer getDay1 = Integer.valueOf(date1.substring(date1.lastIndexOf("-") + 1));
            
            Integer getYear2 = Integer.valueOf(date2.substring(0, date2.indexOf("-")));
            Integer getMonth2 = Integer.valueOf(date2.substring(date2.indexOf("-") + 1, date2.lastIndexOf("-")));
            Integer getDay2 = Integer.valueOf(date2.substring(date2.lastIndexOf("-") + 1));
            
            if(!ascending) {
                if(getYear1.equals(getYear2)) {
                    if(getMonth1.equals(getMonth2)) {
                        return getDay2.compareTo(getDay1);
                    }
                    else {
                        return getMonth2.compareTo(getMonth1);
                    }
                }
                else {
                    return getYear2.compareTo(getYear1);
                }
            }
            else {

                if(getYear1.equals(getYear2)) {
                    if(getMonth1.equals(getMonth2)) {
                        return getDay2.compareTo(getDay1);
                    }
                    else return getMonth1.compareTo(getMonth2);
                }
                else return getYear1.compareTo(getYear2);
            }
        }
        
        return ascending ? val2.compareTo(val1) : val1.compareTo(val2);
    }

    private static class NewestComparator implements Comparator<Object[]> {
        @Override
        public int compare(Object[] o1, Object[] o2) {
            return compareAt(o1, o2, 0, false);
        }
    }


    private static class OldestComparator implements Comparator<Object[]> {
        @Override
        public int compare(Object[] o1, Object[] o2) {
            return compareAt(o1, o2, 0, true);
        }
    }

    private static class MostBoughtComparator implements Comparator<Object[]> {
        @Override
        public int compare(Object[] o1, Object[] o2) {
            return compareAt(o1, o2, indexOfValueField, true);
        }
    }

    private static class LeastBoughtComparator implements Comparator<Object[]> {
        @Override
        public int compare(Object[] o1, Object[] o2) {
            return compareAt(o1, o2, indexOfValueField, false);
        }
    }
}
