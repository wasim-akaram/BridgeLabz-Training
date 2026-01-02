package hospitalpatientmanagement;

class Bill implements Payable {
    private double amount;
    private double taxRate;
    private double discount;

    public Bill(double amount, double taxRate, double discount) 
    {
        this.amount = amount;
        this.taxRate = taxRate;
        this.discount = discount;
    }

    
    public double calculatePayment() {
        double tax = amount * taxRate;
        double total = amount + tax - discount;
        return total;
    }
} 