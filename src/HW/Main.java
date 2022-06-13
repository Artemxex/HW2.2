package HW;

public class Main {

    public static void main(String[] args) {
        HogwartsStudent Harry = new Gryffindor("Гарри Поттер","Гриффиндор",88,77,95,95,100);
        HogwartsStudent Hermione = new Gryffindor("Гермиона Грейнджер","Гриффиндор",95,90,90,80,90);
        HogwartsStudent Ron = new Gryffindor("Рон Уизли","Гриффиндор",70,70,85,85,95);
        HogwartsStudent Drako = new Slytherin("Драко Малфой","Слизерин",85,70,90,85,90,90,100);
        HogwartsStudent Gregory = new Slytherin("Грегори Гойл","Слизерин",50,62,70,50,30,70,66);
        HogwartsStudent Graham = new Slytherin("Грэхэм Монтегю","Слизерин",70,69,70,80,77,81,55);
        HogwartsStudent Zackary = new Hufflepuff("Захария Смит","Пуффендуй",65,66,69,77,80);
        HogwartsStudent Cedrick = new Hufflepuff("Седрик Диггори","Пуффендуй",83,78,90,93,95);
        HogwartsStudent Justin = new Hufflepuff("Джастин Финч-Флетчли","Пуффендуй",73,63,79,80,84);
        HogwartsStudent Zhou = new Ravenclaw("Чжоу Чанг","Когтевран  ",81,72,85,88,79,90);
        HogwartsStudent Padma = new Ravenclaw("Падма Патил","Когтевран",63,72,68,77,56,81);
        HogwartsStudent Marcus = new Ravenclaw("Маркус Белби","Когтевран",69,50,72,63,72,86);
        Hermione.printStudent(Hermione);
        Drako.printStudent(Drako);
        Cedrick.printStudent(Cedrick);
        Zhou.printStudent(Zhou);
        ((Gryffindor) Harry).compareGryffindor((Gryffindor) Ron);
        ((Slytherin) Gregory).compareSlytherin((Slytherin) Drako);
        ((Hufflepuff) Cedrick).compareHufflepuff((Hufflepuff) Zackary);
        ((Ravenclaw) Padma).compareRavenclaw((Ravenclaw) Marcus);
        Hermione.compareStudentWitchcraft(Graham);
        Justin.compareStudentTransgression(Zackary);





    }
}