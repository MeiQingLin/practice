public class Customer {
    private String name;
    private boolean gender;
    private  String birth;
    private String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void shopping(int money){
        pay(money);
    }

    public void pay(int money){
        if(money < 0){
            System.out.println("您支付的钱不合法");
            return;
        }
        System.out.println("您成功支付了" + money + "元");
    }


}
