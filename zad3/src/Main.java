public class Main {
    void wypisz(String napis){
        System.out.println(napis.length());

    }

    public static void main(String[] args) throws Exception{
        try {
            Main ob1 = new Main();
            ob1.wypisz("napisz");
        }
        catch (NullPointerException ex){
            ex.printStackTrace(System.out);
            ex.fillInStackTrace();
            throw new Exception(ex);
        }

    }

}