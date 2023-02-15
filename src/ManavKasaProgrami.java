import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutKgUcret = 2.14, elmaKgUcret = 3.67, domatesKgUcret = 1.11, muzKgUcret = 0.95, patlicanKgUcret = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        armutKg = input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elmaKg = input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domatesKg = input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlicanKg = input.nextDouble();

        toplamTutar = (armutKgUcret*armutKg)+(elmaKgUcret*elmaKg)+(domatesKgUcret*domatesKg)+(muzKgUcret*muzKg)+(patlicanKgUcret*patlicanKg);
        System.out.println("Toplam Tutar (TL) : " + toplamTutar);
    }
}
