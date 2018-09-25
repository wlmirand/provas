import java.util.List;

public class Drone {

    static int smallestNumberOfTrips(int maximumWeight, int maximumCapacity, List<Integer> packages) {
        int numTrips = 0;

        while (!packages.isEmpty()) {
            numTrips++;

            int currentWeight = 0;
            int currentCapacity = 0;

            int numPackges = packages.size();

            //itera do maior para o menor
            for (int i=numPackges-1 ; i>=0 ; i--) {

                //se cabe, aloca
                if (currentCapacity < maximumCapacity || currentWeight + packages.get(i) < maximumWeight) {
                    currentCapacity++;
                    currentWeight += packages.get(i);
                    packages.remove(i);
                } else {
                    break;
                }

            }
        }

        return numTrips;
    }

}
