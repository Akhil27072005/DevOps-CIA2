
package com.example.ci_cd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    private final HelloController controller = new HelloController();

    @Test
    void homePageReturnsExpectedMessage() {
        String response = controller.hello();

        assertEquals(
            "Hello! CI/CD Pipeline Application is Running. A change was made",
            response
        );
    }
}
