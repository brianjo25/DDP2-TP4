import java.util.List;

public class Employee {
    // TODO: Tambahkan modifier untuk atribut
    private String name;
    private int yearsOfExperience;
    private double salaryMultiplier;
    private Division division;
    private List<Project> projects;

    // TODO: Lengkapi constructor
    public Employee(String name, int yearsOfExperience, double salaryMultiplier) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.salaryMultiplier = salaryMultiplier;
    }

    public void addProject(Project project) {
        if (this.projects.size() == 2) {
            System.out.println("Karyawan " + this.name + " hanya dapat mengikuti dua proyek.");
        } else {
            this.projects.add(project);
        }
    }

    public int calculateSalary() {
        // TODO Lengkapi logika untuk menghitung gaji
        return (int) (this.division.getBaseSalary() * (1 + this.salaryMultiplier + this.yearsOfExperience / 10 ));
    }

    public String getDivisionName() {
        //TODO: Lengkapi logika untuk mendapat string nama divisi
        return this.division.getDivisionName();
    }

    public String getProjectsString() {
        //TODO: Lengkapi logika untuk mendapat string daftar proyek
        String result = "";
        for (int i=0; i<this.projects.size(); i++) {
            result = result + this.projects.get(i).getName();
            if (i < this.projects.size()-1) {
                result = result + ", ";
            }
        }
        return result;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " " + this.calculateSalary() + " " + this.getProjectsString();
    }

    // Tambahkan getter & setter lainnya sesuai kebutuhan

    public List<Project> getProjects() {
        return this.projects;
    } 
}
