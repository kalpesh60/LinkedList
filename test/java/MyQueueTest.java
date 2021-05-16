import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3NumberWhenAddedToQueueShouldHaveFirstAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        INode peak = myQueue.peak();
        Assert.assertEquals(myFirstNode,peak);
    }

    @Test
    public void given3NumberWhenDeletedToQueueShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.dequeue();
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.printQueue();
        INode peak = myQueue.peak();
        Assert.assertEquals(myThirdNode,peak);
    }
}