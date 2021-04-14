package Opdracht7_IntrinsiekSorteren;

import java.util.Comparator;

public class WeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getWeight() - o2.getWeight());
    }
}
