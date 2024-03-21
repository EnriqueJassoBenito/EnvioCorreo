package mx.edu.utez.sda.springsms.controller;

import mx.edu.utez.sda.springsms.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private MailService mailService;

    @GetMapping("/sendMail")
    public ResponseEntity<String>sendMail(){
        mailService.sendMail(
                "20213tn033@utez.edu.mx",
                "Holi uwu",
                "hola pendejos de mierda soy el anticristo 2009 y hoy les traigo una creppypasta que los hará miarse");
        return ResponseEntity.ok("Correo enviado con exito");
    }

}
