import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("MANAVA HOŞGELDİNİZ! Lütfen aldığınız sebze meyve kg'ını giriniz:");
        Scanner armut=new Scanner(System.in);
        System.out.println("armut için kg giriniz:");
        double a=armut.nextDouble();

        Scanner elma=new Scanner(System.in);
        System.out.println("elma icin kg giriniz:");
        double b=elma.nextDouble();

        Scanner domates=new Scanner(System.in);
        System.out.println("domates icin kg giriniz:");
        double c=domates.nextDouble();

        Scanner muz=new Scanner(System.in);
        System.out.println("muz icin kg giriniz:");
        double d=muz.nextDouble();

        Scanner pat=new Scanner(System.in);
        System.out.println("patlıcan icin kg giriniz:");
        double e=pat.nextDouble();
        double  toplamtutar=(a*2.14+b*3.67+c*1.11+d*0.95+e*5.00);
        System.out.println("toplam tutar:"+toplamtutar);

    }
}
