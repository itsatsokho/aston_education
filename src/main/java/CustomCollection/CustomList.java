package CustomCollection;

import java.util.Collection;

public interface CustomList<E> {
    void add(E element);
    void add(int index, E element);
    E get(int index);
    void remove(int index);
    void addAll(Collection<? extends E> c);


}
