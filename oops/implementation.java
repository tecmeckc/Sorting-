package oops;

public class implementation {
  public static void main(String[] args) {
    getandset khyati = new getandset();
    getandset def = new getandset();
    def.setDefaultUsername();
    khyati.setUsername("khyati@27");
    khyati.setPassword("220210");
    System.out.println(khyati.getUsername(true));
    System.out.println(khyati.getPassword(true));
  }

}
