public class Nomor1{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Jarak tempuh taksi (km): ");
        double jarak = input.nextDouble() ;

        System.out.println("jam lembur atau tidak? (ya/tidak)");
        String lembur = input.next() ;
        boolean lembur1 = lembur.equals("ya") ;

        double tarif;

        if (jarak <= 3) {
            tarif = 20000;
        } else {
            if (lembur1) {
                tarif = 20000 + (jarak >= 3) * 10000 ;
            } else {
                tarif = 20000;
            }
        }

        System.out.println("tarif yang dibayar: Rp" + tarif);

        input.close();
    }
}
