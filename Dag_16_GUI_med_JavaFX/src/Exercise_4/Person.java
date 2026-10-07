package Exercise_4;

public class Person
{
    private String firstName;

    public Person(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    @Override
    public String toString() {
        return firstName;
    }

}
