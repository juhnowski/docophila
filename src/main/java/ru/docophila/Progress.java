package ru.docophila;

public class Progress {
    public static final String PAGE = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<style>\n" +
            "#myProgress {\n" +
            "  width: 100%;\n" +
            "  background-color: #ddd;\n" +
            "}\n" +
            "\n" +
            "#myBar {\n" +
            "  width: 10%;\n" +
            "  height: 30px;\n" +
            "  background-color: #d2daf4;\n" +
            "  text-align: center;\n" +
            "  line-height: 30px;\n" +
            "  color: white;\n" +
            "}\n" +
            "</style>\n" +
            "<body onload=\"move()\">\n" +
            "\n" +
            "<h1>Данные обрабатываются</h1><p>Пожалуйста подождите</p>" +
            "\n" +
            "<div id=\"myProgress\">\n" +
            "  <div id=\"myBar\">0%</div>\n" +
            "</div>\n" +
            "<script>\n" +
            "function move() {\n" +
            "  var elem = document.getElementById(\"myBar\");   \n" +
            "  var width = 0;\n" +
            "  var id = setInterval(frame, 1000);\n" +
            "  function frame() {\n" +
            "    if (width >= 100) {\n" +
            "      location.reload();\n" +
            "    } else {\n" +
            "      width++; \n" +
            "      elem.style.width = width + '%'; \n" +
            "      elem.innerHTML = width * 1  + '%';\n" +
            "    }\n" +
            "  }\n" +
            "}\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
}
