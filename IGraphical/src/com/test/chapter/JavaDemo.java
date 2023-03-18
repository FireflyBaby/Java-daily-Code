package com.test.chapter;

import com.itche.chapter03.Factory;
import com.itche.chapter03.IGraphical;
import com.itche.chapter03.Triangle;

public class JavaDemo {
    public static void main(String[] args) {
        IGraphical iga= Factory.getInstance("triangle",1.1,2.2,3.3,4.4,
                11.11,22.22,33.33,44.44,
                111.111,222.222,333.333,444.444);
        iga.paint();
        IGraphical igb=Factory.getInstance("circular",88.1);
        igb.paint();
    }
}
