import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<City> destinations;
    private List<Integer> costs;

    public City(String name) {
        this.name = name;
        this.destinations = new ArrayList<>();
        this.costs = new ArrayList<>();
    }

    public void addPath(City city, int cost) {
        destinations.add(city);
        costs.add(cost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": [");
        for (int i = 0; i < destinations.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(destinations.get(i).name).append(":").append(costs.get(i));
        }
        sb.append("]");
        return sb.toString();
    }
}

