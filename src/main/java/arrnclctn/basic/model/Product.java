package arrnclctn.basic.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class Product {
    private String productName;
    private String libraryName;
    private  String version;
    @Override
    public String toString() {
        return String.format("%s: %s: %s", productName, libraryName, version);
    }
}

