class student {
    int id;
    String name;
    static String collage = "TATU";

    student (int i, String n) {
        id = i;
        name= n;
    }

    void print () {
        System.out.println("id:"+id+" "+"name"+" "+name+" "+"university"+" "+collage);
    }
}

public class statics {

    public static void main(String[] args) {
        student h1 = new student(23,"ali");
        student h2 = new student(24,"Umar");
        student h3 = new student(25,"Usmon"), h4 = new student(26,"hasan");
        h1.print();
        h2.print();
        h3.print();
        h4.print();
    }
    }






