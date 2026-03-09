package org.diegofigueroa.oop;

public class Constructores {

    {

        // * Instanciamos la clase al crear un objeto con esa clase o molde
        HouseB house = new HouseB();
        house.size = 32;

        HouseB house2 = new HouseB(4, 6, 6);

        house.openDoor();

        System.out.println(house2.calculateArea());

    }

}

class HouseB {
    // ? ATRIBUTOS
    int doors;
    int windows;
    double size;

    /**
     * Un constructor es un metodo especial
     *
     * Su proposito es inicializar los atributos del objeto y establecer el esatdo inicial del mismo
     */
    public HouseB() {

    }

    // ? Vamos a realizar un oversharge

    //? Significa que realizamos el mismo metodo pero con diferentes parametros
    public HouseB(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    /**
     * Al realizar un constructor tenemos las sgtes ventajas:
     * - Vamos a crear un objeto con atributos validos desde un inicio
     * - flexibilidad: porque podemos definir constructor dependiendo las necesidades
     */

    // ? METODOS

    void openDoor(){
        System.out.println("La puerta esta abierta");
    }

    double calculateArea(){
        return size * size;
    }
}
