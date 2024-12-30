package oops;

public class getandset {
  private String username;
  private String password;

  public void setUsername(String username) {
    this.username = username;
  }

  // Abstraction
  public void setDefaultUsername() {
    setDefaultUsername("Default-user");
  }

  public void setDefaultUsername(String str) {
    this.username = str;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  // encapsulation:getters and setters
  public String getUsername(boolean b) {
    if (b)
      return username;
    else
      return "Nice try!Better luck next time!";
  }

  public String getPassword(boolean y) {
    if (y) {
      return password;
    } else
      return "No access!";
  }

}
