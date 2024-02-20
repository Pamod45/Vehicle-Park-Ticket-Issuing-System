package carparkmanagementsystem.dataStructures;

class ParkingSlot {
    int slotNumber;
    int parkedTime;

    ParkingSlot(int slotNumber, int parkedTime) {
        this.slotNumber = slotNumber;
        this.parkedTime = parkedTime;
    }
}

class AVLTreeNode {
    int slotNumber, height;
    ParkingSlot slot;
    AVLTreeNode left, right;

    AVLTreeNode(int slotNumber) {
        this.slotNumber = slotNumber;
        height = 1;
    }
}

public class AVLTree {
    AVLTreeNode root;
    static final int MAX_SLOTS = 8;
    ParkingSlot[] parkingSlots;

    AVLTree() {
        parkingSlots = new ParkingSlot[MAX_SLOTS];
        for (int i = 0; i < MAX_SLOTS; i++) {
            parkingSlots[i] = new ParkingSlot(i + 1, 0);
        }
    }

    int height(AVLTreeNode node) {
        if (node == null)
            return 0;
        return node.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    AVLTreeNode rightRotate(AVLTreeNode y) {
        AVLTreeNode x = y.left;
        AVLTreeNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    AVLTreeNode leftRotate(AVLTreeNode x) {
        AVLTreeNode y = x.right;
        AVLTreeNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int getBalance(AVLTreeNode node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    AVLTreeNode insert(AVLTreeNode node, int slotNumber, ParkingSlot slot) {
        if (node == null)
            return (new AVLTreeNode(slotNumber));

        if (slotNumber < node.slotNumber)
            node.left = insert(node.left, slotNumber, slot);
        else if (slotNumber > node.slotNumber)
            node.right = insert(node.right, slotNumber, slot);
        else
            return node;

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && slotNumber < node.left.slotNumber)
            return rightRotate(node);

        if (balance < -1 && slotNumber > node.right.slotNumber)
            return leftRotate(node);

        if (balance > 1 && slotNumber > node.left.slotNumber) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && slotNumber < node.right.slotNumber) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    AVLTreeNode minValueNode(AVLTreeNode node) {
        AVLTreeNode current = node;

        while (current.left != null)
            current = current.left;

        return current;
    }

    AVLTreeNode deleteNode(AVLTreeNode root, int slotNumber) {
        if (root == null)
            return root;

        if (slotNumber < root.slotNumber)
            root.left = deleteNode(root.left, slotNumber);
        else if (slotNumber > root.slotNumber)
            root.right = deleteNode(root.right, slotNumber);
        else {
            if ((root.left == null) || (root.right == null)) {
                AVLTreeNode temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;

                if (temp == null) {
                    temp = root;
                    root = null;
                } else
                    root = temp;
            } else {
                AVLTreeNode temp = minValueNode(root.right);
                root.slotNumber = temp.slotNumber;
                root.right = deleteNode(root.right, temp.slotNumber);
            }
        }

        if (root == null)
            return root;

        root.height = max(height(root.left), height(root.right)) + 1;

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    AVLTreeNode search(AVLTreeNode root, int slotNumber) {
        if (root == null || root.slotNumber == slotNumber)
            return root;

        if (root.slotNumber < slotNumber)
            return search(root.right, slotNumber);

        return search(root.left, slotNumber);
    }

    void updateTime(int slotNumber, int time) {
        parkingSlots[slotNumber - 1].parkedTime = time;
    }

    void displaySlots() {
        for (int i = 0; i < MAX_SLOTS; i++) {
            System.out.println("Slot " + parkingSlots[i].slotNumber + ": Time: " + parkingSlots[i].parkedTime);
        }
    }

    public static void main(String[] args) {
        AVLTree parkingManager = new AVLTree();

        parkingManager.root = parkingManager.insert(parkingManager.root, 4, parkingManager.parkingSlots[0]);
        parkingManager.root = parkingManager.insert(parkingManager.root, 2, parkingManager.parkingSlots[1]);
        parkingManager.root = parkingManager.insert(parkingManager.root, 6, parkingManager.parkingSlots[2]);
        parkingManager.root = parkingManager.insert(parkingManager.root, 1, parkingManager.parkingSlots[3]);
        parkingManager.root = parkingManager.insert(parkingManager.root, 3, parkingManager.parkingSlots[4]);
        parkingManager.root = parkingManager.insert(parkingManager.root, 5, parkingManager.parkingSlots[5]);
        parkingManager.root = parkingManager.insert(parkingManager.root, 7, parkingManager.parkingSlots[6]);
        parkingManager.root = parkingManager.insert(parkingManager.root, 8, parkingManager.parkingSlots[7]);

        System.out.println("Initial Parking Slots:");
        parkingManager.displaySlots();

        parkingManager.updateTime(3, 10);
        System.out.println("\nUpdated Parking Slots:");
        parkingManager.displaySlots();
    }
}