import java.util.Objects;

public class Person {

    private String firstName;
    private String lastNAme;
    private int age;
    private String job;

    public Person (){};
    public Person(String firstName, String lastName,int age,String job){
        this.firstName=firstName;
        this.lastNAme = lastName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && lastNAme.equals(person.lastNAme) && job.equals(person.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastNAme, age, job);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastNAme='" + lastNAme + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
