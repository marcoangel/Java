
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Main extends JFrame{

    private List<String> listaAlumnos;

    public Main() {
        listaAlumnos = new ArrayList<>();

        // Configuración de la interfaz gráfica
        setTitle("Registro de Alumnos");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Nombre del Alumno:");
        JTextField textField = new JTextField(20);
        JButton addButton = new JButton("Agregar Alumno");
        JTextArea resultArea = new JTextArea(8, 20);

        // Acción del botón
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreAlumno = textField.getText();
                if (!nombreAlumno.isEmpty()) {
                    listaAlumnos.add(nombreAlumno);
                    actualizarLista(resultArea);
                    textField.setText("");
                }
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(addButton);
        panel.add(resultArea);

        add(panel);
        setVisible(true);
    }

    private void actualizarLista(JTextArea resultArea) {
        resultArea.setText("");
        for (String alumno : listaAlumnos) {
            resultArea.append(alumno + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}