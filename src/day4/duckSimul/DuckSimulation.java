package day4.duckSimul;

public class DuckSimulation {
    public static void main(String[] args) {
        오리 a오리 = new 오리();
        a오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        //출력 : 저는 날 수 업어요..

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}

class 오리 {
    public void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 청둥오리 extends 오리 {
}

class 흰오리 extends 오리 {
}

class 고무오리 extends 오리 {
    // 메서드 오버라이드(재정의) => 부모한테 물려받은 메서드와 동일한 이름의 메서드를 자식이 다시 정의하는 것
    // 자신에게 가까운 메서드를 우선적으로 사용.
    public void 날다() {
        System.out.println("저는 날 수 없어요..");
//        super.날다(); // 부모의 날다를 사용하는 법
    }

}

// 고무2오리의 메서드 개수는?? 2개 (오리의 날다, 고무오리의 날다)
class 고무2오리 extends 고무오리 {

}