package org.example;

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

        // add로 motivation 하나 추가할 때마다 증가
        int lastId = 1;

        // 코드블록 무한 반복
        while (true) {

            // 명령어 입력
            System.out.print("명령어 ) ");
            String input = sc.nextLine().trim();

            // "add" > 모티베이션, 출처
            if (input.equals("add")) {

                System.out.print("motivation : ");
                String motivation = sc.nextLine();

                System.out.print("source : ");
                String source = sc.nextLine();

                System.out.printf("%d번 motivation이 등록 되었습니다.\n", lastId);
                lastId++;

            } // "list" > 목록
            else if (input.equals("list")) {
                System.out.println("=".repeat(50));
                System.out.println("번호     /     source     /     motivation");


            } // "exit" > 종료
            else if (input.equals("exit")) {
                System.out.println("== motivation 종료 ==");
                break;

            } // 명령어 외 일괄
            else {
                System.out.println("[사용 가능 명령어]\n1. add (추가하기)\n2. list (목록조회)\n3. exit (종료하기)");
            }

        }
    }
}

