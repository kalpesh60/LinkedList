public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(MyBinaryNode<K> root) {
        return root == null ? 0 : 1 + this.getSizeRecursive(root.left)
                                    +this.getSizeRecursive(root.right);
    }

    public K search(K key) {
        return key = this.searchRecursive(root, key);
    }

    private K searchRecursive(MyBinaryNode<K> current, K key) {
        K searchKey = null;
        if (current == null || current.key == key)
            return current.key;
        int compareResult = key.compareTo(current.key);
        if (compareResult < 0)
            searchKey = searchRecursive(current.left, key);
        if (compareResult > 0)
            searchKey = searchRecursive(current.right, key);
        return searchKey;
    }
}