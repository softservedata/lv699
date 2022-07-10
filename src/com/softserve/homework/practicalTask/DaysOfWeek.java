package com.softserve.homework.practicalTask;


    enum DaysOfWeek {
        MONDAY(1,"Понеділок","Понедельник","Monday"),
        TUESDAY(2,"Вівторок","Вторник","Tuesday"),
        WEDNESDAY(3,"Середа","Среда","Wednesday"),
        THURSDAY(4,"Четвер","Четверг","Thursday"),
        FRIDAY(5,"П'ятниця","Пятница","Friday"),
        SATURDAY(6,"Субота","Субота","Saturday"),
        SUNDAY(7,"Неділя","Воскресенье","Sunday");

        private int number;
private String ukr;
private String rus;
private String eng;

        DaysOfWeek(int number, String ukr, String rus, String eng) {
            this.number = number;
            this.ukr = ukr;
            this.rus = rus;
            this.eng = eng;
        }

        @Override
        public String toString() {
            return "DaysOfWeek {" +
                    " number=" + number +
                    ", ukr='" + ukr + '\'' +
                    ", rus='" + rus + '\'' +
                    ", eng='" + eng + '\'' +
                    '}';
        }
    }


