package com.itche.chapter03;

public class Factory {
    public static IGraphical getInstance(String className,double ...args){
        if ("triangle".equalsIgnoreCase(className)){
            return new Triangle(new Point[]{new Point(args[0],args[1]),new Point(args[2],args[3])},
                    new Point[]{new Point(args[4],args[5]),new Point(args[6],args[7])},
                    new Point[]{new Point(args[8],args[9]),new Point(args[10],args[11])});
        }else if ("circular".equalsIgnoreCase(className)){
            return new Circular(args[0]);
        }
        else {
            return null;
        }
    }
}
