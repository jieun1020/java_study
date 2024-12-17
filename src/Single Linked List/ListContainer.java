package 싱글링크드리스트;

public class ListContainer {
    public static final String dummy = "메롱";
    public Node header;  //노드의 시작점
    public int nodeCount;  //노드의 개수



    // 마지막노드 찾는 함수
    private Node getLastNode()
    {
        Node target = header;

        if(nodeCount==0)
        {
            return null;
        }
        for(int i = 0; i < nodeCount - 1; i++)
        {
            target = target.next;
        }
        return target;
    }


    // 노드를 추가시키는 함수
    public boolean insertNode(Node node)
    {
        // 노드의 개수가 0인경우는 head에 넣고
        // 그렇지 않은 경우는 제일 마지막에 넣어준다.
        Node lastNode= null;
        if(nodeCount==0)
        { 
            header = node;
        }
        else
        {
            lastNode = getLastNode();
            lastNode.next = node;
        }
        nodeCount++;
        return true;
    }

    // 노드를 지운다. 
    public boolean deleteNode(int index)
    {
        // 참조값을 옮겨준다 연결시켜준다.
        if(nodeCount==0)
            return false;

        if(index ==0)
        {
            // head가지고 만들기
            

        }
        else
        {
            // 연결시킨다
            Node before = getNode(index-1);
            Node after = getNode(index);
            before.next = after.next;
            // 삭제시킨다
            after = null;
            nodeCount--;
        }

        return true;



    }

    // 노드을 가지고 온다
    public Node getNode(int index)
    {
        Node node = header;
        
        for(int i = 0; i < index; i++)
            {
                node = node.next;
            }
            return node;
        
    }


    public boolean isFind(int index)
    {
        // 노드를 찾을 수 없는 경우
        if((index < 0)||(index > nodeCount))
        {
            return false;
        }
        return true;
    }

    public void printAll()
    {

    }
}
