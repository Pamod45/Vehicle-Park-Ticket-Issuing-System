package carparkmanagementsystem.dataStructures;
public class AVLTreeNode {
    int slotNumber;
    public String time="00:00";
    
    int height;
    AVLTreeNode left, right;

    AVLTreeNode(int slotNumber) {
        this.slotNumber = slotNumber;
        height = 1;
    }
}
