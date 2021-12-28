package com.awesam;
import java.util.UUID;
public class MyUuidApp {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        System.out.println("Your UUID is: " + uuidAsString);
    }
}
