package websockettest.domain;

public class Card {

    private String value;
    private String suit;
    private Boolean isDrawn;

    Card(){}

    Card(String value, String suit){
        this.value = value;
        this.suit = suit;
        this.isDrawn = false;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Boolean getDrawn() {
        return isDrawn;
    }

    public void setDrawn(Boolean drawn) {
        isDrawn = drawn;
    }

    @Override
    public String toString(){
        return this.value + " of " + this.suit;
    }
}
