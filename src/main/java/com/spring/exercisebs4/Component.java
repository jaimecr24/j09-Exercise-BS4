package com.spring.exercisebs4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Component {

    @Autowired Properties properties;
    @Autowired MyProperties myProperties;

    @GetMapping("/valores")
    public Object getValores(){
        return "valor de var1 es: "+properties.getVAR1()+", valor de my.var2 es: "+myProperties.getVAR2();
    }

    @GetMapping("/var3")
    public Object getVar3(){
        if (properties.getVAR3()==null) properties.setVAR3("var3 no tiene valor");
        return "valor de var3 es: "+properties.getVAR3();
    }
}
