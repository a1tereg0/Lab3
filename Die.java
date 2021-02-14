public class Die {
    private final String diceType;
    private final int numSides;
    private int sideUp;

    public Die() {
        // Using default value of 6 for field "numSides"
        this(6);
    }

    public Die(int numSides) {
        this(numSides, "d"+numSides);
    }

    public Die(int numSides, String diceType) {
        this.diceType = diceType;
        this.numSides = numSides;
        this.sideUp = (int) Math.floor((Math.random()*numSides)+1);
    }

    public String getDiceType() {
        return diceType;
    }

    public int getNumSides() {
        return numSides;
    }


    public int getSideUp() {
        return sideUp;
    }

    public boolean setSideUp(int sideUp) {
        if (sideUp > 0 && sideUp <= this.numSides){
            this.sideUp = sideUp;
            return true;
        }
        return false;
    }

    public void roll() {
        this.sideUp = (int) Math.floor((Math.random() * this.numSides)+1);
    }

}
