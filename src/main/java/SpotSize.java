public interface SpotSize {

    enum SpotType {
        Small,
        Medium,
        Large
    }

    SpotType getType();

}
