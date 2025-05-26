public class CardReader {
    private int currentCardNum;

    public int readCard() {
        return currentCardNum;
    }

    public void setCardNum(int cardNum) {
        this.currentCardNum = cardNum;
    }

    public void ejectCard() {
        this.currentCardNum = -1;
    }
}
