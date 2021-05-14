package org.example;

import org.apache.catalina.LifecycleException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // Customizing 을 위해 SpringApplication을 생성하는 방법에는 아래와 같은 방법과 SpringApplicationBuilder()를 사용하는 방법이 있다.
        SpringApplication app = new SpringApplication(Application.class);
        // Application Context가 생성되기전에 발생하는 이벤트이기 때문에 컴포넌트 스캔이 되지 않는다. 따라서 아래처럼 등록해 주어야 동작 한다.
        app.addListeners(new ListenerAppStarting());
        // MVC - SERVLET, Webflux - REACTIVE
        app.setWebApplicationType(WebApplicationType.SERVLET);
        app.run(args);
    }
}
