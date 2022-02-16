public abstract class NhanVien {
    private String code;
    private String name;
    private int age;
    private String callNumber;
    private String email;

    public NhanVien(String code, String name, int age, String callNumber, String email) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.callNumber = callNumber;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double TinhLuong();

    @Override
    public String toString() {
        return "NhanVien{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", callNumber='" + callNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
