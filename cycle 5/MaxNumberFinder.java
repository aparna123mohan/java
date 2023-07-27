import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaxNumberFinder extends Frame {
    private TextField num1Field, num2Field, num3Field;
    private Label resultLabel;

    public MaxNumberFinder() {
        setTitle("Max Number Finder");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Label num1Label = new Label("Number 1: ");
        num1Field = new TextField(10);
        add(num1Label);
        add(num1Field);

        Label num2Label = new Label("Number 2: ");
        num2Field = new TextField(10);
        add(num2Label);
        add(num2Field);

        Label num3Label = new Label("Number 3: ");
        num3Field = new TextField(10);
        add(num3Label);
        add(num3Field);

        Button findButton = new Button("Find Max");
        add(findButton);

        resultLabel = new Label("");
        add(resultLabel);

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int num3 = Integer.parseInt(num3Field.getText());

                int max = Math.max(num1, Math.max(num2, num3));

                resultLabel.setText("Max Number: " + max);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MaxNumberFinder();
    }
}

