package HW;

public class Hufflepuff extends HogwartsStudent{

    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name,String faculty, int witchcraft, int transgression,int hardworking, int loyalty, int honesty) {
        super(name, faculty, witchcraft, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "; Трудолибивость=" + hardworking +
                "; Верность=" + loyalty +
                "; Честность=" + honesty +
                ';';
    }
    public void compareHufflepuff(Hufflepuff student) {
        int sum = this.getHardworking() + this.getHonesty() + this.getLoyalty();
        int sum2 = student.getHardworking() + student.getHonesty() + student.getLoyalty();
        if (sum > sum2) {
            System.out.println(this.getName() + " Лучший Пуффендуец чем " + student.getName());
        } else {
            System.out.println(student.getName() + " Лучший Пуффендуец чем " + this.getName());
        }
    }
}
