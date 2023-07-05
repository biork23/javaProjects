package TareasDia21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaTareas extends JFrame {
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskTextField;

    public ListaTareas() {
        super("Lista de tareas");

        // Crear el modelo de la lista de tareas
        taskListModel = new DefaultListModel<>();

        // Crear la lista de tareas
        taskList = new JList<>(taskListModel);

        // Crear el campo de texto para ingresar tareas
        taskTextField = new JTextField(20);

        // Crear el botón para agregar tareas
        JButton addButton = new JButton("Agregar");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskTextField.getText().trim();
                if (!task.isEmpty()) {
                    taskListModel.addElement(task);
                    taskTextField.setText("");
                }
            }
        });

        // Crear el botón para marcar una tarea como completada
        JButton completeButton = new JButton("Completar");
        completeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskListModel.remove(selectedIndex);
                }
            }
        });

        // Configurar el diseño del contenido principal
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.add(new JScrollPane(taskList), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(taskTextField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);
        contentPane.add(inputPanel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(completeButton);
        contentPane.add(buttonPanel, BorderLayout.NORTH);

        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListaTareas();
            }
        });
    }
}
