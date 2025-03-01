package org.example;

import java.util.List;

/**
 * author Andrés Monje Delgado
 **/
public interface iAgenda {
    void addContact(String name, String phone);

    void removeContact(String name);

    void modifyPhoneNumber(String name, String oldPhone, String newPhone);

    List<Persona> getContacts();
}
