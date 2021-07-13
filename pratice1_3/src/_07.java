public class _07 {
    public static void main(String [] args){
        FixedCapacityStackOfString fixedCapacityStackOfString = new FixedCapacityStackOfString(10);
        fixedCapacityStackOfString.push("hwi");
        fixedCapacityStackOfString.push("hwi2");
        fixedCapacityStackOfString.push("lee");
        fixedCapacityStackOfString.push("happy");

        System.out.println(fixedCapacityStackOfString.peek());
        System.out.println(fixedCapacityStackOfString.pop());
        System.out.println(fixedCapacityStackOfString.peek());
    }
}

//peek() 메서드 추가해보는 문제
//FixedCapacityStackOfString 이 자바 파일에 peek() 메서드 추가 완료.