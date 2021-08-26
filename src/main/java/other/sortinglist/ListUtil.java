package other.sortinglist;

import java.util.Comparator;
import java.util.List;

public class ListUtil {
    public  static  void bubbleSort(List<Object> objectList){
        boolean sorted = false;
        do{
            sorted = true;
            for(int i = 0; i < objectList.size()-1; ++i){
                Comparable comparable = (Comparable)objectList.get(i);
                if(comparable.compareTo(objectList.get(i+1)) > 0){
                    Comparable temp = (Comparable)objectList.get(i);
                    objectList.set(i, objectList.get(i+1));
                    objectList.set(i+1, temp);
                    sorted = false;
                }
            }
        }while (!sorted);
    }
    public static void bubbleSort(List<Object> objectList, Comparator comparator){
        boolean sorted = false;
        do{
            sorted = true;
            for(int i = 0; i < objectList.size()-1; ++i){
                if(comparator.compare(objectList.get(i), objectList.get(i+1)) > 0){
                    Object temp = objectList.get(i);
                    objectList.set(i, objectList.get(i+1));
                    objectList.set(i+1, temp);
                    sorted = false;
                }
            }
        }while (!sorted);
    }

}
