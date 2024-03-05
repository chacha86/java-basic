package day2;

public class Loop {
    public static void main(String[] args) {

        // 반복문을 이용해 동일한 명령을 여러번 실행

//        while(true) {
//            System.out.println("실행");
//        }

        // 원하는 만큼만 반복반복횟수 세는 용도
        int cnt = 0; //

        while(cnt < 5) { // 5번 반복
            System.out.println("실행");
            cnt++;
        }

        // for문
        for(int cnt2 = 0; cnt2 < 5; cnt2++) {
            System.out.println("실행");
        }




    }
}
