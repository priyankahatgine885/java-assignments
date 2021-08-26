package other.sortinglist.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ingredient implements Comparable<Ingredient> {
    private String name;
    private String category;
    private int calories;

    public Ingredient(String name, String category, int calories) {
        this.name = name;
        this.category = category;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return String.format("%s: %s: %d", name, category, calories);
    }

    @Override
    public int compareTo(Ingredient other) {
        int result = 0;
        if (calories > other.calories) {
            return 1;
        } else if (calories < other.calories) {
            return -1;
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) && (obj instanceof Ingredient)) {
            return false;
        }
        Ingredient i = (Ingredient) obj;
        return name.equals(i.name) && category.equals(i.category);
    }

}
