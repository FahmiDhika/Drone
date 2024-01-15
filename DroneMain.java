public class DroneMain {
    public static void main(String[] args) {
        
        FiturDrone dron = new FiturDrone();
        
        dron.merek = "DJI";
        dron.energi = 100;
        dron.kecepatan = 100;
        dron.ketinggian = 50;
        
        dron.terbang();
        dron.maju();
        dron.belokKanan();
        dron.belokKiri();
        dron.mundur();
        dron.turun();
        
    }
}
