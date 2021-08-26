package other.sortinglist;
import other.sortinglist.model.Ingredient;
import java.util.Comparator;

class IngredientCategoryDscComparator implements Comparator<Ingredient> {
    @Override
    public int compare(Ingredient left, Ingredient right) {
        return right.getCategory().compareTo(left.getCategory());
    }
}

