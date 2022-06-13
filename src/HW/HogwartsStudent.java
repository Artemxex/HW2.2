package HW;

public class HogwartsStudent {

    private String name;
    private String faculty;
    private int witchcraft;
    private int transgression;

    public HogwartsStudent(String name, String faculty, int witchcraft, int transgression) {
        this.name = name;
        this.faculty = faculty;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }


    public void printStudent(HogwartsStudent name) {
        System.out.println("Имя-" + name.getName()
                + "; Факультет-" + name.getFaculty()
                + "; Колдовство-" + name.getWitchcraft()
                + "; Трансгрессия-" + name.getTransgression()
                + toString());
    }
    public void compareStudentWitchcraft (HogwartsStudent student) {
        if (this.getWitchcraft() > student.getWitchcraft()) {
            System.out.println(this.getName() + " (" + this.getWitchcraft() + " баллов)" + " лучший колдун чем "
                    + student.getName() + " (" + student.getWitchcraft()  + " баллов)");
        } else {
            System.out.println(student.getName() + " (" + student.getWitchcraft() + " баллов)" + " лучший колдун чем "
                    + this.getName() + " (" + this.getWitchcraft()  + " баллов)");
        }
    }
    public void compareStudentTransgression (HogwartsStudent student) {
        if (this.getTransgression() > student.getTransgression()) {
            System.out.println(this.getName() + " (" + this.getTransgression() + " баллов)" + " трансгрессирет лучше чем "
                    + student.getName() + " (" + student.getTransgression()  + " баллов)");
        } else {
            System.out.println(student.getName() + " (" + student.getTransgression() + " баллов)" + " трансгрессирет лучше чем "
                    + this.getName() + " (" + this.getTransgression()  + " баллов)");
        }
    }
}

