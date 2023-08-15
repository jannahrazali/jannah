public class Main {
    public static void main(String[] args) {

        // Create instances of nasi and ayam
        Nasi nasi = new Nasi();
        Ayam ayamm = new Ayam();


        // Create an array of Makan references containing nasi and ayam objects.
        Makan[] makanape = {nasi,ayamm};

        // Iterate through the array and call the 'lunch' method on each Makan object.
        for(Makan x : makanape) {
            x.lunch();
        }

    }
}

