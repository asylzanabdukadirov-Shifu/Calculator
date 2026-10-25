public class DeliveryCalculator {
    private DeliveryStrategy strategy;

    public DeliveryCalculator(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateCost(double distanceKm) {
        return strategy.calculateCost(distanceKm);
    }
}
