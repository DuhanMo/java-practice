package com.hw4.view;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

import java.util.Scanner;

public class MemberMenu {
    private MemberController mc = new MemberController();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        while (true) {
            System.out.println("===== 회원 관리 메뉴 =====");
            System.out.println("1. 신규 회원 등록");
            System.out.println("2. 회원 정보 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 정보 삭제");
            System.out.println("5. 회원 정보 출력");
            System.out.println("6. 회원 정보 정렬");
            System.out.println("9. 프로그램 종료");
            System.out.print("번호를 입력해주세요 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    insertMember();
                    break;
                case 2:
                    searchMember();
                    break;
                case 3:
                    updateMember();
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                    printAllMember();
                    break;
                case 6:
                    sortMember();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    break;
            }

        }
    }

    public void insertMember() {
        if (mc.getMemberCount() > MemberController.SIZE) return;
        System.out.print("ID 입력 : ");
        String userId = sc.nextLine();
        Member m = new Member();
        m = mc.checkId(userId);
        if (m == null) {
            System.out.print("비밀번호 : ");
            String userPwd = sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("성별 : ");
            char gender = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("이메일 : ");
            String email = sc.nextLine();

            m = new Member(userId, userPwd, name, age, gender, email);
            mc.insertMember(m);
        } else {
            System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
        }


    }

    public void searchMember() {
        Member m = new Member();
        while (true) {
            System.out.println("===== 회원 정보 검색 =====");
            System.out.println("1. 아이디로 검색하기");
            System.out.println("2. 이름으로 검색하기");
            System.out.println("3. 이메일로 검색하기");
            System.out.println("9. 이전메뉴로");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            if (menu == 9) return;
            else if (!(menu == 1 || menu == 2 || menu == 3)) {
                System.out.println("잘못된 번호입니다. ");
                break;
            }
            sc.nextLine();
            System.out.print("검색 내용 : ");
            String search = sc.nextLine();
            m = mc.searchMember(menu, search);

            if (m == null) System.out.println("검색된 결과가 없습니다.");
            else System.out.println(m.information());
        }
    }

    public void updateMember() {
        Member m = new Member();
        while (true) {
            System.out.println("1. 비밀번호 수정");
            System.out.println("2. 이름 수정");
            System.out.println("3. 이메일 수정");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            if (menu == 9) return;
            else if (!(menu == 1 || menu == 2 || menu == 3)) {
                System.out.println("잘못된 번호입니다. ");
                break;
            }
            sc.nextLine();
            System.out.print("변경할 회원 아이디 : ");
            String userId = sc.nextLine();
            m = mc.checkId(userId);
            String update = "";
            if (m == null) {
                System.out.println("변경할 회원이 존재하지 않습니다. ");
                break;
            } else {
                System.out.println(m.information());
                if (menu == 1) {
                    System.out.print("변경할 비밀번호 : ");
                    update = sc.nextLine();
                } else if (menu == 2) {
                    System.out.print("변경할 이름 :");
                    update = sc.nextLine();
                } else {
                    System.out.print("변경할 이메일 : ");
                    update = sc.nextLine();
                }
                mc.updateMember(m, menu, update);
                System.out.println("회원의 정보가 변경되었습니다.");
            }
        }

    }

    public void deleteMember() {
        Member m = new Member();
        System.out.print("삭제할 회원 아이디 : ");
        String userId = sc.nextLine();
        m = mc.checkId(userId);
        if (m == null) {
            System.out.println("삭제할 회원이 존재하지 않습니다. ");
        } else {
            System.out.print("정말 삭제하시겠습니까?(y/n) : ");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case 'y':
                case 'Y':
                    mc.deleteMember(userId);
                    System.out.println("회원의 정보가 삭제되었습니다. ");
                    break;
                case 'n':
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    break;
            }
        }
    }

    public void printAllMember() {
        Member[] mem = mc.getMem();
        for (int i = 0; i < mc.getMemberCount(); i++) {
            System.out.println(mem[i].information());
        }

    }

    public void sortMember() {

        Member[] sortMem = null;
        while(true){
            System.out.println("1. 아이디 오름차순 정렬");
            System.out.println("2. 아이디 내림차순 정렬");
            System.out.println("3. 나이 오름차순 정렬");
            System.out.println("4. 나이 내림차순 정렬");
            System.out.println("5. 성별 내림차순 정렬(남여순)");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu){
                case 1:
                    sortMem = mc.sortIdAsc();
                    for(Member value : sortMem){
                        System.out.println(value);}

                break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 9:
                    return;

            }
        }

    }
}
