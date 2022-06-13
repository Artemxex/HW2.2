package HW;

public class Slytherin extends HogwartsStudent {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;




    public Slytherin(String name,String faculty, int witchcraft, int transgression,int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, faculty, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return
                "; Хитрость=" + cunning +
                "; Решительность=" + determination +
                "; Амбициозность=" + ambition +
                "; Находчивость=" + resourcefulness +
                "; Жажда Власти=" + lustForPower +
                ';';
    }
    public void compareSlytherin (Slytherin student) {
        int sum = this.getAmbition() + this.getCunning() + this.getDetermination() + this.getResourcefulness() + this.getLustForPower();
        int sum2 = student.getAmbition() + student.getCunning() + student.getDetermination() + student.getResourcefulness() + student.getLustForPower();
        if (sum > sum2) {
            System.out.println(this.getName() + " Лучший Слизеринец чем " + student.getName());
        } else {
            System.out.println(student.getName() + " Лучший Слизеринец чем " + this.getName());
        }
    }
}
