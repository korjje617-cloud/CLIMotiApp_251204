package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    //스캐너 사용
    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    // 실행되는 메서드
    public void run() {
        System.out.println("== motivation 실행 ==");

        // add 하나 추가할 때마다 증가
        int lastid = 0;

        // 클래스를 정해진 타입으로 사용하는 배열 리스트 객체
        // while 문에 들어가면 한번 반복될 때 마다 초기화 되기 때문에 while 밖에 있다
        List<MotivAdd> motivList = new ArrayList<>();

        // 코드블록 무한 반복
        while (true) {

            // 명령어 입력
            System.out.print("명령어 ) ");
            String input = sc.nextLine().trim();

            // "exit" > 종료
            if (input.equals("exit")) {
                System.out.println("== motivation 종료 ==");
                break;
            }

            // "add" > 모티베이션, 출처
            if (input.equals("add")) {

                int id = lastid++;

                System.out.print("motivation : ");
                String motivation = sc.nextLine();

                System.out.print("source : ");
                String source = sc.nextLine();

                // 클래스로 새 객체 생성하고 입력된 값을 생성자로 자동 저장
                MotivAdd motivInfo = new MotivAdd(id, motivation, source);

                // 배열 리스트에 클래스로 만든 객체 저장
                motivList.add(motivInfo);

                System.out.printf("%d번 motivation이 등록 되었습니다.\n", id);

            } // "list" > 목록
            else if (input.equals("list")) {
                System.out.println("=".repeat(50));
                System.out.println("번호     /     source     /     motivation");

                // 입력된 게 없다면
                if (motivList.isEmpty()){
                    System.out.println("등록 없음");
                }

                // 입력된 게 있다면
                for (int i = 0; i < motivList.size(); i++) {
                    System.out.printf("%d     /     %s     /     %s     \n");

                }

            } // 명령어 외 일괄
            else {
                System.out.println("[사용 가능 명령어]\n1. add (추가하기)\n2. list (목록조회)\n3. exit (종료하기)");
            }
        }
    }
}

// 입력된 정보를 저장할 객체를 만드는 클래스
class MotivAdd {

    // 필드로서 객체 내부에 인스턴스 변수
    int id;
    String motivation;
    String source;

    // 생성자 : 입력된 값을 자동으로 추가해준다
    public MotivAdd(int id, String motivation, String source) {
        this.id = id;
        this.motivation = motivation;
        this.source = source;
    }


}