package 급여;

public class TempEmployee extends Employee  {
    private int hireYear;

    public TempEmployee()
    {
        hireYear = 2;
    }

    public TempEmployee(String empnum,String name,int pay,int hireYear)
    {
        super(empnum, name, pay);
        this.hireYear = hireYear;
    }

    @Override
    public int monthSalay()
    {
        int tempPay= super.monthSalay();
        return tempPay;
    }

    public void printPay()
    {
        System.out.println(hireYear+"년간 한달월급 : "+ super.monthSalay());
    }
}
