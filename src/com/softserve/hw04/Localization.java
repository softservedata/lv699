package com.softserve.hw04;

public enum Localization {
EN("���������", "English"), UA("���������", "Ukrainian");
private final String ua;
private final String en;

Localization(String ua, String en) {
this.ua = ua;
this.en = en;
}

public String getUa() {
return ua;
}

public String getEn() {
return en;
}

