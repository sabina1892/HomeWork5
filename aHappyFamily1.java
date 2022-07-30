package HomeWork6;

import HomeWork4.Human;
import HomeWork4.Pet;


public class aHappyFamily1 {

     public static void main(String[] args) {
        Pet1 pet= new Pet1 ("Dog ", "Rock", 5, 25,
                new String[]{"eat","drink","sleep"});
        Human1 mother = new Human1("Jane","Karleone",1935);
        Human1 father = new Human1("Vito","Karleone", 1932);
        Family family = new Family(mother,father);
        Human1 child = new Human1 ("Michael", "Karleone",1977,
        95, new String[][]{{"sunday","do home work"},
                {"monday","go to courses; watch a film"},
                {"tuesday","read a book"},
                {"wednesday","to go for a walk"},
                {"thursday","read a newspaper"},
                {"friday","go to the gym"},
                {"saturday","resting"}}, family);
        family.setPet(pet);
        family.addChild(child);
        family.countFamily();
        System.out.println(child.getFamily());
        System.out.println(family);

        family.deleteChild(child);
        System.out.println(family);
        family.countFamily();






    }


}