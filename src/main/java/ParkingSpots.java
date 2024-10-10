public class ParkingSpots {
    private int smallSpots;
    private int mediumSpots;
    private int largeSpots;
    private int remainingSpots;
    private final int totalSpots;

    public ParkingSpots(int smallSpots, int mediumSpots, int largeSpots) {

        this.smallSpots = smallSpots;
        this.mediumSpots = mediumSpots;
        this.largeSpots = largeSpots;
        this.totalSpots = smallSpots + mediumSpots + largeSpots;
        this.remainingSpots = smallSpots + mediumSpots + largeSpots;



    }

    int getTotal() {
        return totalSpots;
    }

    int getRemainingSpots() {
        return remainingSpots;
    }

    String isEmpty() {
        if (totalSpots == 150) {
            return "Parking lot is empty";
        } else {
            return "Parking lot is not empty";
        }
    }

    String isFull() {
        if (totalSpots == 0) {
            return "Parking lot is full";
        } else {
            return "We still got some spots!";
        }
    }

    String bikeSpotsFull() {
        return "No more bikes - all spots full!";
    }
    String carSpotsFull() {
        return "No more cars - all spots full!";
    }
    String vanSpotsFull() {
        return "No more vans - all spots full!";
    }
}
