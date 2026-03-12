package org.diegofigueroa.tema_02_clases_y_objetos.clase_03_metodostatic;

class Classrom {
    private String studentName; //? atributo de instancia
    private static String schoolName = "Escuela tecnica #1"; // ? Inicializamos el atributo
    // * Si tenemos un atributo compartido por TODOS los objetos entonces es STATIC

    // ? Ya no crea un atrbituo schoolName para todos los objetos instanciados
    public Classrom(String studentName) {
        this.studentName = studentName;
    }

    public void showInfo() {
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
        Classrom.schoolName = schoolName;
    }
}
