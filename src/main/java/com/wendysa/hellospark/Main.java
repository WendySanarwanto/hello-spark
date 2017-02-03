package com.wendysa.hellospark;

/**
 * Hello Spark!
 *
 */
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        try{
            get("/hello", (req, res) -> "Hello Spark");
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }
}