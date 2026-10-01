import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<CityPath> paths;

    public City(String name) {
        this.name = name;
        this.paths = new ArrayList<>();
    }

    public void addPath(City city, int cost) {
        paths.add(new CityPath(city, cost));
    }

    @Override
    public String toString() {
        String result = name;

        if (!paths.isEmpty()) {
            result += ": ";

            for (int i = 0; i < paths.size(); i++) {
                result += paths.get(i);

                if (i < paths.size() - 1) {
                    result += ", ";
                }
            }
        }

        return result;
    }

    private static class CityPath {
        private City city;
        private int cost;

        public CityPath(City city, int cost) {
            this.city = city;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return city.name + ":" + cost;
        }
    }
}
