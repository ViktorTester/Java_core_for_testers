package lessons.lesson_4.task_2;


public class Main {
    public static void main(String[] args){
        System.out.println("Creating a new phonebook");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Filling out the phonebook");
        phonebook.add("Johnson", "26677667");
        phonebook.add("Johnson", "28856798");
        phonebook.add("Mac`Milan", "24684344");
        phonebook.add("O`Neil", "27899876");
        phonebook.add("Johnson", "25060706");
        System.out.println("-----------------");

        System.out.println("Getting numbers");
        System.out.println("Johnson");
        System.out.println(phonebook.get("Johnson"));
        System.out.println("Mac`Milan");
        System.out.println(phonebook.get("Mac`Milan"));
        System.out.println("O`Neil");
        System.out.println(phonebook.get("O`Neil"));
        System.out.println("-----------------");

        System.out.println("Record missing");
        System.out.println("Potter");
        System.out.println(phonebook.get("Potter"));
        System.out.println("-----------------");

        System.out.println("Trying to write down an existing number");
        phonebook.add("Johnson", "26677667");
        System.out.println("Johnson");
        System.out.println(phonebook.get("Johnson"));
    }
}
