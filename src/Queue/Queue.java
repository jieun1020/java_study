package Queue;

public class Queue {
    
    public static final int ERROR_QUEUE = Integer.MIN_VALUE;

    private int rear; //넣기위한 스택포인터
    private int front; //뺄때 사용하는 스택포인터
    private int count; //데이터의 개수
    private int size; //배열의 길이
    private int[] ar; //배열 선언


    // 기본생성자
    public Queue()
    {
        rear = 0; //넣는포인터 기본값0
        front = 0; //뺴는 포인터 기본값0
        count = 0; //데이터 개수 0초기화
        size = 0; //배열길이 0초기화
        ar = null; //배열에 아무것도 없게 초기화
    }

    // 오버로딩 생성자
    // 배열의 길이는 값을 받아서 바꿀 수 있도록 오버로딩생성자 만듬
    public Queue(int size)
    {
        rear = 0;  //길이를 바꿔도 넣는 포인터는 0부터 시작하도록
        front = 0; //길이를 바꿔도 뺴는 포인터는 0부터 시작하도록
        count = 0; //길이 바꿔도 데이터의 초기개수는 0개
        this.size = size; //사이즈는 받아온 값으로 바꿔줘야함
        ar = new int[size]; //바꾼사이즈로 배열만듬
    }

    // 오버로딩생성자를 통해 바꾼값이 잘 만들어졌는지 불린으로 확인
    // 위에 만든 오버로딩이 잘 되었다면 트루를 리턴
    public boolean init(int size)
    {
        rear = 0;  
        front = 0; 
        count = 0; 
        this.size = size;
        ar = new int[size];
        return true;
    }

    // 꽉찼는지 확인하는 함수
    public boolean isFull()
    {   
        // 데이터의 개수가 배열의 길이만큼이라면 꽉찼다 트루리턴
        if(count==size)
        {
            return true;
        }
        return false;
    }

    //데이터를 넣는 함수
    // 불린으로 리턴을 받는 이유 : 
    // 1. void로 받게 되는 건 완벽하게 코드를 짰거나 리턴값이 절대 없는 경우만!
    // 2. 만약 배열의 길이를 초과해서 데이터를 받게되면 트루펄스로 넣을 수 없구나를 
    // 정확한 값으로 알수 있음
    public boolean enqueue(int data)
    {
        // isFull이 꽉찼다는뜻 그래서 데이터 못넣음(펄스리턴)
        if(isFull())
        {
            return false;
        }

        // isfull이 펄스면 데이터 넣을 공간이 있다는뜻
        // 정상적으로 데이터 넣을 수 있음

        ar[rear] = data; //rear의 위치에 데이터를 넣어줌
        rear++; //데이터를 넣어준 후 리어값을 증가시켜준다.

        //리어값과 사이즈값이 같더라도 공간이꽉찬게 아닐 수 있음
        //dequeue로 값이빠졌을 수도 있어서 공간이 남아있을수도 있다.
        // 리어값과 사이즈값이 같아지면 뻉뻉이 돌게하기위해 0부터 다시시작하게해줘야함
        if(rear==size) 
        {
            rear = 0;
        }

        count++; //데이터를 넣어준후 데이터값을 증가시킨다.

        return true; //잘 넣어졌다면 트루를 리턴해준다.
    }


    // 비었는지 확인하는 함수
    public boolean isEmpty()
    {   
        // 데이터의 개수가 0개이다 비어있다 트루리턴
        if(count==0)
        {
            return true;
        }
        return false;
    }


    // 빼는 함수
    // 정상인 경우 data를 리턴함
    // 비정상인 경우 Intager의 최소값을 리턴한다.
    public int dequeue()
    {
        int dequeueData; //새로운 변수를 만들어준다.
        // 데이터가 없다면 데이터를 빼낼게 없으니까 에러를 띄어줌
        if(true == isEmpty())
        {
            return ERROR_QUEUE;
        }
        //만든 변수에 뺸값을 넣어준다
        dequeueData=ar[front]; 
        front++; //프론트위치증가

        if(front==size) //프론트위치와 사이즈가 같아진다면 뺑뺑이돌게해야함
        {
            front = 0; 
        }

        count--; //데이터뻇으니까 데이터개수 하나 감소시킨다

        return dequeueData; //뺴낸 데이터값을 리턴
    }

    // 넣어져있는 데이터 순서대로 출력하는 함수
    // 두가지로 나눠서 봐야함
    // 첫번쨰는 
    public void printAll()
    {
        if(rear > front)
        {
            for(int i = front; i < count; i++)
            {
                System.out.println(ar[front]);
                front++;
            }
        }
        else
        {
            for(int k = 0; k < count; k++)
            {
                System.out.println(ar[front]);
                front++;
                if(front == size)
                {
                    front = 0;
                }
            }
        }

        }
    }




