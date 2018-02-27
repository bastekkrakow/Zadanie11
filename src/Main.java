public class Main {
    public static void main(String[] args) {


        MyWater magazyn1 = new MyWater();

        magazyn1.addLarge(1);
        magazyn1.addMedium(1);
        magazyn1.addSmall(1);



        float suma = magazyn1.getLargeBottle() * MyWater.BIG_LITRES + magazyn1.getMediuBottle() * MyWater.MEDIUM_LITRES + magazyn1.getSmallBottle() * MyWater.SMALL_LITRES;

        System.out.println("Mam teraz " + suma + " litrów wody\n");
        System.out.println("dużych butelek: " + magazyn1.getLargeBottle());
        System.out.println("średnich butelek: " + magazyn1.getMediuBottle());
        System.out.println("małych butelek: " + magazyn1.getSmallBottle());




    }
}
