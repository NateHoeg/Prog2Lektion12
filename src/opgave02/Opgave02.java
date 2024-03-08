package opgave02;

import opgave02.models.Range;

import java.util.Iterator;

public class Opgave02 {
    public static void main(String[] args) {
        Range range = new Range(5, 10);
        Iterator<Integer> iterator = range.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
