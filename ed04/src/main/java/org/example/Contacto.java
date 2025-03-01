package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contacto y sus números de teléfono.
 * @author Andrés Monje Delgado
 * @version 1.0
 * @since 1.0
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor para añadir un contacto y sus números de teléfono.
     * @param name
     * @param phone
     * @since 1.0
     */
    public Contacto(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Constructor para conseguir un contacto.
     * @return name
     * @since 1.0
     */
    public String getName() {
        return this.name;
    }

    /**
     * Constructor para conseguir la lista de teléfonos.
     * @return phones
     * @since 1.0
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}