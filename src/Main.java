import br.com.unipar.petvet.model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        List<BanhoTosa> banhosTosa = new ArrayList<>();
        List<Medicamento> medicamentos = new ArrayList<>();
        List<Exame> exames = new ArrayList<>();
        List<Proprietario> proprietarios = new ArrayList<>();
        List<Tosa> tosas = new ArrayList<>();
        List<Veterinario> veterinarios = new ArrayList<>();
        List<Vacina> vacinas = new ArrayList<>();
        List<Consulta> consultas = new ArrayList<>();

//        Amostragem de Proprietários
        proprietarios.add(new Proprietario(1, "João", "123.456.789-00", "Rua 1", "123456789", List.of(2, 7)));
        proprietarios.add(new Proprietario(2, "Maria", "987.654.321-00", "Rua 2", "987654321", List.of(1)));
        proprietarios.add(new Proprietario(3, "José", "123.987.456-00", "Rua 3", "123987456", List.of(3)));
        proprietarios.add(new Proprietario(4, "Ana", "456.789.123-00", "Rua 4", "456789123", List.of(4)));
        proprietarios.add(new Proprietario(5, "Pedro", "789.123.456-00", "Rua 5", "789123456", List.of(5)));
        proprietarios.add(new Proprietario(6, "Paulo", "321.654.987-00", "Rua 6", "321654987", List.of(6)));
        proprietarios.add(new Proprietario(7, "Carla", "654.321.987-00", "Rua 7", "654321987", List.of(8)));
        proprietarios.add(new Proprietario(8, "Marcos", "987.321.654-00", "Rua 8", "987321654", List.of(9)));
        proprietarios.add(new Proprietario(9, "Julia", "654.987.321-00", "Rua 9", "654987321", List.of(10)));

//      Amostragem de Animais
        animais.add(new Animal(1, "Rex", "Pastor Alemão", "Cachorro", "Macho", 2, 1));
        animais.add(new Animal(2, "Luna", "Vira-lata", "Cachorro", "Fêmea", 1, 2));
        animais.add(new Animal(3, "Miau", "Vira-lata", "Gato", "Fêmea", 1, 3));
        animais.add(new Animal(4, "Bolinha", "Ragdoll", "Gato", "Macho", 2, 4));
        animais.add(new Animal(5, "Pé de Pano", "Vira-lata", "Cachorro", "Macho", 1, 5));
        animais.add(new Animal(6, "Malvo", "Bulldog", "Cachorro", "Macho", 2, 6));
        animais.add(new Animal(7, "Pogger", "Pincher", "Cachorro", "Macho", 1, 1));
        animais.add(new Animal(8, "Zeca", "Poodle", "Cachorro", "Macho", 1, 7));
        animais.add(new Animal(9, "Espeto", "Pitbull", "Cachorro", "Macho", 1, 8));
        animais.add(new Animal(10, "Bobby", "Pitbull", "Cachorro", "Macho", 1, 9));

//      Amostragem de Veterinários
        veterinarios.add(new Veterinario(1, "João", "123.456.789-00", "Rua 1", "1234-5678", "1234", "12/12/2012", "13/08/22"));
        veterinarios.add(new Veterinario(2, "Maria", "987.654.321-00", "Rua das Flores", "8765-4321", "1234", "12/12/2012", "13/08/22"));
        veterinarios.add(new Veterinario(3, "José", "123.456.789-00", "Avenida Brasil", "1234-5678", "1234", "12/12/2012", "13/08/22"));
        veterinarios.add(new Veterinario(4, "Ana", "987.654.321-00", "Rua 2", "8765-4321", "1234", "12/12/2012", "13/08/22"));

//        Amostragem de Vacinas
        vacinas.add(new Vacina(1, "V8"));
        vacinas.add(new Vacina(2, "V10"));
        vacinas.add(new Vacina(3, "V12"));

//        Amostragem de Medicamentos
        medicamentos.add(new Medicamento(1, "Dipirona"));
        medicamentos.add(new Medicamento(2, "Dorflex"));
        medicamentos.add(new Medicamento(3, "Buscopan"));
        medicamentos.add(new Medicamento(4, "Rivotril"));
        medicamentos.add(new Medicamento(5, "Neosaldina"));

