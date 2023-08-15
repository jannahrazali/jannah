
public class Main {

    public static void main(String[] args) {


       // Create an instance of nasi class.
        Nasi nasi = new Nasi();

        // Create an instance of ayamm class.
        Ayam ayamm = new Ayam();


        // Call the 'lunch' method of the nasi class.
        nasi.lunch();

        // Call the 'breakfast' method of the ayamm class.
        ayamm.breakfast();

        // Print the number of berapa and habis in the nasi and ayamm class.
        System.out.println(nasi.berapa);
        System.out.println(ayamm.habis);

    }
}
