package entities;

public class Predator {
    Integer noOfPenguinKills;

    public Predator() {
        noOfPenguinKills = 0;
    }

    public Predator(Integer noOfPenguinKills) {
        this.noOfPenguinKills = noOfPenguinKills;
    }

    public Integer getNoOfPenguinKills() {
        return noOfPenguinKills;
    }

    public void setNoOfPenguinKills(Integer noOfPenguinKills) {
        if (noOfPenguinKills < 0) {
            System.out.println("no. of penguins killed can't be negative!");
            return;
        }
        this.noOfPenguinKills = noOfPenguinKills;
    }

    public void killPenguin(PenguinFamily pFamily, Penguin p) {
        Penguin parents[] = pFamily.getParents();
        if (parents != null) {
            for (int i = 0; i < parents.length; i++) {
                if (parents[i] == p) {
                    parents[i].setIsAlive(false);
                    // System.out.println("Killed "+parents[i]+" by predator ");
                    noOfPenguinKills++;
                }
            }
            // System.out.println(p + " killed by predator ");
        }
    }

    @Override
    public String toString() {
        return "Predator [noOfPenguinKills=" + noOfPenguinKills + "]";
    }

}
