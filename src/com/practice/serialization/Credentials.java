package com.practice.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Credentials implements Serializable {

    private String username = "MyUsername";
    transient private String password = "MyPass";

    private void writeObject(ObjectOutputStream oos) throws Exception
    {
        // to perform default serialization of Account object.
        oos.defaultWriteObject();

        // epwd (encrypted password)
        String epwd = "123" + password;

        // writing encrypted password to the file
        oos.writeObject(epwd);
    }

    // this method is executed by jvm when readObject() on
    // Account object reference in main method is executed by jvm.
    private void readObject(ObjectInputStream ois) throws Exception
    {
        // performing default deserialization of Account object
        ois.defaultReadObject();

        // deserializing the encrypted password from the file
        String epwd = (String)ois.readObject();

        // decrypting it and saving it to the original password
        // string starting from 3rd  index till the last index
        password = epwd.substring(3);
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
