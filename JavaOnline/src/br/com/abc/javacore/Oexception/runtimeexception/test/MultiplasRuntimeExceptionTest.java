package br.com.abc.javacore.Oexception.runtimeexception.test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException |  IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("Final do programa");

        try {
            talvezLanceException();
        } catch (Exception e) {

        }
    }
    private static void talvezLanceException() throws SQLException, AWTException, IOException{

    }
}
