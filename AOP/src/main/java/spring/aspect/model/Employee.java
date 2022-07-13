package spring.aspect.model;

public class Employee {

    private Long id;
    private String name;
    private Long age;
    private String title;

    public Employee() {}

    public Employee(Long id, String name, Long age, String title) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", title='" + title + '\'';
    }
}
