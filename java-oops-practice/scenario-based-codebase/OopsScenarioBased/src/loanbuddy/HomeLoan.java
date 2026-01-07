package loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(int term, Applicant applicant) {
        super("Home Loan", term, 8.5, applicant);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 650 &&
            applicant.getIncome() >= 30000) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    @Override
    public double calculateEMI() {
        return baseEmiCalculation(applicant.getLoanAmount());
    }
}
