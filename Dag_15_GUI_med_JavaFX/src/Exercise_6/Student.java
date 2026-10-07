package Exercise_6;

public class Student {
    private String name;
    private int age;
    private boolean isActive;

    public Student(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public Student() {

    }

    //Getters
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean isActive() {
        return isActive;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

}
