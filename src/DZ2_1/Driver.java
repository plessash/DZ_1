package DZ2_1;

public class Driver {


    @Override
    public String toString() {
        return "Driver{" +

                ", key=" + key +
                '}';
    }


    private DriverKey key;

    public Driver(DriverKey key) {
        this.key = key;
    }

    public int getKeyValue(){
        return key.getKey();
    }

}
