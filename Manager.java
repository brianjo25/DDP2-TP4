public class Manager extends Employee {

    public Manager(String name, int yearsOfExperience, double salaryMultiplier) {
        super(name, yearsOfExperience, salaryMultiplier);
    }

    @Override
    public String toString() {
        // TODO
        return super.toString();
    }

    @Override
    public void addProject(Project project) {
        if (this.getProjects().size() == 3) {
            System.out.println("Karyawan " + this.getName() + " hanya dapat mengikuti tiga proyek.");
        } else {
            this.getProjects().add(project);
        }
    }
}