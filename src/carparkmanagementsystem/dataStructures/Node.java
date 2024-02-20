package carparkmanagementsystem.dataStructures;

import java.util.Date;

public class Node 
{
    String enterTime;
    String leaveTime;
    double price;
    Node nextNode;
    Node previousNode;

    public Node(String enterTime, String leaveTime, double price) {
        this.enterTime = enterTime;
        this.leaveTime = leaveTime;
        this.price = price;
    }
}
