
package animal;


public class Animal {
    private int age;
    private String gender;
    private boolean isMammal;

    public Animal(int age, String gender, boolean isMammal) {
        this.age = age;
        this.gender = gender;
        this.isMammal = isMammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isIsMammal() {
        return isMammal;
    }

    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" + "age=" + age + ", gender=" + gender + ", isMammal=" + isMammal + '}';
    }

    

}
