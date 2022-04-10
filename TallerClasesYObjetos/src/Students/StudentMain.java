package Students;
/**
 * clase que ejecuta sistema de impresión de notas e información de estudiantes.
 * @author Michael Florez Rico
 */
public class StudentMain {
    public static void main(String[] args) {
        //Creación de objeto estudiante 1.
        Student student1 = new Student("Juan","Mendoza", "Pinzon","Maths",4.8F,2015);
        //Impresión de información del estudiante.
        System.out.println("Information for student 1: ");
        System.out.println(student1);
        student1.isApproved(student1.getFinalGrade());//Evaluacion de método de aprobación de asignatura para estudiante 2.
        System.out.println();

        //Creación de objeto estudiante 2.
        Student student2 = new Student("Laura","Perez", "Lopez","Science",2.8F,2030);
        //Impresión de información del estudiante.
        System.out.println("Information for student 2: ");
        System.out.println(student2);
        student1.isApproved(student2.getFinalGrade());//Evaluacion de método de aprobación de asignatura para estudiante 2.
        System.out.println();


    }
}
