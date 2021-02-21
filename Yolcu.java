import java.util.Scanner;

public class Yolcu implements YurtDisi {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yatırıdığınız harç bedeli");
        scanner.nextLine();

        System.out.print("Her hangi bir siyasi yasak bulunmuyor");
        String cevap=scanner.nextLine();

        if(cevap.equals("evet")){
            this.siyasiYasak=true;


        }
        else {
            this.siyasiYasak=false;

        }
        System.out.print("Vizeniz bulunuyor mu?");

        String cevap2=scanner.nextLine();
        if(cevap2.equals("evet")){

            this.vizeDurumu=true;


        }else {
            this.vizeDurumu=false;
        }



    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if (this.harc<18){
            System.out.println("Harcı yatır kardeş");

            return true;




        }else {
            System.out.println("Para tamam kardeş");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak==true){
            System.out.println("Siyasi yask var fetöcü");
            return false;

        }else{
            System.out.println("Tamam geç la geç");
            return true;
        }

    }

    @Override
    public boolean vizeDurumu() {
        if (this.vizeDurumu==true){

            System.out.println("Vize işlemleri tamamlandı");
            return true;

        }else{
            System.out.println("Vizen yok geri yollarlar");
            return false;
        }
    }
}
