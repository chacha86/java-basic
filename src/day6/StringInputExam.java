package day6;

import java.util.Scanner;

public class StringInputExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("이름을 입력해주세요:");
//        String name = scan.nextLine();
//        System.out.println("나이를 입력해주세요:");
//        int age = scan.nextInt();
//
//        System.out.println("안녕하세요 " + age + "세 " + name + "입니다.");

        // v1
        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.


        System.out.println("나이를 입력해주세요:");
        int age2 = scan.nextInt();

        scan.nextLine(); // 버퍼 비우기

        System.out.println("이름을 입력해주세요:");
        String name2 = scan.nextLine();

        System.out.println("안녕하세요 " + age2 + "세 " + name2 + "입니다.");
        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        // 버퍼 찌거기 때문에 입력 꼬이는 것 해결하는 방법
        // 1. 버퍼를 직접 비워준다.
        // 2. 입력을 nextLine으로 통일한다.
    }
}
