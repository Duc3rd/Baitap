
interface EmailSender {
    void sendEmail();
}

interface Programmer {
    void code();
}

interface Salesperson {
    void sell();
}

class OfficeEmployee implements EmailSender {
    @Override
    public void sendEmail() {
        System.out.println("Office employee is sending an email.");
    }
}

class TechnicalEmployee implements EmailSender, Programmer {
    @Override
    public void sendEmail() {
        System.out.println("Technical employee is sending an email.");
    }

    @Override
    public void code() {
        System.out.println("Technical employee is coding.");
    }
}

class SalesEmployee implements Salesperson {
    @Override
    public void sell() {
        System.out.println("Sales employee is selling.");
    }
}

public class Main {
    public static void main(String[] args) {
        OfficeEmployee officeEmp = new OfficeEmployee();
        TechnicalEmployee techEmp = new TechnicalEmployee();
        SalesEmployee salesEmp = new SalesEmployee();

        officeEmp.sendEmail();
        techEmp.sendEmail();
        techEmp.code();
        salesEmp.sell();
    }
}
