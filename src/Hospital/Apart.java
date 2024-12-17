package 병원;
// 안과
// 앞에 final로 만들면 난 자식을 안만들겠다의 의미 상속x
public class Apart extends Patient {
    private double vision; //시력

    // 기본생성자
    public Apart()
    {
        super(); //생략가능
        vision = 0;
        System.out.println("Apart() - constructor");
    }

    public Apart(String name,String gender,int weight,String blood,double vision)
    {
        super(name,gender,weight,blood);
        this.vision = vision;
    }

    // 게터세터
    public double getVision() {
        return this.vision;
    }

    public void setVision(double vision) {
        this.vision = vision;
    }

    // 재정의
    // 오버라이딩
    // @+지시자 : 컴파일러에게 상위 클래스에 동일한 이름의 메소드가 있다는 것을 알려줌
    @Override //오타내거나 실수하는걸 잡아줌
    public void checkMedical()
    {
        System.out.println("안구검사를 합니다.");
        System.out.println("시력검사를 합니다.");
    }

    public void checkMedicalSurgery()
    {
        super.checkMedical();
        checkMedical();
    }

}
