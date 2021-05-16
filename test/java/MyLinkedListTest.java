import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumberWhenAppendedToLinkedListShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumberWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.pop();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.popLast();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNumberWhenSearchShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        INode result = myLinkedList.search(30);
        Assert.assertEquals(result,mySecondNode);
    }

    @Test
    public void givenNumberWhenInsertingInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myNewNode = new MyNode<>(40);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.searchAndInsert(30,myNewNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.getNext().equals(mySecondNode) &&
                         mySecondNode.getNext().equals(myNewNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFourNumberWhenDelatingInBetweenOneShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myNewNode = new MyNode<>(40);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.searchAndInsert(30,myNewNode);
        myLinkedList.searchAndDelete(40);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.getNext().equals(mySecondNode) &&
                         mySecondNode.getNext().equals(myThirdNode) &&
                         myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
        System.out.println("Linked List Size = " +myLinkedList.size());
    }

    @Test
    public void given4NumbersWhenAddedToListShouldAddNodesInAscendingOrder() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(40);
        MyNode<Integer> myFourthNode=new MyNode<>(70);
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        sortedLinkedList.add(myFirstNode);
        sortedLinkedList.add(mySecondNode);
        sortedLinkedList.add(myThirdNode);
        sortedLinkedList.add(myFourthNode);
        sortedLinkedList.printMyNodes();
        boolean result = sortedLinkedList.head.equals(mySecondNode) &&
                sortedLinkedList.head.getNext().equals(myThirdNode) &&
                myThirdNode.getNext().equals(myFirstNode) &&
                myFirstNode.getNext().equals(myFourthNode);
        Assert.assertTrue(result);
    }
}