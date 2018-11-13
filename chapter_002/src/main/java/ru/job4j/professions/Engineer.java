package ru.job4j.professions;

public class Engineer extends Profession {

    public Engineer(String name, String profession) {
        super(name, profession);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getProfession() {
        return super.getProfession();
    }

    public House buildHouse (){
        return new House();
    }


}
