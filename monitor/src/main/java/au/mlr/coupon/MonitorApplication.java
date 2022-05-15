package au.mlr.coupon;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 *
 * <h1>admin monitor center service entry</h1>
 *
 * @author manurodgers
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class MonitorApplication {
  public static void main(String[] args) {
    SpringApplication.run(MonitorApplication.class, args);
  }
}
