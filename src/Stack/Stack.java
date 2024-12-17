package Stack;


public class Stack
{
    public static final int ERROR_STACK = Integer.MIN_VALUE;
    private int sp;         //스택포인터 - push와 pop의 위치정보
    private int[] ar;
    private int size;

    // 기본생성자
    public Stack()
    {
        sp = 0;
        ar = null;
        size = 0;

    }

    // 오버로딩생성자 (밖에서 배열길이 바꿀수 있도록)
    public Stack(int size)
    {
        sp = 0; //포인터는 바뀌지 않음
        this.size = size; //길이를 바꿔준다
        ar = new int[size]; //배열길이를 바꿔준다.
    }

    // 오버로딩생성자를 통해 바꾼값이 잘 만들어졌는지 불린으로 확인
    // 위에 만든 오버로딩이 잘 되었다면 트루를 리턴
    public boolean init(int size)
    {
        sp = 0;
        this.size = size;
        ar = new int[size];
        return true;
    
    }

    // 오버플로우인지 확인하는 함수
    public boolean isOverflow()
    {
        // 스택포인터와 사이즈가 같다면 가득찼다.트루리턴
        if (sp == size)
            return true;

        return false;

    }

    // data : 집어넣을 정수
    // return
    //  true : push 성공
    //  false : push 실패
    // 보이드쓰는건 완벽하거나 리턴할값이 절대없거나
    public boolean push(int data)
    {
        // 꽉찼다면 데이터를 넣을수 없음
        if (isOverflow())
        {
            return false;
        }
        // 넣을자리가 있다면 데이터를 ar배열에 넣고 스택포인터를 올려준다.
        ar[sp] = data;
        sp++;

        return true;

    }

    // 언더플로우인지 확인하는 함수
    public boolean isUnderflow()
    {
        // 스택포인터가 영이면 언더플로우이다.
        if (sp == 0)
            return true;
        
        return false;
    }

    //return
    //  정상인경우 data를 리턴함.
    //  비정상인 경우 Intger의 최소값을 리턴한다.
    public int pop()
    {   //언더플로우상태이면 데이터를 꺼낼게 없어서 에러띄어줌
        if (isUnderflow())
        {
            return ERROR_STACK;
        }
        // 배열안에 데이터가 있다면 포인터를 감소시키고 감소시킨위치에 있는데이터를 리턴
        sp--;
        return ar[sp];

    }


        // 30
        // 20
        // 10 순서대로 프린트로찍기
    public void printAll()
    {
        int count = sp;
        int index = sp-1;
        for(int i = 0; i < count; i++)
        {
            System.out.println(ar[index]);
            index--;
        }
    
    
    }
}