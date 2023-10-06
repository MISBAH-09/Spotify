package Card_Game;
import java.util.Random;
public class Deck {
private final int DECK_SIZE=52;
private final Cards[] cards;
private int topIndex;
Deck(){
    cards=new Cards[DECK_SIZE];
    toDisplay();
    Shuffle();
    cards.toString();
}
    public String toDisplay(){
        for(Ranks r :Ranks.values()){
            for(Suits s:Suits.values()) {
                System.out.println(r + " of " + s);
            }
        }
        return null;
    }
    public void Shuffle(){
    Random rand=new Random();
    for(int i = DECK_SIZE-1; i > 0;i--){
        int j= rand.nextInt(i+1);
        Cards temp=cards[j];
        cards[j]=cards[i];
        cards[i]=temp;
        }
    topIndex=0;
    for(int i=DECK_SIZE-1;i<0;i++){

    }

    }

    public int DECK_SIZE() {

    return DECK_SIZE;
    }

    public int getTopIndex() {
        return topIndex;
    }
}
