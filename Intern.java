public class Intern extends Employee {

    public Intern(String name, int yearsOfExperience, double salaryMultiplier) {
        super(name, yearsOfExperience, salaryMultiplier);
    }

    @Override
    public String toString() {
        // TODO
        return super.toString();
    }

    @Override
    public void addProject(Project project) {
        if (this.getProjects().size() == 1) {
            System.out.println("Karyawan " + this.getName() + " hanya dapat mengikuti satu proyek.");
        } else {
            this.getProjects().add(project);
        }
    }
}
