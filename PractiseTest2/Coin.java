package PractiseTest2;

//q19
//flow scope problem
public record Coin(boolean heads) {
    public boolean equals(Object obj) {
        if (!(obj instanceof Coin coin)) {
            return false;
        }
        return heads == coin.heads;
    }
}
