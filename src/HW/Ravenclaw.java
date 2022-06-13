package HW;

import java.util.HashMap;

public class Ravenclaw extends HogwartsStudent {

    private int cleverness;
    private int wisdom;
    private int creativness;
    private int wit;

    public Ravenclaw(String name,String faculty, int witchcraft, int transgression,int cleverness, int wisdom, int creativness, int wit) {
        super(name, faculty, witchcraft, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.creativness = creativness;
        this.wit = wit;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativness() {
        return creativness;
    }

    public void setCreativness(int creativness) {
        this.creativness = creativness;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    @Override
    public String toString() {
        return "; Ум=" + cleverness +
                "; Мудрость=" + wisdom +
                "; Креативность=" + creativness +
                "; Остроумие=" + wit +
                ';';
    }
    public void compareRavenclaw(Ravenclaw student) {
        int sum = this.getCleverness() + this.getCreativness() + this.getWit() + this.getWisdom();
        int sum2 = student.getCleverness() + student.getCreativness() + student.getWit() + student.getWisdom();
        if (sum > sum2) {
            System.out.println(this.getName() + " Лучший Когтевранец чем " + student.getName());
        } else {
            System.out.println(student.getName() + " Лучший Когтевранец чем " + this.getName());
        }
    }
}

