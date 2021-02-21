public class Main {
    public static void main(String[]args)throws InterruptedException{
        System.out.println("Hoşgeldin mal");

        String sartlar="Yurt dışı çıkış kuralları..\n"
                +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"
                +"15 Tl harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                +"Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor";


        while(true) {
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");


            Yolcu yolcu = new Yolcu();

            System.out.println("Harç Bedeli Kontrol Ediliyor...");

            Thread.sleep(3000);
            if (yolcu.yurtdisiHarciKontrol() == false) {

                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);

            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);

            if (yolcu.vizeDurumu() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz...");
            break;


        }


    }
}
