package org.example;

import me.ndoom.Ndoom;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class NdoomRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Ndoom ndoom = new Ndoom();
    }
}
