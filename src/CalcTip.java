public class CalcTip {
    private double tip;
    private int numPeople;

    private double totalBillBeforeTip;

    private double cost;

    public void calcTip(double tip, int numPeople) {
        this.tip = tip;
        this.numPeople = numPeople;
        totalBillBeforeTip=0.0;
    }

    public void Bill(double totalBillBeforeTip) {
        this.totalBillBeforeTip = totalBillBeforeTip;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tip;

    }

    public void addMeal(double cost) {
        this.cost=cost;
    }
    public double tipAmount() {
        return totalBillBeforeTip*(tip);
    }
    public double totalBill() {
        return totalBillBeforeTip*(1+tip);
    }
    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip/numPeople;
    }
    public double PerPersonTipAmount() {
        return (totalBillBeforeTip*(tip)/numPeople);
    }
    public double perPersonTotalCost() {
        return (totalBillBeforeTip*(1+tip)/numPeople);
    }
    public String info() {
        String a = "The total person cost before tip is: " + perPersonCostBeforeTip();
        String b = "The total bill before tip is: " +totalBillBeforeTip;
        String c = "The total cost per person is: " + perPersonTotalCost();
        String d = "The total bill is: " + totalBill();
        String e = "The tip amount is: " + tipAmount();
        String info = d + "\n" + e + "\n" + a +"\n" + b + "\n" + c;
        return info;
    }
}
