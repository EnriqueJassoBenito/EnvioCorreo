package mx.edu.utez.sda.springsms.service;

import org.springframework.stereotype.Service;

@Service
public class HtmlMessageRender {
    private static final String HTML_TEMPLATE =
            "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    " <style>\n" +
                    " .ventana {\n" +
                    " width: 300px;\n" +
                    " height: 200px;\n" +
                    " border: 2px solid #000;\n" +
                    " border-radius: 5px;\n" +
                    " padding: 20px;\n" +
                    " text-align: center;\n" +
                    " position: absolute;\n" +
                    " top: 50%;\n" +
                    " left: 50%;\n" +
                    " transform: translate(-50%, -50%);\n" +
                    " }\n" +
                    " </style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    " <div class=\"ventana\">\n" +
                    " <p id=\"mensaje\">##MENSAJE##</p>\n" +
                    " </div>\n" +
                    "</body>\n" +
                    "</html>";

    public String renderHtmlMessage(String message) {
        return HTML_TEMPLATE.replace("##MENSAJE##", message);
    }
}
