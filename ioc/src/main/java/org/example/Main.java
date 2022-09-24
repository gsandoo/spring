package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Lets start DI!");


        String url = "www.naver.com/books/it?page=10";

        Encoder encoder = new Encoder(new UrlEncoding());
        Encoder encoder1 = new Encoder(new Base64Encoder());
        String  result = encoder.encode(url);
        String resultTwo = encoder1.encode(url);


        System.out.println(result);
        System.out.println(resultTwo);
    }
}