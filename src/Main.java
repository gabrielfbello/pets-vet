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
        proprietarios.add(new Proprietario( "João", "123.456.789-00", "Rua 1", "123456789", List.of(2, 7)));
        proprietarios.add(new Proprietario( "Maria", "987.654.321-00", "Rua 2", "987654321", List.of(1)));
        proprietarios.add(new Proprietario( "José", "123.987.456-00", "Rua 3", "123987456", List.of(3)));
        proprietarios.add(new Proprietario( "Ana", "456.789.123-00", "Rua 4", "456789123", List.of(4)));
        proprietarios.add(new Proprietario( "Pedro", "789.123.456-00", "Rua 5", "789123456", List.of(5)));
        proprietarios.add(new Proprietario( "Paulo", "321.654.987-00", "Rua 6", "321654987", List.of(6)));
        proprietarios.add(new Proprietario( "Carla", "654.321.987-00", "Rua 7", "654321987", List.of(8)));
        proprietarios.add(new Proprietario( "Marcos", "987.321.654-00", "Rua 8", "987321654", List.of(9)));
        proprietarios.add(new Proprietario( "Julia", "654.987.321-00", "Rua 9", "654987321", List.of(10)));

//      Amostragem de Animais
        animais.add(new Animal("Rex", "Pastor Alemão", "Cachorro", "Macho", 2, 1));
        animais.add(new Animal("Luna", "Vira-lata", "Cachorro", "Fêmea", 1, 2));
        animais.add(new Animal("Miau", "Vira-lata", "Gato", "Fêmea", 1, 3));
        animais.add(new Animal("Bolinha", "Ragdoll", "Gato", "Macho", 2, 4));
        animais.add(new Animal("Pé de Pano", "Vira-lata", "Cachorro", "Macho", 1, 5));
        animais.add(new Animal("Malvo", "Bulldog", "Cachorro", "Macho", 2, 6));
        animais.add(new Animal("Pogger", "Pincher", "Cachorro", "Macho", 1, 1));
        animais.add(new Animal("Zeca", "Poodle", "Cachorro", "Macho", 1, 7));
        animais.add(new Animal("Espeto", "Pitbull", "Cachorro", "Macho", 1, 8));
        animais.add(new Animal("Bobby", "Pitbull", "Cachorro", "Macho", 1, 9));

//      Amostragem de Veterinários
        veterinarios.add(new Veterinario( "João", "123.456.789-00", "Rua 1", "1234-5678", "12/12/2012"));
        veterinarios.add(new Veterinario( "Maria", "987.654.321-00", "Rua das Flores", "8765-4321", "12/12/2012"));
        veterinarios.add(new Veterinario( "José", "123.456.789-00", "Avenida Brasil", "1234-5678", "12/12/2012"));
        veterinarios.add(new Veterinario( "Ana", "987.654.321-00", "Rua 2", "8765-4321", "12/12/2012"));

//        Amostragem de Vacinas
        vacinas.add(new Vacina( "V8"));
        vacinas.add(new Vacina( "V10"));
        vacinas.add(new Vacina( "V12"));

//        Amostragem de Medicamentos
        medicamentos.add(new Medicamento( "Dipirona"));
        medicamentos.add(new Medicamento( "Dorflex"));
        medicamentos.add(new Medicamento( "Buscopan"));
        medicamentos.add(new Medicamento( "Rivotril"));
        medicamentos.add(new Medicamento( "Neosaldina"));

//        Amostragem de Exames
        exames.add(new Exame("Raio-X"));
        exames.add(new Exame("Ultrassom"));
        exames.add(new Exame("Endoscopia"));
        exames.add(new Exame( "Eletrocardiograma"));
        exames.add(new Exame("Eletroencefalograma"));

