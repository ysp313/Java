import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Furniture> furnitures;

    public User(String name) {
        this.name = name;
        this.furnitures = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Furniture> getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(List<Furniture> furnitures) {
        this.furnitures = furnitures;
    }
}
