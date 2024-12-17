package 스마트폰;

public class App {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.bell();
        phone.sendVoice("안녕하세요");
        phone.receiveVoice("끊자");
        phone.hangUp();
    }
}
