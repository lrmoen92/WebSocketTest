package websockettest.domain;

public class CardOutputMessage {

    private String player;
    private String suit;
    private String value;
    private String time;

    public CardOutputMessage(String player, String suit, String value, String time) {
        this.player = player;
        this.suit = suit;
        this.value = value;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
