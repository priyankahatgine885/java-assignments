package other.sortinglist;

import other.sortinglist.model.Ingredient;

import java.util.Comparator;

class IngredientNameDscComparator implements Comparator<Ingredient> {
    @Override
    public int compare(Ingredient left, Ingredient right) {
        return right.getName().compareTo(left.getName());
    }
}
