package Exercise_1_NonLazy;

public class Person {
    private String name;
    private String title;
    private boolean senior;

    public Person(String name, String title, boolean senior) {
        this.name = name;
        this.title = title;
        this.senior = senior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    public String toString() {
        String s = title + " " + name;
        if (senior) {
            s += " (senior)";
        }
        return s;
    }
}
