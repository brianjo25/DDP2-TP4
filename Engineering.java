public class Engineering extends Division{

    public Engineering(int baseSalary) {
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
        return "Engineering";
    }
}
