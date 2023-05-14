import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String kullanıcıAdi,Sifre;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz:");
        kullanıcıAdi = input.nextLine();

        System.out.println("Şifrenizi giriniz:");
        Sifre = input.nextLine();

        if (kullanıcıAdi.equals("Java") && Sifre.equals("Patika")){
            System.out.println("Giriş Bilgileriniz Doğru");
        }
        else{
            System.out.println("Giriş Bilgileriniz Hatalı");
            System.out.println("Şifrenizi Sıfırlamak İstiyor Musunuz ?\nevet/hayır" );

            String cevap = input.nextLine();

            if (cevap.equals("evet")){
                System.out.println("Yeni Şifre Giriniz");

            }
                String yenisifre = input.nextLine();
                if (yenisifre.equals("Patika")) {
                    System.out.println("Yeni Şifreniz Eskisiyle Aynı Olamaz\nTekrar deneyiniz");
                }
                else {
                    System.out.println("Yeni Şifreniz Başarıyla Oluşturuldu");
                }






        }

    }
}