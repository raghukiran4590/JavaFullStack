package com.java.edk5;

public class wrapper {

    public static void main(String[] args) {

        Integer int_obj = 600;
        Character  c = 'c';
        Byte b = 1;
        Short s = 12;
        Long l = 1234l;
        Float f = 12.3f;
        Double d = 569.98;
        Boolean bl = true;

        int int_var = int_obj;
        char c_var = c;
        byte by = b;
        short st = s;
        long lg = l;
        float ft = f;
        double db = d;
        boolean bln = bl;

        System.out.println("Unwrapping");
        System.out.println("========================================================");
        System.out.println(int_var);
        System.out.println(c_var);
        System.out.println(by);
        System.out.println(st);
        System.out.println(lg);
        System.out.println(ft);
        System.out.println(db);
        System.out.println(bln);
        System.out.println("========================================================");

        int_obj = int_var;
        c = c_var;
        b = by;
        s = st;
        l = lg;
        f = ft;
        d = db;
        bl = bln;

        System.out.println("Wrapping");
        System.out.println("========================================================");
        System.out.println(int_obj);
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bl);
        System.out.println("========================================================");
    }

}