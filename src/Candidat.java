public class Candidat implements Suitable {
    private String name;
    private int experience;
    private int zp;
    private int age;

    public Candidat(String name, int experience, int zp, int age) {
        this.name = name;
        this.experience = experience;
        this.zp = zp;
        this.age = age;
    }

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

    @Override
    public void suitable(int experience, int age, int zp) {
        Company company = new Company();
        if (company.getAge() <= age && company.getExperience() <= experience && company.getZp() <= zp) {
            System.out.println("Человек может быть нанят");
        }
    }
}
