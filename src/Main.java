import br.com.unipar.petvet.consts.RacaEnum;
import br.com.unipar.petvet.model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Crie um array para cada classe de modelo
        List<Animal> animais = new ArrayList<>();

        String[] actionOptions = {"Consultar", "Cadastrar"};
        int actionOption = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "PetVet", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, actionOptions, actionOptions[0]);

        String[] classOptions = {"Animais", "Vacinas", "Exames", "Medicamentos", "Tosadores", "Clientes"};
        int chosenClass = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, classOptions, classOptions[0]);

        if (actionOption == 1) {
            switch (chosenClass) {
                case 0:
                    Animal animal = new Animal();
                    animal.setNome(JOptionPane.showInputDialog("Nome do animal: "));
                    animal.setRaca(JOptionPane.showInputDialog("Raça do animal: "));
                    animal.setEspecie(JOptionPane.showInputDialog("Espécie do animal: "));
                    animal.setSexo(JOptionPane.showInputDialog("Sexo do animal: "));
                    animal.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do animal: ")));
                    JOptionPane.showMessageDialog(null, animal.toString());
                 animais.add(animal);
                    break;
//                case 1:
//                    Vacina vacina = new Vacina();
//                    vacina.setNome(JOptionPane.showInputDialog("Nome da vacina: "));
//                    vacina.setDescricao(JOptionPane.showInputDialog("Descrição da vacina: "));
//                    vacina.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço da vacina: ")));
//                    JOptionPane.showMessageDialog(null, vacina.toString());
//                    break;
//                case 2:
//                    Exame exame = new Exame();
//                    exame.setNome(JOptionPane.showInputDialog("Nome do exame: "));
//                    exame.setDescricao(JOptionPane.showInputDialog("Descrição do exame: "));
//                    exame.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço do exame: ")));
//                    JOptionPane.showMessageDialog(null, exame.toString());
//                    break;
//                case 3:
//                    Medicamento medicamento = new Medicamento();
//                    medicamento.setNome(JOptionPane.showInputDialog("Nome do medicamento: "));
//                    medicamento.setDescricao(JOptionPane.showInputDialog("Descrição do medicamento: "));
//                    medicamento.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço do medicamento: ")));
//                    JOptionPane.showMessageDialog(null, medicamento.toString());
//                    break;
//                case 4:
//                    Tosador tosador = new Tosador();
//                    tosador.setNome(JOptionPane.showInputDialog("Nome do tosador: "));
//                    tosador.setCpf(JOptionPane.showInputDialog("CPF do tosador: "));
//                    tosador.setTelefone(JOptionPane.showInputDialog("Telefone do tosador: "));
//                    tosador.setEndereco(JOptionPane.showInputDialog("Endereço do tosador: "));
//                    tosador.setCidade(JOptionPane.showInputDialog("Cidade do tosador: "));
//                    tosador.setEstado(JOptionPane.showInputDialog("Estado do tosador: "));
//                    tosador.setCep(JOptionPane.showInputDialog("CEP do tosador: "));
//                    JOptionPane.showMessageDialog(null, tosador.toString());
//                    break;
//                case 5:
//                    Cliente cliente = new Cliente();
//                    cliente.setNome(JOptionPane.showInputDialog("Nome do cliente: "));
//                    cliente.setCpf(JOptionPane.showInputDialog("CPF do cliente: "));
//                    cliente.setTelefone(JOptionPane.showInputDialog("Telefone do cliente: "));
//                    cliente.setEndereco(JOptionPane.showInputDialog("Endereço do cliente: "));
//                    cliente.setCidade(JOptionPane.showInputDialog("Cidade do cliente: "));
//                    cliente.setEstado(JOptionPane.showInputDialog("Estado do cliente: "));
//                    cliente.setCep(JOptionPane.showInputDialog("CEP do cliente: "));
//                    JOptionPane.showMessageDialog(null, cliente.toString());
//                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }
}