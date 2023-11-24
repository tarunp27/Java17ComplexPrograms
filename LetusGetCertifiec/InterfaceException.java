package LetusGetCertifiec;

import java.io.*;
import java.sql.*;

interface I1 {
    void m1() throws IOException;
}

interface I2 {
    void m1() throws Exception;
}

public class InterfaceException implements I1, I2 {
    public void m1() throws FileNotFoundException
    {
        System.out.println("Hi there");
    }
    public static void main(String args[]) throws Throwable
    {
        InterfaceException tc = new InterfaceException();
        I1 i1 = (I1) tc; //This is valid.
        i1.m1();

        I2 i2 = (I2) tc; //This is valid too.
        i2.m1();
    }
}
