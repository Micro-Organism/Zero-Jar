package com.zero.jar.xjar;

import io.xjar.XCryptos;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZeroJarXjarApplicationTests {

    @Test
    @SneakyThrows
    void contextLoads() {
        // Spring-Boot Jar包加密
        XCryptos.encryption()
                .from("target/zero-jar-xjar-0.0.1-SNAPSHOT.jar")
                .use("password")
                .exclude("/static/**/*")
                .exclude("/templates/**/*")
                .exclude("/META-INF/resources/**/*")
                .to("target/xJarDir/xjar-encryption.jar");
        System.out.println("success");
    }

}
