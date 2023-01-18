package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Lets start DI!");
        String url = "www.naver.com/books/it?page=10";

        // DI: 외부에서 주입을 받는다.
        Encoder encoder = new Encoder(new Base64Encoder()); // 외부에서 주입을 받는다.
        String  result = encoder.encode(url);
        System.out.println(result);
    }
}