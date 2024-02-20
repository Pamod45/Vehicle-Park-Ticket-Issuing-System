package carparkmanagementsystem.dataStructures;
import java.util.Date;

public class DailyCustomerList 
{
    Node head;
    Node tail;
    String date;
    double dailyTotal;
    DailyCustomerList next;
    DailyCustomerList previous;
    
    public DailyCustomerList(){
        
    }
    
    public DailyCustomerList(String date) {
        this.date = date;
        this.dailyTotal = 0.0;
    }

    public void addCustomerFront(String enterTime, String leaveTime, double price) {
        Node newNode = new Node(enterTime, leaveTime, price);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            newNode.previousNode = tail;
            tail = newNode;
        }
        dailyTotal += price;
    }
    
    public void addCustomer(String enterTime, String leaveTime, double price){
        Node newNode = new Node(enterTime, leaveTime, price);
        if(tail==null){
            tail = head = newNode;
        }
        else{
            tail.nextNode=newNode;
            newNode.previousNode = tail;
            tail = newNode;
        }
        dailyTotal += price;
    }

    public void displayCustomers() {
        Node current = head;
        while (current != null) {
            System.out.println("Enter Time: " + current.enterTime);
            System.out.println("Leave Time: " + current.leaveTime);
            System.out.println("Price: Rs " + current.price);
            System.out.println("--------------------------");
            current = current.nextNode;
        }
        System.out.println("Daily Total Earnings: $" + dailyTotal);
    }
}