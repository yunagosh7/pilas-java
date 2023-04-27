import javax.swing.*;

public class Stack {

    private Node lastValueAdded;
    private int size = 0;
    String list = "";

    public Stack() {
        this.lastValueAdded = null;
        this.size = 0;
    }

    public boolean isStackEmpty() {
        return lastValueAdded == null;
    }

    public void insertNode(int node) {
        Node newNode = new Node(node);
        newNode.nextNode = lastValueAdded;
        lastValueAdded = newNode;
        size++;
    }

    public int deleteNode() {
        int aux = lastValueAdded.info;
        lastValueAdded = lastValueAdded.nextNode;
        size--;
        return aux;
    }


    public int showLastValueEntered() {
        return lastValueAdded.info;
    }

    public int stackSize() {
        return size;
    }

    public void clearStack() {
        while (!isStackEmpty()) {
            deleteNode();
        }
    }

    public void showAllItems() {
        Node item = lastValueAdded;

        while (item != null) {
            list += item.info + "\n";

            item = item.nextNode;
        }
        JOptionPane.showMessageDialog(null, list);
        list = "";
    }

}
