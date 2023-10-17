package mock.exam;

public class WaterTank {
    private String owner;
    private double funds;
    private double amountFilled;

    public WaterTank(String owner, double funds) {
        this.owner = owner;
        this.funds = funds;
    }

    public String getOwner() {
        return owner;
    }

    public double getFunds() {
        return funds;
    }

    public double getAmountFilled() {
        return amountFilled;
    }

    public void addAmountFilled(double d) {
        amountFilled += d;
    }

    public void fill(WaterStation s, double volume) {
        double cost = s.getRate() * volume;
        if (funds >= cost) {
            funds -= cost;
            amountFilled += volume;
            s.addEarnings(cost);
            System.out.println(owner + " spent " + cost + " pesos and filled tank by " + volume + " L from " + s.getName() + ".");
        } else {
            System.out.println(owner + " didn't have enough money to fill tank from " + s.getName() + ".");
        }
    }

    public void displayStats() {
        System.out.println("WaterTank Owner: " + owner);
        System.out.println("Funds: " + funds + " pesos");
        System.out.println("Amount Filled: " + amountFilled + " liters");
    }
}