public class MyNode<K extends Comparable<K>> implements INode<K> {
    private K key;
    private  INode<K> next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;

    }

    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode<K> next) {
        this.next = next;
    }

    @Override
    public int compareTo(INode<K> newNode) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{" + "K=").append(key).append("V=").append('}');
        if (next != null)
            myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();
    }
}