
 class adress {
    String city, state, country;
    public adress ( String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class Emp {
    int id;
    String name;
    adress ad;

     Emp(int id, String name, adress ad) {
        this.id = id;
        this.name = name;
        this.ad = ad;
    }

    void display() {
        System.out.println(id+" "+name+" "+ad.country+" "+ad.state+" "+ad.city);
        System.out.println();
    }
}
 class testss {
     public static void main(String[] args) {
         adress c1 = new adress("qilichboy", "amu", "qizgiz");
         Emp d1 = new Emp(12, "ali", c1);
         d1.display();
     }
 }



