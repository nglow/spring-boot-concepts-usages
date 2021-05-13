package org.example;

import org.apache.catalina.LifecycleException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class Application {

    public static void main(String[] args) throws LifecycleException {
        // Customizing 을 위해 아래 두가지 방법을 사용할 수 있음
        // 1.
        SpringApplication app = new SpringApplication(Application.class);
        // Application Context가 생성되기전에 발생하는 이벤트이기 때문에 컴포넌트 스캔이 되지 않는다. 따라서 아래처럼 등록해 주어야 동작 한다.
        app.addListeners(new ListenerAppStarting());
        // MVC - SERVLET, Webflux - REACTIVE
        app.setWebApplicationType(WebApplicationType.SERVLET);
        app.run(args);
        // 2.
//        new SpringApplicationBuilder()
//                .sources(Application.class)
//                .run(args);
    }
}