//        Amostragem de Exames
        exames.add(new Exame(1, "Raio-X"));
        exames.add(new Exame(2, "Ultrassom"));
        exames.add(new Exame(3, "Endoscopia"));
        exames.add(new Exame(4, "Eletrocardiograma"));
        exames.add(new Exame(5, "Eletroencefalograma"));

//        Amostragem de Consultas
        consultas.add(new Consulta(1, "12/08/2021", "12:00", "Exame de Rotina", 65.00, 1, 2, List.of(1, 2), List.of(3)));
        consultas.add(new Consulta(2, "12/08/2021", "13:00", "Pulgas e Carrapatos", 80.00, 2, 1, List.of(1), List.of(1, 2)));
        consultas.add(new Consulta(3, "12/08/2021", "14:00", "Exame de Rotina", 65.00, 3, 1, List.of(1, 2), List.of(3)));
        consultas.add(new Consulta(4, "12/08/2021", "15:00", "Castração", 150.00, 4, 1, List.of(1, 2), List.of(3)));
        consultas.add(new Consulta(5, "12/08/2021", "16:00", "Raiva", 100.00, 5, 1, List.of(3), List.of(1, 2)));

        String[] actionOptions = {"Consultar", "Cadastrar"};
        int actionOption = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "PetVet", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, actionOptions, actionOptions[0]);

        String[] classOptions = {"Animais", "Vacinas", "Exames", "Medicamentos", "Veterinários", "Proprietários", "Consultas"};
        int chosenClass = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, classOptions, classOptions[0]);

//        Menu para consulta ou cadastro

        if (actionOption == 0) {
            switch (chosenClass) {
                case 0:
                    int idAnimal = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do animal: "));
                    for (Animal animal : animais) {
                        if (animal.getId() == idAnimal) {
                            JOptionPane.showMessageDialog(null, "ID: " + animal.getId() +

                                    "\nNome: " + animal.getNome() +

                                    "\nRaça: " + animal.getRaca() +

                                    "\nEspécie: " + animal.getEspecie() +

                                    "\nSexo: " + animal.getSexo() +

                                    "\nIdade: " + animal.getIdade() +

                                    "\nProprietário: " + animal.getIdProprietario());
                        }
                    }
                    break;
                case 1:
                    int idVacina = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da vacina: "));
                    for (Vacina vacina : vacinas) {
                        if (vacina.getId() == idVacina) {
                            JOptionPane.showMessageDialog(null, "ID: " + vacina.getId() +

                                    "\nNome: " + vacina.getNome());
                        }
                    }
                    break;
                case 2:
                    int idExame = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do exame: "));
                    for (Exame exame : exames) {
                        if (exame.getId() == idExame) {
                            JOptionPane.showMessageDialog(null, "ID: " + exame.getId() +

                                    "\nNome: " + exame.getNome());
                        }
                    }
                    break;
                case 3:
                    int idMedicamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do medicamento: "));
                    for (Medicamento medicamento : medicamentos) {
                        if (medicamento.getId() == idMedicamento) {
                            JOptionPane.showMessageDialog(null, "ID: " + medicamento.getId() +

                                    "\nNome: " + medicamento.getNome());
                        }
                    }
                    break;
                case 4:
                    int idVeterinario = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do veterinário: "));
                    for (Veterinario veterinario : veterinarios) {
                        if (veterinario.getId() == idVeterinario) {
                            JOptionPane.showMessageDialog(null, "ID: " + veterinario.getId() +

                                    "\nNome: " + veterinario.getNome() +

                                    "\nEndereço: " + veterinario.getEndereco() +

                                    "\nTelefone: " + veterinario.getTelefone() +

                                    "\nCRMV: " + veterinario.getCrmv() +

                                    "\nData de Cadastro: " + veterinario.getDataCadastro());
                        }
                    }
                    break;
                case 5:
                    int idProprietario = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do proprietário: "));
                    for (Proprietario proprietario : proprietarios) {
                        if (proprietario.getId() == idProprietario) {
                            JOptionPane.showMessageDialog(null, "ID: " + proprietario.getId() +

                                    "\nNome: " + proprietario.getNome() +

                                    "\nEndereço: " + proprietario.getEndereco() +

                                    "\nTelefone: " + proprietario.getTelefone());
                        }
                    }
                    break;
            }
        }


    }
}