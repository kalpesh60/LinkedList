public interface INode<K extends Comparable<K>> {
    K getKey();
    void setKey(K key);

    INode<K> getNext();
    void setNext(INode<K> next);

    int compareTo(INode<K> newNode);
}
