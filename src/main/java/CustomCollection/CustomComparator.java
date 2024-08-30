package CustomCollection;

import java.util.Comparator;

class CustomComparator<E extends Comparable<E>> implements Comparator<E> {
    @Override
    public int compare(E a, E b)
    {
        // вернуть 0, если и `a`, и `b` равны нулю
        if (a == null && b == null) {
            return 0;
        }

        // вернуть 1, если `a` равно null, а `b` не равно null
        if (a == null) {
            return 1;
        }

        // вернуть -1, если `b` равно нулю, а `a` не равно нулю
        if (b == null) {
            return -1;
        }

        // если оба `a` и `b` не равны нулю
        return a.compareTo(b);
    }

}
