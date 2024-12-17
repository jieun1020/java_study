package 급여;

public class App {
    public static void main(String[] args) {
        RegulerEmployee p1 = new RegulerEmployee(); //정규직클래스

        p1.setEmpnum("AAA-01");
        p1.setName("박지은");
        p1.monthSalay();
        System.out.println("사원코드 : "+p1.getEmpnum());
        System.out.println("사원이름 : "+p1.getName());
        System.out.println("한달급여 : "+p1.monthSalay()); //오버로딩

        TempEmployee t1 = new TempEmployee();

        System.out.println("계약직의 한달월급 : "+t1.monthSalay());
        System.out.println("계약기간과 월급------");
        t1.printPay();


    }
}
