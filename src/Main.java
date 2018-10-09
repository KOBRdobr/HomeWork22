import ru.zinnurov.TV;
import ru.zinnurov.TVSuperComparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 09.10.2018
 */

public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV("Samsung", 40, 120);
        TV tv2 = new TV("LG",55, 100);
        TV tv3 = new TV("Panasonic",80, 200);

        ArrayList<TV> al = new ArrayList<TV>();
        al.add(tv1);
        al.add(tv2);
        al.add(tv3);

        Collections.sort(al, new TVSuperComparator());
        for (TV a : al) {
            System.out.println(a.getBrand());
        }
    }
}
