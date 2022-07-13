package collections;

public class Example {

    private Integer id;
    private String title;

    public Example() {
    }

    public Example(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Example example = (Example) o;

        if (!id.equals(example.id)) return false;
        return title.equals(example.title);
    }

    @Override
    public int hashCode() {
        Integer result = id.hashCode();
        result = 31 * result + title.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return " {" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
