public class Main {
    public static void main(String[] args) {

        MyWater magazyn1 = new MyWater();

        magazyn1.addLarge(5);
        magazyn1.addMedium(7);
        magazyn1.addSmall(8);



        int suma = magazyn1.getLargeBottle() + magazyn1.getMediuBottle() + magazyn1.getSmallBottle();

        System.out.println("Mam teraz " + suma + "litrów wody\n");
        System.out.println("dużych butelek: " + magazyn1.getLargeBottle());
        System.out.println("średnich butelek: " + magazyn1.getMediuBottle());
        System.out.println("małych butelek: " + magazyn1.getSmallBottle());




    }
}
