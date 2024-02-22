/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.pkg1;


import javax.swing.JOptionPane;

public class Quiz1 {

    public static void main(String[] args) {
        
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");

        
        String cursosInput = JOptionPane.showInputDialog("Ingrese la cantidad de cursos a incluir:");
        int cantidadCursos = Integer.parseInt(cursosInput);

        double montoTotalSinHacienda = 0;
        double montoTotalConHacienda = 0;

        for (int i = 1; i <= cantidadCursos; i++) {

            String nombreCurso = JOptionPane.showInputDialog("Ingrese el nombre del curso " + i + ":");

            String montoCursoInput = JOptionPane.showInputDialog("Ingrese el monto pagado por el curso " + nombreCurso + ":");
            double montoCurso = Double.parseDouble(montoCursoInput);

            montoTotalSinHacienda += montoCurso;

            double montoHacienda = montoCurso * 0.02;

            double montoTotalCurso = montoCurso + montoHacienda;
            
            montoTotalConHacienda += montoTotalCurso;
            
            JOptionPane.showMessageDialog(null, nombreCliente + " debe de pagar el monto de " + String.format("%.2f", montoTotalCurso) + " para el curso " + nombreCurso);
        }
        JOptionPane.showMessageDialog(null, nombreCliente + ", el monto total de los cursos (sin considerar la hacienda) es: " + String.format("%.2f", montoTotalSinHacienda));

        JOptionPane.showMessageDialog(null, nombreCliente + ", el monto total de los cursos contando hacienda es: " + String.format("%.2f", montoTotalConHacienda));
        //El format me ayuda a ordenar la información anteriormente guardada, el 2f("2f" es para limitar los decimales del float )
    }
}
