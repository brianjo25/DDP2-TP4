import java.util.List;

public class Division {
    // TODO: Tambahkan modifier untuk atribut
    private int baseSalary;
    private List<Employee> employeeList;

    // TODO: Lengkapi constructor
    public Division(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    // TODO: Lengkapi logika untuk menambahkan karyawan
    public void addEmployee(Employee employee) {
        if (this instanceof Manager) {
            this.employeeList.add(0, employee);
        } else {
            this.employeeList.add(employee);
        }
    }

    // Tambahkan getter & setter lainnya sesuai kebutuhan

    public int getBaseSalary() {
        return this.baseSalary;
    }

    public String getDivisionName() {
        if (this instanceof HRD) {
            return "HRD";
        } else if (this instanceof Engineering) {
            return "Engineering";
        } else if (this instanceof Marketing) {
            return "Marketing";
        } else if (this instanceof Design) {
            return "Design";
        }
        return "";
    }

    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public int getTotalManager() {
        int result = 0;
        for (int i=0; i < this.employeeList.size(); i++) {
            if (this.employeeList.get(i) instanceof Manager) {
                result = result + 1;
            }
        }
        return result;
    }

    public String toString() {
        if (this.getEmployeeList().size()==0 && this.getTotalManager()==0) {
            return "Divisi " + this.getDivisionName() + " tidak memiliki karyawan.";
        }
        return "Divisi " + this.getDivisionName() + " memiliki " + this.getEmployeeList().size() + " karyawan dengan " + this.getTotalManager() + " manager.";
    }
}
