package org.example.external_variable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ExternalVariable implements ApplicationRunner {

    @Autowired
    GlowestProperties glowestProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("============");
        System.out.println(glowestProperties.getName());
        System.out.println(glowestProperties.getAge());
        System.out.println(glowestProperties.getFullName());
        System.out.println(glowestProperties.getSessionTimeout());
        System.out.println("============");
    }
}
