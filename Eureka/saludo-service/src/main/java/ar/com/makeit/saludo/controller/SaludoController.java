package ar.com.makeit.saludo.controller;

import ar.com.makeit.saludo.feign.ClienteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoController {

    @Autowired
    private ClienteClient clienteClient;

    @GetMapping(value = "")
    public String getSaludo(){
        return clienteClient.getSaludo();
    }
}
