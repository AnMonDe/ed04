package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase Agenda que almacena contactos en una lista.
 * @see Contacto
 * @author Andres Monje Delgado
 * @version 1.0 01-03-2025
 * @since 1.0
 */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Constructor para inicializar la lista de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Metodo para añadir nombre y teléfono a la agenda.
     * Si el contacto ya existe, añade el número de teléfono al contacto existente.
     * Si el contacto no existe, crea un nuevo contacto con el nombre y el número de teléfono.
     * @param name
     * @param phone
     * @return void
     * @since 1.0
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Metodo para eliminar un contacto de la agenda por nombre.
     * Si el contacto no existe, no hace nada.
     * @param name
     * @return void
     * @since 1.0
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Metodo para modificar un número de teléfono de un contacto.
     * Modifica el numero de un contacto por un nuevo número.
     * @param name
     * @param oldPhone
     * @param newPhone
     * @return void
     * @since 1.0
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }


    public List<Contacto> getContacts() {
        return this.contacts;
    }
}