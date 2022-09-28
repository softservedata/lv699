package com.softserve.hw13;

public class Task02 {

    public static void main(String[] args) {

        String a = "A message to encrypt";
        String enc = encrypt(a, 3);
        System.out.println("Encrypted message: " + enc);
        String dec = decrypt(enc, 3);
        System.out.println("Decrypted message: " + dec);
    }


    public static String encrypt(String str, int num) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    sb.append((char) ((c + num - 'A') % 26 + 'A'));
                } else {
                    sb.append((char) ((c + num - 'a') % 26 + 'a'));
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String decrypt(String str, int num) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    sb.append((char) ((c - num - 'Z') % 26 + 'Z'));
                } else {
                    sb.append((char) ((c - num - 'z') % 26 + 'z'));
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
