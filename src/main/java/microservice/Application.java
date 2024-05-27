package microservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Application
 * <p>
 * Application class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil.pe
 * @since 10/03/2024
 */

@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {
        "pe.mil.ejercito.lib.utils",
        "pe.mil.ejercito.microservice",
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}