import java.util.LinkedHashMap;
import java.util.Map;

public class City {
    private String name;
    private Map<City, Integer> paths = new LinkedHashMap<>();

    public City(String name) {
        this.name = name;
    }

    public void addPath(City city, int cost) {
        paths.put(city, cost);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + ": [");
        boolean first = true;
        for (Map.Entry<City, Integer> entry : paths.entrySet()) {
            if (!first) sb.append(", ");
            sb.append(entry.getKey().getName()).append(":").append(entry.getValue());
            first = false;
        }
        sb.append("]");
        return sb.toString();
    }
}
