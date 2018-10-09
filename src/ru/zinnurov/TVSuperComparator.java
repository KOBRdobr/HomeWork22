package ru.zinnurov;

import java.util.Comparator;

/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 09.10.2018
 */

public class TVSuperComparator implements Comparator<TV> {


    @Override
    public int compare(TV tv1, TV tv2) {

        int tv1size = tv1.getSize();
        int tv1GHz = tv1.getGHz();
        int tv2size = tv2.getSize();
        int tv2GHz = tv2.getGHz();

        if(tv1size > tv2size || tv1GHz >= tv2GHz) {
            return 1;
        } else if(tv1size < tv2size && tv1GHz <= tv2GHz) {
            return -1;
        } else return 0;

    }
}
