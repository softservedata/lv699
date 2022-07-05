package com.softserve.hw04.PracticalTAsk;

enum Days {
    DAY1("day1", "Monday","Poniedziałek","Понеділок"),

    DAY2("day2","Tuesday", "Wtorek", "Вівторок"),
    DAY3("day3","Wednesday", "Środa", "Середа"),
    DAY4("day4","Thursday", "Czwartek", "Четвер" ),
    DAY5("day5","Friday", "Piątek", "П'ятниця"),
    DAY6("day6","Saturday", "Sobota", "Субота" ),
    DAY7("day7","Sunday", "Niedziela", "Неділя");

    private String name;
    private String translationENG;
    private String translationPL;
    private String translationUA;

    private Days(String name, String translationENG, String translationPL, String translationUA) {
        this.name= name;
        this.translationENG = translationENG;
        this.translationPL = translationPL;
        this.translationUA = translationUA;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", translationENG='" + translationENG + '\'' +
                ", translationPL='" + translationPL + '\'' +
                ", translationUA='" + translationUA + '\'' +
                '}';
    }
        public String getTranslation() { return "translation EN, PL, UA: "+ translationENG + ", " + translationPL + ", "+ translationUA  + ". ";
    }
}

