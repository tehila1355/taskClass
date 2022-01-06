public class Element {
    private char letter;
    private int amount;

    public Element (char letter,int amount) {
        this.letter = letter;
        this.amount = amount;
    }

    public char getLetter () {
        return letter;
    }

    public int getAmount() {
        return amount;
    }

    public String toString () {
        return "(" + this.letter + ", " + this.amount + ")";
    }
}