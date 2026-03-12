package org.diegofigueroa.tema_02_clases_y_objetos.clase_04_modificadoresdeacceso;

class Pet {
    /**
     * Los modificadores de acceso estan relacionados con el ENCAPSULAMIENTO
     * <p>
     * Este nos ayuda a controlar el acceso al os atributos
     */

    public String name; // ? Es visible en todos los lugares
    protected int age; // ? protected: es visible en el paquete y clases q lo heredan
    private boolean isCat; // ? Los atributos privados son solo visibles dentro de la clase

    public Pet(String name, int age, boolean isCat) {
        this.name = name;
        this.age = age;
        this.isCat = isCat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCat() {
        return isCat;
    }

    public void setCat(boolean cat) {
        isCat = cat;
    }

    public void miau() {
        System.out.println("Miau");
    }
}
