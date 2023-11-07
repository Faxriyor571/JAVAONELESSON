package com.company;

public class pupil {

    int id;
    static String maktab = "pyp";

    static void change() {
        maktab  = "TUIT";
    }
    pupil (int i) {
        id = i;
    }

    void print () {
        System.out.println(id+" "+maktab);
    }


    public static void main(String[] args) {
        pupil.change();
        pupil c1 = new pupil(12);
        pupil c2 = new pupil(56);
        c1.print();
        c2.print();
    }
}
