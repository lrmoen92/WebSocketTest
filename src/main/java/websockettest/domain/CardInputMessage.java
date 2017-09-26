package websockettest.domain;

public class CardInputMessage {

    private String value;
    private String suit;
    private String player;
    private Boolean isDrawn;

    CardInputMessage(){}

    CardInputMessage(String value, String suit, String player){
        this.value = value;
        this.suit = suit;
        this.player = player;
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

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public String toString(){
        return this.value + " of " + this.suit;
    }

}
