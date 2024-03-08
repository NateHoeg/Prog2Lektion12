package opgave02.models;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {

    private int from;
    private int to;
    private int current;

    public RangeIterator(int from, int to) {
        this.from = from;
        this.to = to;
        this.current = from;
    }

    @Override
    public boolean hasNext() {
        return current <= to;
    }

    @Override
    public Integer next() {
        return current++;
    }
}
