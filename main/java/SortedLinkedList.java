public class SortedLinkedList {
    public INode head;
    public INode tail;

    public SortedLinkedList() {
        head = null;
        tail = null;
    }

    public void add(INode newNode) {
        INode previousNode = null;
        INode currentNode = this.head;
        while (currentNode != null && currentNode.compareTo(newNode) > 0) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (previousNode == null)
            this.head = newNode;
        else
            previousNode.setNext(newNode);
            newNode.setNext(currentNode);
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes:");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append(">");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}