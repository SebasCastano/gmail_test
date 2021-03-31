package co.com.test.util;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertiesReader {

    private static final Logger LOGGER = Logger.getLogger(PropertiesReader.class);
    private static PropertiesReader instancia;
    private Properties prop;

    private PropertiesReader() {
        try {
            prop = new Properties();
            try (InputStream inputStrem = new FileInputStream(
                    System.getProperty("user.dir") + "\\" + "gmail_test.properties")) {
                prop.load(inputStrem);
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }

    }

    public static PropertiesReader getInstancia() {
        if (instancia == null) {
            instancia = new PropertiesReader();
        }
        return instancia;
    }

    public String getProperty(final String nombrePropiedad) {
        return prop.getProperty(nombrePropiedad);
    }

}
