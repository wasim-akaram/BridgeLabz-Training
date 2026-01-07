package loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(int term, Applicant applicant) {
        super("Auto Loan", term, 10.5, applicant);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 700 &&
            applicant.getIncome() >= 25000) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    @Override
    public double calculateEMI() {
        // Auto loans add processing risk margin
        double adjustedAmount = applicant.getLoanAmount() + 5000;
        return baseEmiCalculation(adjustedAmount);
    }
}
