package day6;

import java.util.Scanner;

public class StringInputExam2 {
    public static void main(String[] args) {


        // 문자열 -> 숫자 변환
        System.out.println("100" + 100); // 100100
//        int convertedint = integer.parseint("a100"); // 숫자로만 이루어진 문자열이 아니면 에러가 난다.
//        system.out.println(convertedint + 100); // 200


        Scanner scan = new Scanner(System.in);

        System.out.println("나이를 입력해주세요:");
//        String age2 = scan.nextLine();
//        int intAge = Integer.parseInt(age2);

        int age = Integer.parseInt(scan.nextLine());

        System.out.println("이름을 입력해주세요:");
        String name = scan.nextLine();

        System.out.println("안녕하세요 " + age + "세 " + name + "입니다.");
    }
}
