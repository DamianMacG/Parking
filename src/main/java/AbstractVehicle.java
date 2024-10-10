public abstract class AbstractVehicle implements Vehicles {
    private VehicleType type;

    public AbstractVehicle(VehicleType type) {
        this.type = type;
    }



    @Override
    public VehicleType getType() {
        return type;
    }
}
