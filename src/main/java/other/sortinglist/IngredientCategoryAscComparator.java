package other.sortinglist;

import other.sortinglist.model.Ingredient;

import java.util.Comparator;

class IngredientCategoryAscComparator implements Comparator<Ingredient> {
    @Override
    public int compare(Ingredient left, Ingredient right) {
        return left.getCategory().compareTo(right.getCategory());
    }
}
