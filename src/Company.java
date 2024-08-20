public class Company extends AbstractCompany {
    public Company() {
    }

    public Company(String name, int experience, int zp, int age) {
        super(name, experience, zp, age);
    }


    @Override
    public void Provider() {
        System.out.println("Предоставление услуг интернета");
    }
}
