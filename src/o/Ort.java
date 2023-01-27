package o;

    import java.util.Scanner;

public class Ort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Not Ortalaması Hesaplama");

        int mat,fzk,tde,cfy,tar,kim,byd,iyd,biy,din;
        int matD,fzkD,tdeD,cfyD,tarD,kimD,bydD,iydD,biyD,dinD;

        System.out.println("matematik notunuzu giriniz :");
        mat = sc.nextInt();
        System.out.println("ders saatini giriniz(haftalık) :");
        matD = sc.nextInt();

        System.out.println("fizik notunuzu giriniz :");
        fzk = sc.nextInt();
        System.out.println("ders satini giriniz(haftalık) :");
        fzkD = sc.nextInt();

        System.out.println("türk dili ve edebiyat notunuzu giriniz :");
        tde = sc.nextInt();
        System.out.println("ders saatini giriniz(haftalık) :");
        tdeD = sc.nextInt();

        System.out.println("coğrafya notunuzu giriniz :");
        cfy = sc.nextInt();
        System.out.println("ders satini giriniz(haftalık) :");
        cfyD = sc.nextInt();

        System.out.println("tarih notunuzu giriniz");
        tar = sc.nextInt();
        System.out.println("ders satini giriniz(haftalık) :");
        tarD = sc.nextInt();

        System.out.println("kimya notunuzu giriniz");
        kim = sc.nextInt();
        System.out.println("ders satini giriniz(haftalık) :");
        kimD = sc.nextInt();

        System.out.println("birinci yabancı dil notunuzu giriniz");
        byd = sc.nextInt();
        System.out.println("ders satini giriniz(haftalık) :");
        bydD = sc.nextInt();

        System.out.println("ikinci yabancı dil notunuzu giriniz");
        iyd = sc.nextInt();
        System.out.println("ders satini giriniz(haftalık) :");
        iydD = sc.nextInt();

        System.out.println("biyoloji notunuzu giriniz");
        biy = sc.nextInt();
        System.out.println("ders satini giriniz(haftalık) :");
        biyD = sc.nextInt();

        System.out.println("din kültürü ve ahlak bilgisi notunuzu giriniz");
        din = sc.nextInt();
        System.out.println("ders satini giriniz(haftalık) :");
        dinD = sc.nextInt();

        int tNot = ((mat * matD) + (fzk * fzkD) + (tde * tdeD) + (cfy * cfyD) + (tar * tarD) + (kim * kimD) + (byd * bydD) + (iyd * iydD) + (biy * biyD) + (din * dinD));
        int dSaatleri =( matD + fzkD + tdeD + cfyD + tarD + kimD + bydD + iydD + biyD + dinD ) ;

        double ortalama = tNot / dSaatleri ;

        System.out.println("ortalamanız: " + ortalama);
        String str =( ortalama > 50) ? "tebrik ederim geçtiniz" : "ortalamanız 50'nin altında olduğu için kaldınız" ;
        System.out.println(str);

        System.out.println("başarılar");





    }
}
