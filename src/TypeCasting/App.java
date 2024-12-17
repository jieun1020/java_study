package 타입변환;

public class App {
    public static void main(String[] args) {

        // Game game = new Human();
        // Game game2 = new Alien();
        // Game game3 = new Monster();

        Game[] games = new Game[]{
            new Human(),new Human(),new Human(),new Human(),
            new Alien(),new Alien(),new Alien(),new Alien(),new Alien(),new Alien(),
            new Monster(),new Monster()
        };

        Game g1 = new Human();
        g1.Attack(); //재정의 된것만 자식객체메소드 호출 가능

        for(int i = 0; i < games.length; i++)
        {
            games[i].Attack();
        }

        Boolean a = games[0] instanceof Human;
        System.out.println(a);

    }
}
