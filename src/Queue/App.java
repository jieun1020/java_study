package Queue;

public class App {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        boolean res;
        int data;

        res = queue.enqueue(10);
        res = queue.enqueue(20);
        res = queue.enqueue(30);
        res = queue.enqueue(40);
        res = queue.enqueue(50);
        

        data = queue.dequeue(); //10 처음넣은값
        data = queue.dequeue(); //20
        data = queue.dequeue(); //30
        
        
        res = queue.enqueue(60);
        res = queue.enqueue(70);


        data = queue.dequeue(); //10 처음넣은값
        data = queue.dequeue(); //20
        data = queue.dequeue(); //30
        data = queue.dequeue(); //30
        data = queue.dequeue(); //30
        
        







    }
}
