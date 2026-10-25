public class ExpressDeliveryStrategy implements DeliveryStrategy {
    private static final double BASE_FEE = 1000.0;
    private static final double PRICE_PER_KM = 80.0;

    @Override
    public double calculateCost(double distanceKm) {
        return BASE_FEE + distanceKm * PRICE_PER_KM;
    }
}
