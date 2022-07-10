package com.softserve.homework.practicalTask.country;

enum Continents {
    EUROPE("EUROPE","Ukraine","Poland","Norway","Spain","France"),
    ASIA("ASIA","China","Thailand","Japan","Vietnam ","Iran"),
    NORTH_AMERICA("NORTH_AMERICA","Argentina","Ecuador",
            "Colombia ","Venezuela ","Bolivia"),
    SOUTH_AMERICA("SOUTH_AMERICA","Canada","Panama ",
            "Mexico","United States of America","Honduras"),
    AFRICA("AFRICA","Algeria","Nigeria","Congo","Zimbabwe","Egypt "),
    AUSTRALIA("AUSTRALIA","Australia","Samoa",
            "Fiji","Palau","Tonga"),
    ANTARCTICA("ANTARCTICA","Antarctica","","","","");
    private String name;
    private String country1;
    private String country2;
    private String country3;
    private String country4;
    private String country5;
     Continents(String name,String country1,
                       String country2,String country3,
                       String country4,String country5){
        this.name=name;
        this.country1=country1;
        this.country2=country2;
        this.country3=country3;
        this.country4=country4;
        this.country5=country5;
    }
    Continents(String name,String country1){
         this.name=name;
         this.country1=country1;
    }
    Continents(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getCountry3() {
        return country3;
    }

    public void setCountry3(String country3) {
        this.country3 = country3;
    }

    public String getCountry4() {
        return country4;
    }

    public void setCountry4(String country4) {
        this.country4 = country4;
    }

    public String getCountry5() {
        return country5;
    }

    public void setCountry5(String country5) {
        this.country5 = country5;
    }


    public static void main(String[] args) {
        InputCountry inputCountry=new InputCountry();
        Continents continents=null;
        String countryInp= inputCountry.getCountry();

       switch (countryInp){
           case "Ukraine":
           case "Poland":
           case "Norway":
           case "Spain":
           case "France":
             continents =Continents.EUROPE;
             break;
           case "Iran":
           case "China":
           case "Thailand":
           case "Japan":
           case "Vietnam":
               continents =Continents.ASIA;
               break;
           case "Argentina":
           case "Ecuador":
           case "Colombia":
           case "Venezuela":
           case "Bolivia":
               continents =Continents.NORTH_AMERICA;
               break;
           case "Canada":
           case "Panama":
           case "Mexico":
           case "United States of America":
           case "Honduras":
               continents =Continents.SOUTH_AMERICA;
               break;
           case "Algeria":
           case "Nigeria":
           case "Congo":
           case "Zimbabwe":
           case "Egypt":
               continents =Continents.AFRICA;
               break;
           case "Australia":
           case "Samoa":
           case "Fiji":
           case "Palau":
           case "Tonga":
               continents =Continents.AUSTRALIA;
               break;
           case "Antarctica":
               continents =Continents.ANTARCTICA;
               break;
           default:
               System.out.println("No this country\n");
               throw new IllegalArgumentException("Error: Invalid Argument");

       }
        System.out.println("this  country "+countryInp+" belongs to the"+" "+continents);
    }
}