public class four {
    int id;
    String name;
    four (int i, String n) {
        id = i;
        name = n;
    }

    four(four a) {
        id = a.id;
        name = a.name;
    }

    void display () {
        System.out.println(id+" "+name);
    }


    public static void main(String[] args) {
        four z = new four(23,"ali");
        four z2 = new four(z);
        z.display();
        z2.display();
    }
}
