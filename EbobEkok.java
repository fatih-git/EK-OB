import java.util.Scanner;

/**
 * @author fatih-git
 */

public class EbobEkok {

    public static void main(String[] args) {

        int ebob=1, ekok;
        int sayi1, sayi2;
        int temp1, temp2;
        int bolen=2;

        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen 1. sayıyı girin: ");
        sayi1=input.nextInt();

        System.out.print("Lütfen 2. sayıyı girin: ");
        sayi2=input.nextInt();

        temp1=sayi1;
        temp2=sayi2;

        while(bolen<=sayi1 && bolen<=sayi2){

            if(temp1%bolen==0 && temp2%bolen==0)
                ebob=bolen;

            bolen++;

        }

        ekok=(sayi1*sayi2)/ebob;

        System.out.println(sayi1+" ve "+sayi2+"'nin EBOB'u= "+ebob);
        System.out.println(sayi1+" ve "+sayi2+"'nin EKOK'u= "+ekok);


    }

}
