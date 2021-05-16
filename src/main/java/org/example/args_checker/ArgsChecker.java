package org.example.args_checker;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgsChecker {

    // Bean의 생성자가 1개이고, 그 생성자의 파라미터가 Bean일 경우에는 그 Bean을 스프링이 알아서 주입해줌 (@Autowired 필요하지 않음)
    // JVM option은 args의 arguemnts가 아님, --로 들어가는 파라미터만 arguments임
    // java -jar ./build/libs/spring-boot-getting-started-1.0-SNAPSHOT.jar -Dfoo --bar
    public ArgsChecker(ApplicationArguments args) {
        System.out.println("Use None");
        System.out.println("foo: " + args.containsOption("foo"));
        System.out.println("bar: " + args.containsOption("bar"));
    }
}
