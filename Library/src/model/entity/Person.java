package model.entity;

public class Person extends Entity{
    private String lName;
    private byte age;
    private Sexuality sexuality;



    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }


    public Sexuality getSexuality() {
        return sexuality;
    }

    public void setSexuality(Sexuality sexuality) {
        this.sexuality = sexuality;
    }
}
