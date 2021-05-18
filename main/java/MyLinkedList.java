public class MyLinkedList<K extends Comparable<K>> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode<K> newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode<K> pop() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode<K> popLast() {
        INode<K> tempNode = this.head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public INode search(K key) {
        INode tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if(tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode =tempNode.getNext();
        }
        return null;
    }

    public void searchAndInsert(int myNode, INode myNewNode) {
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey().equals(myNode)) {
                INode temp = tempNode.getNext();
                tempNode.setNext(myNewNode);
                myNewNode.setNext(temp);
                break;
            }
            tempNode = tempNode.getNext();
        }
    }

    public void searchAndDelete(int deleteNode) {
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getNext().getKey().equals(deleteNode)) {
                INode temp = tempNode.getNext().getNext();
                tempNode.setNext(temp);
            }
            tempNode = tempNode.getNext();
        }
    }

    public int size() {
        INode tempNode = head;
        int nodeCount = 0;
        while (tempNode != null) {
            nodeCount++;
            tempNode = tempNode.getNext();
        }
        return nodeCount;
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes:");
        INode<K> tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append(">");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public String toString() {
        return "MyLinkedListNodes{" + head + '}';
    }
}

