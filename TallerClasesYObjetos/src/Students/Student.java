package Students;
/**
 * Representa un sistema de impresión de notas e información de estudiantes.
 * @author Michael Florez Rico
 */
public class Student{

    //1.Variables nativas de la clase
    private String  name; //Variable nombre del estudiante.
    private String lastName1; //Variable primer apellido del estudiante.
    private String lastName2; //Variable segundo apellido del estudiante.
    private int idStudent; //Variable identificación del estudiante.
    private static int countStudents; //Contador de estudiantes.
    private String subjectName; //Variable nombre de asignatura.
    private int idSubject; //Variable identificación de asignatura.
    private float finalGrade; //Variable de nota final


    //2.Constructores

    /**
     * Constuctor sobrecargado, para proteger las variables nativas de la clase.
     * @param name //Variable nombre del estudiante.
     * @param lastName1 //Variable primer apellido del estudiante.
     * @param lastName2 //Variable segundo apellido del estudiante.
     * @param subjectName //Variable nombre de asignatura.
     * @param finalGrade //Variable de nota final
     * @param idSubject //Variable identificación de asignatura.
     */
    public Student(String name, String lastName1, String lastName2,String subjectName,float finalGrade, int idSubject){
        this.idSubject = idSubject;
        this.subjectName =subjectName;
        this.finalGrade = finalGrade;
        this.idStudent = 1000 + ++countStudents;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
    }

    /**
     * Método para definir si el alumno gano o no la asignatura.
     * @param finalGrade
     */
    public void isApproved(float finalGrade){
        if (finalGrade >= 3 && finalGrade<=5){
            System.out.println("The student has approved the subject.");
        }else if (finalGrade >= 0 && finalGrade<3){
            System.out.println("The student has reproved the subject.");
        }else{
            System.out.println("The final grade is out of the estandar limit (0.0-5.0). Please check.");
        }
    }

    /**
     * Método get para obtener el nombre del estudiante.
     * @return nombre del estudiante.
     */
    public String getName() {
        return name;
    }

    /**
     * Método sett para asignar el nombre del estudiante.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método get para obtener el primer apellido del estudiante.
     * @return primer apellido del estudiante.
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Método set para asignar el primer apellido del estudiante.
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Método get para obtener el segundo apellido del estudiante.
     * @return segundo apellido del estudiante.
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Método set para asignar el segundo apellido del estudiante.
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Método get para obtener el identificador del estudiante.
     * @return identificador del estudiante.
     */
    public int getIdStudent() {
        return idStudent;
    }

    /**
     * Método get para obtener la nota final del estudiante.
     * @return nota final del estudiante.
     */
    public float getFinalGrade() {
        return finalGrade;
    }

    /**
     * Método set para asignar la nota final del estudiante.
     * @param finalGrade
     */
    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }

    /**
     * Método toString
     * @return resumen de datos del estudiante.
     */
    @Override
    public String toString() {
        return
                "Student's name= " + name + ' ' +
                lastName1 + ' ' + lastName2 +
                "\nStudent's ID= " + idStudent +
                "\nSubject Name= " + subjectName +
                "\nSubject ID= " + idSubject +
                "\nFinal Grade= " + finalGrade;
    }
}
