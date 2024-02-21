package carparkmanagementsystem.dataStructures;
import java.util.Date;

public class DayList 
{
    public DailyCustomerList head;
    public DailyCustomerList tail;


    public DailyCustomerList addDay(String date) {
        DailyCustomerList newDay = new DailyCustomerList(date);
        if (head == null) {
            head = tail = newDay;
        } else {
            tail.next = newDay;
            newDay.previous = tail;
            tail = newDay;
        }
        return newDay;
        
    }
    
    public DailyCustomerList getCustomerList(String date){
        DailyCustomerList current = head;
        while(current!=null){
            if(current.date==date){
                return current;
            }
            current = current.next;
        }
        return null;
    }

}