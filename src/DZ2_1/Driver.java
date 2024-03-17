package DZ2_1;

public class Driver {
private String category;

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "category='" + category + '\'' +
                ", key=" + key +
                '}';
    }

    public Driver(String category, DriverKey key) {
        this.category = category;
        this.key = key;
    }


    private DriverKey key;

    public int getKeyValue(){
        return key.getKey();
    }
public String isValueCategoryDriver(){
        String b=this.getCategory();
        return getCategory();
}

}
