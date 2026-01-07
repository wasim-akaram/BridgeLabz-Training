package loanbuddy;
public class Main {

    public static void main(String[] args) {

        Applicant applicant = new Applicant(
                "Wasim",
                720,
                50000,
                600000
        );

        LoanApplication loan1 =
                new HomeLoan(240, applicant);

        LoanApplication loan2 =
                new AutoLoan(60, applicant);

        // Polymorphism
        processLoan(loan1);
        processLoan(loan2);
    }

    private static void processLoan(LoanApplication loan) {

        if (loan.approveLoan(loan.applicant)) {
            System.out.println(loan.loanType + " Approved");
            System.out.println("EMI: " + loan.calculateEMI());
        } else {
            System.out.println(loan.loanType + " Rejected");
        }

        System.out.println("Status: " + loan.getLoanStatus());
        System.out.println("----------------------");
    }
}
