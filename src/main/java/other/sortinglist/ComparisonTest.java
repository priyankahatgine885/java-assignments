package other.sortinglist;
import other.sortinglist.model.Ingredient;
import java.util.ArrayList;
import java.util.List;

public class ComparisonTest {
    static List<Object> list = new ArrayList<>();
    static {
        list.add(new Ingredient("BREADS & CEREALS", "Bagel", 310));
        list.add(new Ingredient("Meats & Fish", "Cockles", 50));
        list.add(new Ingredient("BREADS & CEREALS", "Potatoes", 70));
        list.add(new Ingredient("Meats & Fish", "Beef", 280));
        list.add(new Ingredient("BREADS & CEREALS", "Bread wholemeal", 180));
        list.add(new Ingredient("Meats & Fish", "Duck roast", 430));
        list.add(new Ingredient("Fruits & Vegetables", "Apple", 45));
    }
    public static void main(String[] args) {
        display(list);
        ListUtil.bubbleSort(list);
        System.out.println("-------------------------------------------");
        display(list);
        ListUtil.bubbleSort(list, new IngredientNameAscComparator());
        System.out.println("-------------------------------------------");
        display(list);
        ListUtil.bubbleSort(list, new IngredientNameDscComparator());
        System.out.println("-------------------------------------------");
        display(list);
        ListUtil.bubbleSort(list, new IngredientCategoryAscComparator());
        System.out.println("----------------------------------");
        display(list);
        ListUtil.bubbleSort(list, new IngredientCategoryDscComparator());
        System.out.println("------------------------------------------");
        display(list);
    }
    private static void display(Iterable<Object> ingredients) {
        for (Object i : ingredients) {
            System.out.println(i);
        }
    }
}


