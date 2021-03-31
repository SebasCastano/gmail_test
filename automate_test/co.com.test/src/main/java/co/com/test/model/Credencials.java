package co.com.test.model;

import co.com.test.util.PropertiesReader;

public class Credencials {
    private final String user;
    private final String password;


    public Credencials() {
        user = PropertiesReader.getInstancia().getProperty("user");
        password = PropertiesReader.getInstancia().getProperty("password");
    }

    public static Credencials parameterized() {
        return new Credencials();
    }

    public String getStrUsuario() {
        return user;
    }

    public String getStrPassword() {
        return password;
    }

}
