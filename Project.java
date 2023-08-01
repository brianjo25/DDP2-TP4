import java.util.List;

public class Project {
    // TODO: Tambahkan modifier untuk atribut
    private String name;
    private Manager projectLeader;
    private List<Employee> memberList;

    // TODO: Lengkapi constructor
    public Project(String name) {
        this.name = name;
    }

    // TODO: Lengkapi logika menambahkan anggota proyek
    public void addMember(Employee employee) {
        this.memberList.add(employee);
    }


    // TODO: Lengkapi logika menghapus anggota proyek
    public void removeMember(Employee employee) {
        this.memberList.remove(employee);
    }

    public String getName() {
        return this.name;
    }

    public String getProjectLeaderString() {
        if (this.projectLeader) {
            return this.projectLeader;
        } else {
            return "Tidak memiliki leader";
        }
    }

    public int getTotalMemberList() {
        return this.memberList.size();
    }
}
