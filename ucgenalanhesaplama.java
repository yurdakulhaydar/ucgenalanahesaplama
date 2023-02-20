import java.util.Scanner;

public class ucgenalanhesaplama{

    public static void main(String[] args) {

        double a,b,c,alan,u;

        Scanner deger=new Scanner(System.in);

        System.out.print("üçgenin birinci kenarını giriniz:");

        a= deger.nextDouble();

        System.out.print("üçgenin ikinci kenarını giriniz:");

        b= deger.nextDouble();

        System.out.print("üçgenin üçüncü kenarını giriniz:");

        c= deger.nextDouble();

        u=(a+b+c)/2;

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgeninin Kenarları: a:"+a+"\tb:"+b+"\tc:"+c);
        System.out.println("Üçgenin Alanı:"+alan);

        
    }


}