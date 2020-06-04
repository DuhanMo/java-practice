package silsub1.run;

import silsub1.model.vo.Member;

public class Run {
    public static void main(String[] args){
        Member m1 = new Member();
        m1.setMemberId("devduhanmo");
        m1.setMemberPwd("1234");
        m1.setMemberName("모두한");
        m1.setAge(26);
        m1.setGender('M');
        m1.setPhone("010-2400-2811");
        m1.setEmail("devduhanmo@gmail.com");

        System.out.println(m1.getMemberId());
        System.out.println(m1.getMemberPwd());
        System.out.println(m1.getMemberName());
        System.out.println(m1.getAge());
        System.out.println(m1.getGender());
        System.out.println(m1.getPhone());
        System.out.println(m1.getEmail());
    }
}
