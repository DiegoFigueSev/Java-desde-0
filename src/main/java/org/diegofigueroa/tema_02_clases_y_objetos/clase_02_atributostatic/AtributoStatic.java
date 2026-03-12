package org.diegofigueroa.tema_02_clases_y_objetos.clase_02_atributostatic;

public class AtributoStatic {
    {
        Classrom std1 = new Classrom("Diego");
        Classrom std2 = new Classrom("Roberto");

        std1.showInfo();
        std2.showInfo();

        Classrom.setSchoolName("Escuela #2");

        std1.showInfo();
        std2.showInfo();
    }
}

