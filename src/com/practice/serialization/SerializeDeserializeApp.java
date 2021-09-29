package com.practice.serialization;

import java.io.*;

public class SerializeDeserializeApp {

    public static void main(String[] args) throws Exception {
        Credentials credentials = new Credentials();

        System.out.println("Before Serialization");
        System.out.println(credentials);

        //Exporting
        FileOutputStream fileOutputStream = new FileOutputStream("output.ser");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(credentials);
        //Reading
        FileInputStream fileInputStream = new FileInputStream("output.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Credentials credentialsSerializeDeSerialize = (Credentials) objectInputStream.readObject();

        System.out.println("After Serialization");
        System.out.println(credentialsSerializeDeSerialize);
    }
}
