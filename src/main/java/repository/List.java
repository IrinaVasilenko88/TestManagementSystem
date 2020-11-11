package repository;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public interface List <date> extends Collection<date> {
    default void sort(Comparator<? super date> c) {
    }
    default  Comparator<date>reversed(){
        return Collections.reverseOrder();
    }
}
