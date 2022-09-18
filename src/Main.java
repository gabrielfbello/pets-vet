import br.com.unipar.petvet.model.*;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao PetShop!");
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        Animal animal = new Animal();

        animal.setNome(JOptionPane.showInputDialog("Insira um nome"));
        animal.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a Idade")));

        Object[] options = {"option1", "option2", "option3"};
        //...and passing `frame` instead of `null` as first parameter
        Object selectionObject = JOptionPane.showInputDialog(frame, "Choose", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        String selectionString = selectionObject.toString();
    }
}