package 급여;
// 정규직
public class RegulerEmployee extends Employee{
    private int bonus;

    public RegulerEmployee()
    {
        bonus = 0;
    }

    public RegulerEmployee(String empnum,String name,int pay,int bonus)
    {
        super(empnum, name, pay);
        this.bonus = bonus;
    }

    // 급여를 오버라이딩 시켜보자
    // 기본급에 두배
    @Override
    public int monthSalay()
    {
        bonus = (int)(super.monthSalay())*2;
        return bonus;
    }

}
