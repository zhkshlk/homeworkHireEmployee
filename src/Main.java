public class Main {
    public static void main(String[] args) {
        Candidat candidat = new Candidat("Айбек", 2, 100000, 30);
        Company company = new Company("Акнет", 2, 120000, 20);
        company.Provider();
        candidat.suitable(2, 30, 100000);
    }
}