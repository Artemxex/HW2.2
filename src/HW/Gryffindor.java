package HW;

public class Gryffindor extends HogwartsStudent {

    private int nobility;
    private int bravery;
    private int honour;

    public Gryffindor(String name,String faculty, int witchcraft, int transgression,int nobility, int bravery, int honour) {
        super(name, faculty, witchcraft, transgression);
        this.nobility = nobility;
        this.bravery = bravery;
        this.honour = honour;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    @Override
    public String toString() {
        return
                "; Благородство-" + nobility +
                "; Храбрость-" + bravery +
                "; Честь-" + honour + ";";
    }
    public void compareGryffindor (Gryffindor student) {
        int sum = this.getBravery() + this.getHonour() + this.getNobility();
        int sum2 = student.getBravery() + student.getHonour() + student.getNobility();
        if (sum > sum2) {
            System.out.println(this.getName() + " Лучший Гриффиндорец чем " + student.getName());
        } else {
            System.out.println(student.getName() + " Лучший Гриффиндорец чем " + this.getName());
        }
    }
}

