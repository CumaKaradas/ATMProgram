import java.util.Scanner;

public class ATMProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Başlangıç bakiyesi
        double bakiye = 1000;

        while (true) {
            // Kullanıcıya işlem seçeneklerini gösterme
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
            System.out.println("1. Bakiye sorgulama");
            System.out.println("2. Para yatırma");
            System.out.println("3. Para çekme");
            System.out.println("4. Çıkış");

            // Kullanıcının seçimini alma
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Bakiyeniz: " + bakiye + " TL");
                    break;
                case 2:
                    System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                    double yatirilanMiktar = scanner.nextDouble();
                    bakiye += yatirilanMiktar;
                    System.out.println(yatirilanMiktar + " TL yatırıldı. Yeni bakiyeniz: " + bakiye + " TL");
                    break;
                case 3:
                    System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                    double cekilenMiktar = scanner.nextDouble();
                    if (cekilenMiktar > bakiye) {
                        System.out.println("Yetersiz bakiye.");
                    } else {
                        bakiye -= cekilenMiktar;
                        System.out.println(cekilenMiktar + " TL çekildi. Yeni bakiyeniz: " + bakiye + " TL");
                    }
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz işlem!");
                    break;
            }
        }
    }
}
