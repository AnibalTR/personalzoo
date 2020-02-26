package neumont.edu.csc150.c.test;

import neumont.edu.csc150.c.model.Encryption;

public class Test {
    public static void main(String[] args) {
        Encryption enc = new Encryption();

        String hello = enc.encrypt("abcdefghijklmnopqrstuvwxyz");

        System.out.println(hello);

        String dec = enc.decrypt(hello);
        System.out.println(dec);
    }
}
