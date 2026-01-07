package edumentor;

public class Main
{
    public static void main(String[] args) {

        Learner learner1 = new Learner("Wasim","wasim@yahoomail.com","100","Shorttime");

        Learner learner2 = new Learner("Vishal","vishal@yahoomail.com","102","Fulltime");

        // Polymorphism
        ICertifiable c1 = learner1;
        ICertifiable c2 = learner2;
        
        c1.getDetails();
        c1.generateCertificate();
        c2.getDetails();
        c2.generateCertificate();
    }
}

