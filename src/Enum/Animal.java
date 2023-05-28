package Enum;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");// это то же самое что - new DOG("собака")

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }
    public String getTranslation(){
        return translation;
    }
    public String toString(){
        return "Перевод на русский язык: " + translation;
    }
}
