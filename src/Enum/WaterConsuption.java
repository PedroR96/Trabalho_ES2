package Enum;

public enum WaterConsuption {
    Weak,
    Median,
    Good,
    Obsessive;

    String getValue(WaterConsuption waterConsuption) {
        switch (this) {
            case Weak:
                return "Menos de 0,5L";
            case Median:
                return "0,5L a 1L";
            case Good:
                return "1,5 a 2,0L";
            case Obsessive:
                return "Mais de 2.0L";
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}
