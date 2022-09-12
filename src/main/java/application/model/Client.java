package application.model;

import java.math.BigInteger;

public class Client {

    BigInteger clientNumber;
    private String name;
    private String surname;
    private String passportNumber;

    public Client(BigInteger clientNumber, String name, String surname, String passportNumber) {
        this.clientNumber = clientNumber;
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
    }
}
