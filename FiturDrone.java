public class FiturDrone {
    
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;

    void terbang(){
        energi--;
        if(energi > 10){
            ketinggian++;
            System.out.println("Drone Terbang...");
        } else {
            System.out.println("Energi Lemah: Drone Tidak Bisa Terbang");
        }
    }

    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin Tidak Bisa Dimatikan Karena Drone Sedang Terbang");
        } else {
            System.out.println("Mesin Dimatikan...");
        }
    }

    void turun(){
        ketinggian--;
        energi--;
        System.out.println("Drone Turun");
    }

    void belokKiri(){
        energi--;
        System.out.println("Drone Belok Kiri");
    }
    
    void belokKanan(){
        energi--;
        System.out.println("Drone Belok Kanan");
    }

    void maju(){
        energi--;
        System.out.println("Drone Maju Kedepan");
        kecepatan++;
    }

    void mundur(){
        energi--;
        System.out.println("Drone Mundur");
        kecepatan++;
    }
}