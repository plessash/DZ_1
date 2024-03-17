package DZ2_1;

public abstract class Names {
    private String name;

    public Names(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Names{" +
                "name='" + name + '\'' +
                '}';
    }
}