//        Amostragem de Consultas
        consultas.add(new Consulta("12/08/2021", "12:00", "Exame de Rotina", 65.00, 1, 2, List.of(1, 2), List.of(3)));
        consultas.add(new Consulta("12/08/2021", "13:00", "Pulgas e Carrapatos", 80.00, 2, 1, List.of(1), List.of(1, 2)));
        consultas.add(new Consulta("12/08/2021", "14:00", "Exame de Rotina", 65.00, 3, 1, List.of(1, 2), List.of(3)));
        consultas.add(new Consulta("12/08/2021", "15:00", "Castração", 150.00, 4, 1, List.of(1, 2), List.of(3)));
        consultas.add(new Consulta("12/08/2021", "16:00", "Raiva", 100.00, 5, 1, List.of(3), List.of(1, 2)));

        String[] actionOptions = {"Consultar", "Cadastrar", "Listar", "Sair"};
        int actionOption = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "PetVet", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, actionOptions, actionOptions[0]);

        String[] classOptions = {"Animais", "Vacinas", "Exames", "Medicamentos", "Veterinários", "Proprietários", "Consultas", "Voltar"};
        int chosenClass = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, classOptions, classOptions[0]);

        do {
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
                    case 6:
                        int idConsulta = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da consulta: "));
                        for (Consulta consulta : consultas) {
                            if (consulta.getId() == idConsulta) {
                                JOptionPane.showMessageDialog(null, "ID: " + consulta.getId() +

                                        "\nData: " + consulta.getData() +

                                        "\nMotivo: " + consulta.getMotivo() +

                                        "\nValor: " + consulta.getValor() +

                                        "\nVeterinário: " + consulta.getIdVeterinario() +

                                        "\nAnimal: " + consulta.getIdAnimal() +

                                        "\nExames: " + consulta.getIdExames());
                            }
                        }
                        break;
                }

                actionOption = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "PetVet", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, actionOptions, actionOptions[0]);
                chosenClass = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, classOptions, classOptions[0]);
            } else if (actionOption == 1) {
                switch (chosenClass) {
                    case 0:
                        String nomeAnimal = JOptionPane.showInputDialog("Digite o nome do animal: ");
                        String racaAnimal = JOptionPane.showInputDialog("Digite a raça do animal: ");
                        String especieAnimal = JOptionPane.showInputDialog("Digite a espécie do animal: ");
                        String sexoAnimal = JOptionPane.showInputDialog("Digite o sexo do animal: ");
                        int idadeAnimal = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal: "));
                        int idProprietarioAnimal = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do proprietário do animal: "));
                        animais.add(new Animal(nomeAnimal, racaAnimal, especieAnimal, sexoAnimal, idadeAnimal, idProprietarioAnimal));
                        break;
                    case 1:
                        String nomeVacina = JOptionPane.showInputDialog("Digite o nome da vacina: ");
                        vacinas.add(new Vacina(nomeVacina));
                        break;
                    case 2:
                        String nomeExame = JOptionPane.showInputDialog("Digite o nome do exame: ");
                        exames.add(new Exame(nomeExame));
                        break;
                    case 3:
                        String nomeMedicamento = JOptionPane.showInputDialog("Digite o nome do medicamento: ");
                        medicamentos.add(new Medicamento(nomeMedicamento));
                        break;
                    case 4:
                        String nomeVeterinario = JOptionPane.showInputDialog("Digite o nome do veterinário: ");
                        String enderecoVeterinario = JOptionPane.showInputDialog("Digite o endereço do veterinário: ");
                        String telefoneVeterinario = JOptionPane.showInputDialog("Digite o telefone do veterinário: ");
                        String crmvVeterinario = JOptionPane.showInputDialog("Digite o CRMV do veterinário: ");
                        String dataCadastroVeterinario = JOptionPane.showInputDialog("Digite a data de cadastro do veterinário: ");
                        veterinarios.add(new Veterinario(nomeVeterinario, crmvVeterinario, enderecoVeterinario, telefoneVeterinario, dataCadastroVeterinario));
                        break;
                    case 5:
                        String nomeProprietario = JOptionPane.showInputDialog("Digite o nome do proprietário: ");
                        String enderecoProprietario = JOptionPane.showInputDialog("Digite o endereço do proprietário: ");
                        String telefoneProprietario = JOptionPane.showInputDialog("Digite o telefone do proprietário: ");
                        String cpfProprietario = JOptionPane.showInputDialog("Digite o CPF do proprietário: ");
                        String animaisProprietario = JOptionPane.showInputDialog("Digite os IDs dos animais do proprietário (Ex: 1,2,3): ");

                        List<Integer> animaisProprietarioList = new ArrayList<>();
                        for (String animal : animaisProprietario.split(",")) {
                            animaisProprietarioList.add(Integer.parseInt(animal));
                        }

                        proprietarios.add(new Proprietario(nomeProprietario, cpfProprietario, enderecoProprietario, telefoneProprietario, animaisProprietarioList));
                        break;
                }

                actionOption = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "PetVet", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, actionOptions, actionOptions[0]);
                if(actionOption != 3) {
                    chosenClass = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, classOptions, classOptions[0]);
                }
            } else if (actionOption == 2) {
                switch (chosenClass) {
                    case 0:
                        String animalsList = "";
                        for (Animal animal : animais) {
                            animalsList += animal.getId() + " - " + animal.getNome() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, animalsList);
                        break;
                    case 1:
                        String vacinasList = "";
                        for (Vacina vacina : vacinas) {
                            vacinasList += vacina.getId() + " - " + vacina.getNome() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, vacinasList);
                        break;
                    case 2:
                        String examesList = "";
                        for (Exame exame : exames) {
                            examesList += exame.getId() + " - " + exame.getNome() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, examesList);
                        break;
                    case 3:
                        String medicamentosList = "";
                        for (Medicamento medicamento : medicamentos) {
                            medicamentosList += medicamento.getId() + " - " + medicamento.getNome() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, medicamentosList);
                        break;
                    case 4:
                        String veterinariosList = "";
                        for (Veterinario veterinario : veterinarios) {
                            veterinariosList += veterinario.getId() + " - " + veterinario.getNome() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, veterinariosList);
                        break;
                    case 5:
                        String proprietariosList = "";
                        for (Proprietario proprietario : proprietarios) {
                            proprietariosList += proprietario.getId() + " - " + proprietario.getNome() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, proprietariosList);
                        break;
                        case 6:
                        String consultasList = "";
                        for (Consulta consulta : consultas) {
                            consultasList += consulta.getId() + " - " + consulta.getData() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, consultasList);
                }

                actionOption = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "PetVet", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, actionOptions, actionOptions[0]);
                if(actionOption != 3) {
                    chosenClass = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, classOptions, classOptions[0]);
                }
            }
        } while (actionOption != 3);
    }
}