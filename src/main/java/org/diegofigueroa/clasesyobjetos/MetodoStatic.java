package org.diegofigueroa.clasesyobjetos;

public class MetodoStatic {

}


class Classrom2 {
    private String studentName; //? atributo de instancia
    private static String schoolName = "Escuela tecnica #1"; // ? Inicializamos el atributo
    // * Si tenemos un atributo compartido por TODOS los objetos entonces es STATIC

    // ? Ya no crea un atrbituo schoolName para todos los objetos instanciados
    public Classrom2(String studentName) {
        this.studentName = studentName;
    }

    public void showInfo(){
        System.out.println("Alumno: " + studentName + " Escuela: " + schoolName);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Classrom2.schoolName = schoolName;
    }
}