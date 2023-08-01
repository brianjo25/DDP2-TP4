public class Design extends Division {

    public Design(int baseSalary) {
        super(baseSalary);
    }
    
    @Override
    public void addEmployee(Employee employee) {
        super.addEmployee(employee);
        // TODO: Lengkapi
        return employee.getEmployeeType() + " " + employee.getName() + " berhasil ditambahkan ke divisi " + this.getDivisionName();
    }

    @Override
    public String getDivisionName() {
        return "Design";
    }
}
