package mx.edu.utez.sda.springsms.controller;

import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    @Value("${TWILIO_ACCOUNT_SID}")
    String sid;
    @Value("${TWILIO_AUTH_TOKEN}")
    String token;
    @Value("${TWILIO_NUMBER}")
    String phoneNumber;

    @GetMapping(value = "/sendSMS")
    public ResponseEntity<String>sendSMS(){
        Twilio.init(sid, token);
        Message.creator(
                new PhoneNumber("+527772671360"),
                new PhoneNumber(phoneNumber),
                "hola pendejos de mierda soy el anticristo 2009 y hoy les traigo una creppypasta que los hará miarse").create();
        return
                new ResponseEntity<String>
                        ("Message sent successfully", HttpStatus.OK);
    }

}
