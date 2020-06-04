package silsub1.model.vo;

public class Member {
    private String memberId;
    private String memberPwd;
    private String memberName;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public Member(){}


    public String getMemberId(){
        return memberId;
    }
    public void setMemberId(String memberId){
        this.memberId = memberId;
    }
    public String getMemberPwd() {
        return memberPwd;
    }
    public void setMemberPwd(String memberPwd){
        this.memberPwd = memberPwd;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName){
        this.memberName = memberName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
