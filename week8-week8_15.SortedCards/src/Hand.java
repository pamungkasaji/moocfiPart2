
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable <Hand>{

    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    public void add(Card card){
        hand.add(card);
    }

    public void sort(){
        Collections.sort(hand);
    }

    public void print(){
        for (Card card : hand){
            System.out.println(card);
        }
    }

    @Override
    public int compareTo(Hand o) {
        int value1 = 0, value2 = 0;
        for (Card card : this.hand){
            value1 += card.getValue();
        }
        for (Card card : o.hand){
            value2 += card.getValue();
        }
        return value1 - value2;
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
        //hand.sort(new SortAgainstSuitAndValue());
    }
}
