public class _06 {
    public static boolean isCycle(String s, String a){
        return s.length()==a.length() && (s+s).contains(a);
        //문자열을 두개를 연결해서 그 안에 있는지 체크하면 된다요!
    }
    public static void main(String [] args){
        if(isCycle("ACTGACG","TGACGAC")){
            System.out.println("It is Cycle String");
        }else{
            System.out.println("It is not Cycle String");
        }
    }
}

//생각지도 못 한 풀이 방법...!! 이런 발상도 얻어가기!
