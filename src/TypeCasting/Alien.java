package 타입변환;

public class Alien extends Game{
    
    @Override
    public void Attack()
    {
        System.out.println("공격 : 슝슝~");
    }

    @Override
    public void move(int speed)
    {
        System.out.println("걷기 속도 : "+(speed*2));
    }
}
