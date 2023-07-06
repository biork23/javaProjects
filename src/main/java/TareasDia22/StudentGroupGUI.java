package TareasDia22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class StudentGroupGUI extends JFrame {
    private JTextField nameTextField;
    private JTextField gradeTextField;
    private JTextArea groupATextArea;
    private JTextArea groupBTextArea;
    private JTextArea groupCTextArea;
    private JButton addButton;

    private List<String> groupA;
    private List<String> groupB;
    private List<String> groupC;

    public StudentGroupGUI() {
        super("Student Grouping");

        groupA = new ArrayList<>();
        groupB = new ArrayList<>();
        groupC = new ArrayList<>();

      
        nameTextField = new JTextField(20);
        gradeTextField = new JTextField(5);
        groupATextArea = new JTextArea(10, 20);
        groupBTextArea = new JTextArea(10, 20);
        groupCTextArea = new JTextArea(10, 20);
        addButton = new JButton("Add Student");

        
        setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Name: "));
        inputPanel.add(nameTextField);
        inputPanel.add(new JLabel("Grade: "));
        inputPanel.add(gradeTextField);

        JPanel groupPanel = new JPanel(new GridLayout(1, 3));
        groupPanel.add(new JScrollPane(groupATextArea));
        groupPanel.add(new JScrollPane(groupBTextArea));
        groupPanel.add(new JScrollPane(groupCTextArea));

        
        add(inputPanel, BorderLayout.NORTH);
        add(groupPanel, BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);

        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addStudent() {
        String name = nameTextField.getText();
        int grade = Integer.parseInt(gradeTextField.getText());

        if (grade > 90) {
            groupA.add(name);
        } else if (grade > 85) {
            groupB.add(name);
        } else {
            groupC.add(name);
        }

        updateGroupTextAreas();

       
        nameTextField.setText("");
        gradeTextField.setText("");
    }

    private void updateGroupTextAreas() {
        groupATextArea.setText(getGroupText(groupA));
        groupBTextArea.setText(getGroupText(groupB));
        groupCTextArea.setText(getGroupText(groupC));
    }

    private String getGroupText(List<String> group) {
        StringBuilder sb = new StringBuilder();
        for (String student : group) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentGroupGUI();
            }
        });
    }
}

