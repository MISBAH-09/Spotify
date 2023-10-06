package Card_Game;

public class Cards {
    private final Ranks rank;
    private final Suits suit;
    Cards(Ranks rank,Suits suit){
        this.rank=rank;
        this.suit=suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }
    public String toString(){
        return rank + " of "+ suit;
    }



}
