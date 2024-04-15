package oops;

class Account
{
    int accNo;
    double accbal;
    public Account(int accNo, double accbal) {
        super();
        this.accNo = accNo;
        this.accbal = accbal;
    }
    void deposit(double amt)
    {
        System.out.println("Dummy...");
    }
    void withdraw(double amt)
    {
        System.out.println("Dummy....");
    }
    final void balanceEnquiry()
    {
        System.out.println("Your Account Balance => "+accbal);
    }
}
class SavingAccount extends Account
{
    SavingAccount(int accNo ,double accbal)
    {
        super(accNo, accbal);
        System.out.println("SavingAccount Created Successfully...!!!");

    }
    void deposit(double amt)
    {
        System.out.println("you ar depositiong in SavingAccount => "+amt);
        accbal +=amt;
        System.out.println("your Balance in SavingAccount => "+accbal);
    }
    void withdraw(double amt)
    {
        System.out.println("Your withdrawing amount from savingAccount => "+amt);
        accbal-=amt;
        System.out.println("your Balance in Savings Account => "+accbal);
    }
}
class LoanAccount extends Account
{
    LoanAccount(int accNo,double accbal)
    {
        super(accNo,accbal);
        System.out.println("Loan Account Created Successfully...!!!");

    }
    void deposit(double amt)
    {
        System.out.println("your depositing in loan account amt => "+amt);
        accbal-=amt;
        System.out.println("your Balance Loan Account => "+accbal);
    }
    void withdraw (double amt)
    {
        System.out.println("your withdraw amount from loan Account => "+amt);
        accbal+=amt;
        System.out.println("your Balance in Loan Account => "+accbal);
    }
}

public class InheritanceDemo {

    public static void main(String[] args)
    {
        System.out.println("*");
        System.out.println("-----------SavingAccount---------");
        SavingAccount sal = new SavingAccount(1234,10000.0);
        sal.balanceEnquiry();
        System.out.println("-----------Deposit-----------");
        sal.deposit(5000.0);
        System.out.println("-----------withdraw-----------");
        sal.withdraw(2000.0);
        System.out.println("-----------LoanAccount---------");
        LoanAccount lal =new LoanAccount(5678,50000.0);
        lal.balanceEnquiry();
        System.out.println("-----------Loan Account Deposit-----------");
        lal.deposit(30000.0);
        System.out.println("-----------Loan Account withdraw-----------");
        lal.withdraw(5000.0);
        System.out.println("*");

    }

}