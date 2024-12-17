package 접근제한자;

public class App {
    // Access Control : 접근 제어
    // 클래스의 어트리뷰트나 메소드의 접근을 허락할 것인지 말 것인지 
    // 1> public
    // 2> private
    // 3. (defult)
    public static void main(String[] args) {
        Child ch1 = new Child();
        Parnt p1 = new Parnt();

        Parnt p2 = new Child();

        // Child c2 = new Parnt(); 이건 안됨

        


    }

}
