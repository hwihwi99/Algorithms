import java.util.Stack;

public class _03 {
    public static void main(String [] args){
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();

        a.push(0);
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);

        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.pop());

        a.push(5);
        a.push(6);
        a.push(7);
        a.push(8);
        a.push(9);

        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.pop());

        //a 가능
        System.out.println(" ");

        b.push(0);
        b.push(1);
        b.push(2);
        b.push(3);
        b.push(4);

        System.out.print(b.pop());
        b.push(5);
        b.push(6);
        System.out.print(b.pop());
        b.push(7);
        b.push(8);
        System.out.print(b.pop());
        System.out.print(b.pop());
        System.out.print(b.pop());
        System.out.print(b.pop());
        System.out.print(b.pop());
        b.push(9);
        System.out.print(b.pop());
        System.out.print(b.pop());
        System.out.print(b.pop());

        // b 불가능 앞의 상황을 다 맞춘다면 뒤에 1 0 순으로 나올 수 밖에 없다.

        // c부터는 말로만 설명
        // 2 5 6 7 4 8 9 3 1 0 -> 가능

        // d
        // 4 3 2 1 0 5 6 7 8 9 -> 가능

        // e
        // 1 2 3 4 5 6 9 8 7 0 -> 가능

        // f
        // 0 4 6 5 3 8 7 2 1 9 -> 이런 경우처럼 2가 1보다 빨리 나와야 함
        // 0 4 6 5 3 8 1 7 2 9 -> 이건 불가능

        // g
        // 1 4 7 9 8 6 5 3 2 0 -> 이 경우처럼 2 0 이 순서로 나와야함
        // 1 4 7 9 8 6 5 3 0 2 -> 불가능

        // h
        // 2 1 4 3 6 5 8 7 9 0 -> 가능
    }
}

// 불가능한 경우 b, f, g
