public abstract class AbstractCompany {
    private String name;
    private int experience;
    private int zp;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getZp() {
        return zp;
    }

    public void setZp(int zp) {
        this.zp = zp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AbstractCompany() {

    }
    public AbstractCompany(String name, int experience, int zp, int age) {
        this.name = name;
        this.experience = experience;
        this.zp = zp;
        this.age = age;
    }

    public abstract void Provider ();
}
