public class StandardDeliveryStrategy implements DeliveryStrategy {
    private static final double BASE_FEE = 500.0;
    private static final double PRICE_PER_KM = 50.0;

    @Override
    public double calculateCost(double distanceKm) {
        return BASE_FEE + distanceKm * PRICE_PER_KM;
    }
}
