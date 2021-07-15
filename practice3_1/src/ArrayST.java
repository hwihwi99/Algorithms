public class ArrayST<Key, Value>{

    private Node head;

    private class Node{
        Key key;
        Value value;
        Node next;
        Node(Key key,Value value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public Value get (Key key){
        for(Node x = head; x!=null;x=x.next){
            if(x.key.equals(key))
                return x.value;
        }
        return null;
    }

    public void put (Key key, Value value){
        for(Node x = head;x!=null;x=x.next){
            if(key.equals(x.key)){
                x.value = value;
                return;
            }
        }
        head = new Node (key,value,head);
    }

    public void delete(Key key){
        put(key,null);
    }

    public boolean contains(Key key){
        return get(key)!=null;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        int answer = 0;
        for(Node x = head;x!=null;x=x.next)
            answer++;
        return answer;
    }



}
