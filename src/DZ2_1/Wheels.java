package DZ2_1;

import java.util.Arrays;

public class Wheels extends Names {
    private int radius;
    private String season;

    @Override
    public String toString() {
        return "Wheels{" +
                "radius=" + radius +
                ", season='" + season + '\'' +
                '}';
    }
    public Wheels(String name, int radius, String season) {
        super(name);
        this.radius = radius;
        this.season = season;
    }
    public Wheels(String name) {
        super(name);
    }
}
