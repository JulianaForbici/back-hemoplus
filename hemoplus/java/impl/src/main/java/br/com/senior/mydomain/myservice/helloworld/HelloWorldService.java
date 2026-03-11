package br.com.senior.mydomain.myservice.helloworld;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String montarMensagem(String who) {
        return String.format("Hello World, %s!", who);
    }
}
