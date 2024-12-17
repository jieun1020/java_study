package 타입변환;

public class Human extends Game {
    
    @Override
    public void Attack()
    {
        System.out.println("공격 : 따다다~");
    }

    @Override
    public void move(int speed)
    {
        System.out.println("걷기 속도 : "+speed);
    }
}
