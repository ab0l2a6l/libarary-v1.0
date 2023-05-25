public class Person {
    private String FName;
    private String LName;
    private byte age;
    private int id;
    private Sexuality sexuality;

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sexuality getSexuality() {
        return sexuality;
    }

    public void setSexuality(Sexuality sexuality) {
        this.sexuality = sexuality;
    }
}
