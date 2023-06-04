public class User 
{
    private Integer id;
    private String name;
    private String password;
    private int leaveBalance;
    private int casualLeave;
    private int earnedLeave;
    private int sickLeave;

    public User() {    }

    public User(Integer id, String name, String password, int leaveBalance, int casualLeave, int earnedLeave,int sickLeave) 
    {
        this.id = id;
        this.name = name;
        this.password = password;
        this.leaveBalance = leaveBalance;
        this.casualLeave = casualLeave;
        this.earnedLeave = earnedLeave;
        this.sickLeave = sickLeave;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(int leaveBalance) {
        this.leaveBalance = leaveBalance;
    }

    public int getCasualLeave() {
        return casualLeave;
    }

    public void setCasualLeave(int casualLeave) {
        this.casualLeave = casualLeave;
    }

    public int getEarnedLeave() {
        return earnedLeave;
    }

    public void setEarnedLeave(int earnedLeave) {
        this.earnedLeave = earnedLeave;
    }

    public int getSickLeave() {
        return sickLeave;
    }

    public void setSickLeave(int sickLeave) {
        this.sickLeave = sickLeave;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password + ", leaveBalance=" + leaveBalance
                + ", casualLeave=" + casualLeave + ", earnedLeave=" + earnedLeave + ", sickLeave=" + sickLeave + "]";
    }

    

}
