import java.util.Scanner;

public class TasKagitMakas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kullaniciSkor = 0;
        int bilgisayarSkor = 0;

        System.out.println("!!!OYUN BAŞLIYOR!!!");
        System.out.println("Seçiminizi Yapın"+"\n"+"1---Taş"+"\n"+"2---Kağıt"+"\n"+"3---Makas");

        while (true){

            int secim = scan.nextInt();
            int bilgisayarSecim = (int) (Math.random()*3);

            if (secim == 1){
                if (bilgisayarSecim ==1){
                    System.out.println("Berabere Kaldınız");
                    System.out.println("--SKOR--"+"\n"+"OYUNCU : "+"\n"+kullaniciSkor+"\n"+"BİLGİSAYAR : "+bilgisayarSkor);
                }
                else if ( bilgisayarSecim == 2){
                    System.out.println("BİLGİSAYAR KAZANDI");
                    System.out.println("--SKOR--"+"\n"+"OYUNCU : "+"\n"+kullaniciSkor+"\n"+"BİLGİSAYAR : "+(bilgisayarSkor+1));
                }
                else
                    System.out.println("OYUNCU KAZANDI");
                    System.out.println("--SKOR--"+"\n"+"OYUNCU : "+"\n"+(kullaniciSkor+1)+"\n"+"BİLGİSAYAR : "+bilgisayarSkor);

                    break;
            }
            if (secim == 2){
                if (bilgisayarSecim ==1){
                    System.out.println("OYUNCU KAZANDI");
                    System.out.println("--SKOR--"+"\n"+"OYUNCU : "+"\n"+(kullaniciSkor+1)+"\n"+"BİLGİSAYAR : "+bilgisayarSkor);
                }
                else if ( bilgisayarSecim == 2){
                    System.out.println("BERABERE KALDINIZ");
                    System.out.println("--SKOR--"+"\n"+"OYUNCU : "+"\n"+kullaniciSkor+"\n"+"BİLGİSAYAR : "+bilgisayarSkor);
                }
                else
                    System.out.println("BİLGİSAYAR KAZANDI");
                System.out.println("--SKOR--"+"\n"+"OYUNCU : "+"\n"+kullaniciSkor+"\n"+"BİLGİSAYAR : "+(bilgisayarSkor+1));


                break;
        }

            if (secim == 3) {
                if (bilgisayarSecim == 1) {
                    System.out.println("BİLGİSAYAR KAZANDI");
                    System.out.println("--SKOR--" + "\n" + "OYUNCU : " + "\n" + kullaniciSkor + "\n" + "BİLGİSAYAR : " + (bilgisayarSkor+1));
                } else if (bilgisayarSecim == 2) {
                    System.out.println("OYUNCU KAZANDI");
                    System.out.println("--SKOR--" + "\n" + "OYUNCU : " + "\n" + kullaniciSkor+1 + "\n" + "BİLGİSAYAR : " + bilgisayarSkor);
                } else
                    System.out.println("BERABERE KALDINIZ");
                System.out.println("--SKOR--" + "\n" + "OYUNCU : " + "\n" + kullaniciSkor + "\n" + "BİLGİSAYAR : " + bilgisayarSkor);

                break;
            }



            else
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                System.out.println("1 ve 3 ARASINDA BİR SAYI GİRİNİZ");

            continue;
        }



    }
}
