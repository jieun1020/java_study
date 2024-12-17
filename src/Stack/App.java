package Stack;
public class App {
    public static void main(String[] args) throws Exception {

        Stack stack = new Stack(5);
        boolean res;
        int data;

        res = stack.push(10);
        res = stack.push(20);
        res = stack.push(30);
        
        data = stack.pop();     //30
        data = stack.pop();     //20
        data = stack.pop();     //10
        
        // data = stack.pop();     

        if (data == Stack.ERROR_STACK)
        {
            System.out.println("스택에러입니다.");
        }


    }
}