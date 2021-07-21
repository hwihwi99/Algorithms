import java.util.LinkedList;
import java.util.Queue;

// 비순차 연결 리스트 기반
public class SymbolTable <Key, Value> {

    private Node first;
    private int size = 0;

    private class Node{
        Key key;
        Value value;
        Node next;
        public Node (Key key, Value value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public Value get(Key key){
        Node temp = first;
        while(temp.next!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    // 키 찾기 -> 이미 존재한다면 값을 바꾸고
    // 존재하지 않으면 새로운 노드를 만들어서 맨 앞에 삽입
    public void put(Key key, Value value){
        Node temp = first;
        while (temp.next != null){
            if(temp.key.equals(key)){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        first = new Node(key,value,first);
        size ++;
    }

    public void delete(Key key){
        put(key,null);
    }

    public boolean contains(Key key){
        return get(key)!=null;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public int size(){
        return this.size;
    }

    public Iterable<Node> keys(){
        Queue<Node> queue = new LinkedList<>();
        // 리스트가 비어있으면 null
        if(first == null){
            return null;
        }
        Node temp = first;
        while(temp.next!=null){
            queue.offer(temp);
            temp = temp.next;
        }
        return queue;
    }


}
