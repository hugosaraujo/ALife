package alife.models;

public class Person {
    private String name;
    private int day;
    private int mounth;
    private int year;
    private String birthDate;
    private String deathDate;

    public String showDetails(){
        return """
                Data de Nascimento: %s
                Data da Morte: %s
                """.formatted(birthDate, deathDate);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBirthDate(){
        birthDate = "%d/%d/%d".formatted(day, mounth, year);
    }
    public void setDeathDate(){
        deathDate ="%d/%d/%d".formatted(day, mounth, year + 100);
    }
}
