package DZ2_1;
public class Seeds {
    private int numberOfSeeds;
    public int getNumberOfSeeds() {
        return numberOfSeeds;
    }
    @Override
    public String toString() {
        return "Seeds{" +
                "numberOfSeeds=" + numberOfSeeds +
                '}';
    }
    public Seeds(int numberOfSeeds) {
        this.numberOfSeeds = numberOfSeeds;
    }

}
