package arrnclctn.basic;
import arrnclctn.basic.model.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example07 {
    public static void main(String[] args) throws IOException {
        List<String> stringList = readFileData("./src/main/java/arrnclctn/basic/InputData.txt");
        List<Product> productList = prepareData(stringList);
        Map<String, String> employeeMap = getLatestLibraryVersionMap(productList);
        printProductMap(employeeMap);
        System.out.println("-----------------------------");
        List<Product> outDatedLibraryProducts = getOutdatedLibraryProducts(productList, employeeMap);
        for (Product productName : outDatedLibraryProducts) {
            System.out.println(productName);
        }
    }
    private static List<Product> prepareData(List<String> stringList) {
        List<Product> products = new ArrayList<>();
        for (String str : stringList) {
            if (!str.isEmpty()) {
                String[] columns = str.split(",");
                System.out.println(columns);
                Product product = new Product(columns[0], columns[1], columns[2]);
                products.add(product);
            }
        }
        return products;
    }
    private static Map<String, String> getLatestLibraryVersionMap(Iterable<Product> products) {
        Map<String, String> productMap = new HashMap<>();
        for (Product product : products) {
            String library = product.getLibraryName();
            String currentVersion = product.getVersion();
            if (productMap.containsKey(library)) {
                String latestVersion = productMap.get(library);
                if (latestVersion.compareTo(currentVersion) > 0) {
                    currentVersion = latestVersion;
                }
            }
            productMap.put(library, currentVersion);
        }
        return productMap;
    }
    private static List<Product> getOutdatedLibraryProducts(Iterable<Product> products, Map<String, String> latestLibraryVersionMap) {
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            String library = product.getLibraryName();
            String currentVersion = product.getVersion();
            String latestVersion = latestLibraryVersionMap.get(library);
            if (currentVersion.compareTo(latestVersion) < 0) {
                list.add(product);
            }
        }
        return list;
    }
    public static void printProductMap(Map<String, String> productMap) {
        for (Map.Entry<String, String> entry : productMap.entrySet()) {
            String key = entry.getKey();
            String product = entry.getValue();
            System.out.println("Key: " + key + " " + "Value: " + product);
        }
    }
    public static List<String> readFileData(String path) {
        String filePath = path;
        List<String> stringList = new ArrayList<>();
        try {
            BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
            String lineText = null;
            while ((lineText = lineReader.readLine()) != null) {
                stringList.add(lineText);
            }
            lineReader.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
        return stringList;
    }

}
