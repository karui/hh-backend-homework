package ru.hh.nab.app;

import org.junit.Test;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import ru.hh.nab.starter.NabApplication;
import ru.hh.nab.testbase.NabTestBase;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(classes = ExampleTestConfig.class)
public class ResourceTest extends NabTestBase {

  @Test
  public void hello() {
    final String name = "test";
    Response response = target("/hello")
        .queryParam("name", name)
        .request()
        .get();
    assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    assertEquals(String.format("Hello, %s!", name), response.readEntity(String.class));
  }

  @Test
  public void helloWithoutParams() {
    Response response = createRequest("/hello").get();
    assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    assertEquals("Hello, world!", response.readEntity(String.class));
  }

  @Override
  protected NabApplication getApplication() {
    return NabApplication.builder().configureJersey(SpringCtxForJersey.class).bindToRoot().build();
  }

  @Configuration
  @Import(Resource.class)
  static class SpringCtxForJersey {
  }
}
