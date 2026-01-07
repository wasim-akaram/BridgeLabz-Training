package loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected String loanType;
    protected int term; // months
    protected double interestRate;

    protected Applicant applicant;

    // Status is internal-only
    private String loanStatus;

    public LoanApplication(String loanType, int term,
                           double interestRate, Applicant applicant) {
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
        this.applicant = applicant;
        this.loanStatus = "PENDING";
    }

    // EMI Formula:
    // EMI = P × R × (1+R)^N / ((1+R)^N – 1)
    protected double baseEmiCalculation(double principal) {
        double monthlyRate = interestRate / (12 * 100);
        int n = term;

        return (principal * monthlyRate * Math.pow(1 + monthlyRate, n)) /
               (Math.pow(1 + monthlyRate, n) - 1);
    }

    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    public String getLoanStatus() {
        return loanStatus;
    }
}
