import java.util.*;

public class ResizingArrayStack<Item> implements Iterable<Item>{

    private Item[] arr = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }
    public int arr_size(){
        return arr.length;
    }
    private void resizing(int max){
        Item[] temp = (Item [])new Object[max];
        for(int i = 0;i<N;i++)
            temp[i] = arr[i];
        arr = temp;
    }

    public void push(Item item){
        if(N == arr.length)
            resizing(2*arr.length);
        arr[N++] = item;
    }

    public Item pop(){
        Item item = arr[--N];
        arr[N] = null; // 로이터링 방지
        if(N==arr.length/4 && N >0){
            resizing(arr.length/2);
        }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = 0;
        public boolean hasNext(){
            return i > 0;
        }
        public Item next(){
            return arr[--i];
        }
        public void remove(){

        }
    }
}
