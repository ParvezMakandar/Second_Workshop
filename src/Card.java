

public class Card
{
    String suit;
    String rank;

    public Card(String suit, String rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card [suit=" + suit + ", rank=" + rank + "]";
    }

}
