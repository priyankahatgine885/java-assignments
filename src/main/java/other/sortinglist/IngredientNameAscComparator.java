package other.sortinglist;

import other.sortinglist.model.Ingredient;

import java.util.Comparator;

public class IngredientNameAscComparator implements Comparator<Ingredient> {
    @Override
    public int compare(Ingredient left, Ingredient right) {
        return left.getName().compareTo(right.getName());
    }

}
