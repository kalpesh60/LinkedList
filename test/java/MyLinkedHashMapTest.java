import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {
    @Test
    public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid but " +
                          "because they keep putting themselves deliberately into " +
                          "paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myLinkedHashMap.add(word, value);
        }
        System.out.println(myLinkedHashMap);
        int frequency = myLinkedHashMap.get("paranoid");
        Assert.assertEquals(3,frequency);
    }

    @Test
    public void givenSentenceWhenAvoidableIsRemovedListShouldReturnAvoidableFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid but " +
                          "because they keep putting themselves deliberately into " +
                          "paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myLinkedHashMap.add(word, value);
        }
        myLinkedHashMap.get("avoidable");
        myLinkedHashMap.remove("avoidable");
        System.out.println(myLinkedHashMap.toString());
        System.out.println("Frequency after deletion : " + myLinkedHashMap.get("avoidable"));
        Assert.assertEquals(null,myLinkedHashMap.get("avoidable"));
    }
}
