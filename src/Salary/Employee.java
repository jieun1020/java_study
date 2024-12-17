package 급여;

public class Employee {
    // 사번
    // 이름
    // 고용형태
    // 금액

    private String empnum;
    private String name;
    private int pay;
    private int basicMoney = 180;

     // 기본생성자
    public Employee()
    {
        empnum = "";
        name = "";
        pay = 0;
    }

    // 오버로딩 생성자
    public Employee(String empnum,String name,int pay)
    {
        this.empnum = empnum;
        this.name = name;
        this.pay = pay;
    }

    public String getEmpnum() {
        return this.empnum;
    }

    public void setEmpnum(String empnum) {
        this.empnum = empnum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return this.pay;
    }

    public int monthSalay()
    {
        return basicMoney;
    }

}
