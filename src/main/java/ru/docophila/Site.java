package ru.docophila;
import java.io.File;

import static spark.Spark.*;

public class Site {

    /*
    staticFiles.externalLocation("src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"public"+ File.separator+"dashboard"+ File.separator);
    */
    public static void main(String[] args) {
        port(80);
        staticFiles.location("/public");
        get("/message", (req, res) -> "Hello from Docophila with Love");
    }
}
