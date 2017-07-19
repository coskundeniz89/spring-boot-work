package tr.cd;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by coskun.deniz on 7/19/2017.
 */
@Component
@ConfigurationProperties(prefix="my")
public class MyConfig {

  private List<String> servers;
  private boolean enabled;
  private Security security;

  public List<String> getServers() {
    return this.servers;
  }

  public void setServers(List<String> servers) {
    this.servers = servers;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public Security getSecurity() {
    return security;
  }

  public void setSecurity(Security security) {
    this.security = security;
  }

  public static class Security {
    private String username;
    private String password;
    private List<String> roles = new ArrayList<>(Collections.singleton("USER"));

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }

    public List<String> getRoles() {
      return roles;
    }

    public void setRoles(List<String> roles) {
      this.roles = roles;
    }
  }
}