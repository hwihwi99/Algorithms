public class FixedCapacityStackOfString {
    private String [] arr;
    private int top;

    public FixedCapacityStackOfString(int cap){
        arr = new String[cap];
        top = 0;
    }

    public void push (String item){
        if(isFull())
            System.out.println("I am Full");
        else
            arr[top++] = item;
    }

    public String pop() {
        if (isEmpty()){
            System.out.println("I am empty");
            return "";
        }
       else
           return arr[--top];
    }

    public String peek(){
        if(isEmpty()){
            System.out.println("I am empty");
            return "";
        }
        return arr[top-1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int size(){
        return top;
    }

    public boolean isFull(){
        return top >= arr.length;
    }
}
