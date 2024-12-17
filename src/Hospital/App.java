package 병원;

public class App {
    public static void main(String[] args) {
        
        // 안과환자
        Apart p1 = new Apart();
        p1.setName("지은");
        p1.setWeight(44);
        p1.setGender("여자");
        p1.setBlood("O");
        p1.setVision(1.2);

        // 1. 부모클래스의 메모리 영역을 확보한다.
        // 2. 자식클래스의 메모리 영역을 확보한다. 
        // 3. 자식클래스의 생성자 호출 --> Apart()생성자 호출(call)
        // 4. 부모클래스의 생성자 호출 --> Patient()생성자 호출
        // 5. 부모클래스의 생성자 실행 -->Patient()생성자 실행 (exec)
        // 6. 자식클래스의 생성자 실행 -->Apart()생성자 실행(exec)

        // 여기서 중요한것은 생성자 실행은 자식클래스보다 부모클래스가 무조건 먼저 실행된다.
        System.out.println(p1.getName()); //환자클래스의 메소드
        System.out.println(p1.getVision()); //안과 환자 클래스 메소드

        // 오버라이딩 전에는 혈액형검사와 몸무게검사가뜸
        p1.checkMedical();
        // apart에 체크메디칼을 오버라이딩하면 오버라이딩한게 먼저 호출됨
        p1.checkMedical();

        p1.checkMedicalSurgery();
        



        

    }
}
