package org.example;

import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation 실행 ==");

        int lastId = 1;

        while (true) {
            // 명령어 입력
            System.out.print("명령어 ) ");
            String input = sc.nextLine().trim();

            // "add" > 모티베이션, 출처
            if (input.equals("add")) {

                System.out.print("motivation : ");
                String moti = sc.next();

                System.out.print("source : ");
                String sour = sc.next();

                System.out.printf("%d번 motivation이 등록 되었습니다.\n", lastId);
                lastId++;

            } else if (input.equals("list")) {





            } else if (input.equals("exit")) {
                System.out.println("== motivation 종료 ==");
                break;

            } else if (input.length() == 0) {
                System.out.println("사용 가능 명령어\n1. add (추가하기)\n2. list (목록조회)\n3. exit (종료하기)");
            }

        }
    }
}

