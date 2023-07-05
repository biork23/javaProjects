package TareasDia21;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NoteApp extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultListModel<String> noteListModel;
    private JList<String> noteList;
    private JTextArea noteTextArea;
    private JButton newNoteButton;
    private JButton saveNoteButton;
    private JButton deleteNoteButton;

    public NoteApp() {
        super("Aplicación de Notas");

        // Crear el modelo de la lista de notas
        noteListModel = new DefaultListModel<>();

        // Crear la lista de notas
        noteList = new JList<>(noteListModel);
        noteList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        noteList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    loadSelectedNote();
                }
            }
        });

        // Crear el área de texto para la nota
        noteTextArea = new JTextArea(10, 30);
        noteTextArea.setLineWrap(true);

        // Crear el botón para crear una nueva nota
        newNoteButton = new JButton("Nueva Nota");
        newNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                noteList.clearSelection();
                noteTextArea.setText("");
            }
        });

        // Crear el botón para guardar la nota actual
        saveNoteButton = new JButton("Guardar Nota");
        saveNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveNote();
            }
        });

        // Crear el botón para eliminar la nota actual
        deleteNoteButton = new JButton("Eliminar Nota");
        deleteNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteNote();
            }
        });

        // Configurar el diseño del contenido principal
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel noteListPanel = new JPanel(new BorderLayout());
        noteListPanel.setPreferredSize(new Dimension(150, 0));
        noteListPanel.add(new JScrollPane(noteList), BorderLayout.CENTER);

        JPanel notePanel = new JPanel(new BorderLayout());
        notePanel.add(new JScrollPane(noteTextArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(newNoteButton);
        buttonPanel.add(saveNoteButton);
        buttonPanel.add(deleteNoteButton);

        contentPane.add(noteListPanel, BorderLayout.WEST);
        contentPane.add(notePanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        loadNotes();
    }

    private void loadNotes() {
        File notesDirectory = new File("notas");
        if (!notesDirectory.exists()) {
            notesDirectory.mkdir();
        }

        File[] noteFiles = notesDirectory.listFiles();
        if (noteFiles != null) {
            for (File file : noteFiles) {
                if (file.isFile()) {
                    noteListModel.addElement(file.getName());
                }
            }
        }
    }

    private void loadSelectedNote() {
        String selectedNote = noteList.getSelectedValue();
        if (selectedNote != null) {
            try {
                File noteFile = new File("notas/" + selectedNote);
                FileReader fileReader = new FileReader(noteFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                StringBuilder content = new StringBuilder();
                while ((line = bufferedReader.readLine()) != null) {
                    content.append(line);
                    content.append("\n");
                }

                bufferedReader.close();
                noteTextArea.setText(content.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveNote() {
        String selectedNote = noteList.getSelectedValue();
        String noteContent = noteTextArea.getText();

        if (selectedNote != null && !noteContent.isEmpty()) {
            try {
                File noteFile = new File("notas/" + selectedNote);
                FileWriter fileWriter = new FileWriter(noteFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write(noteContent);

                bufferedWriter.close();
                JOptionPane.showMessageDialog(this, "Nota guardada exitosamente.", "Guardar Nota",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void deleteNote() {
        String selectedNote = noteList.getSelectedValue();

        if (selectedNote != null) {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar la nota?", "Eliminar Nota",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                File noteFile = new File("notas/" + selectedNote);
                if (noteFile.delete()) {
                    noteListModel.removeElement(selectedNote);
                    noteTextArea.setText("");
                    JOptionPane.showMessageDialog(this, "Nota eliminada exitosamente.", "Eliminar Nota",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar la nota.", "Eliminar Nota",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NoteApp();
            }
        });
    }
}
