public class Testowa {

    public static void main(String args[]){
        Suma suma = new Suma();
        System.out.println(suma.dodaj(22, 33));
        System.out.println(suma.dodaj(22.2, 33.3));
        System.out.println(suma.dodaj(22, 33, 44));
        System.out.println(suma.dodaj(22.2, 33.3, 44.4));
    }
}