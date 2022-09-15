// Crie um sistema para petshop de acordo com os  requisitos: Poder ter acesso às informações sobre todos o animais que são tratados na clínica, Poder ter acesso às informações sobre todos o proprietários que visitam a clínica, Manter os dados dos profissionais médicos veterinários que atendem na clinica e realizam as consultas, Saber quais animais estão sendo consultados e quais são as medicações que cada um recebe e valor total a ser cobrado do proprietário considerando os medicamentos, exames e o valor da consulta, Controlar se os animais estão corretamente vacinados e controlar a data de segunda dose. Controlar tosa/banho Controlar os banhos e tosas que cada animal teve e se há algum banho/tosa marcado, Manter Vacinas Poder ter acesso as informações e dados das vacinas fornecidas pela clinica, Manter medicamentos Poder ter acesso as informações e dados dos medicamentos utilizados durante as consultas, Manter exames Poder ter acesso as informações e dados dos exames prestados pela clinica durante as consultas.

import Animal.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao PetShop!");

        // Criação de um objeto do tipo Animal
        Animal animal = new Animal();

        // Criação de um objeto do tipo Proprietario
        Proprietario proprietario = new Proprietario();

        // Criação de um objeto do tipo Veterinario
        Veterinario veterinario = new Veterinario();

        // Criação de um objeto do tipo Consulta
        Consulta consulta = new Consulta();

        // Criação de um objeto do tipo Vacina
        Vacina vacina = new Vacina();

        // Criação de um objeto do tipo Medicamento
        Medicamento medicamento = new Medicamento();

        // Criação de um objeto do tipo Exame
        Exame exame = new Exame();

        // Criação de um objeto do tipo Tosador
        Tosador tosador = new Tosador();

        // Criação de um objeto do tipo Banho
        Banho banho = new Banho();

        // Criação de um objeto do tipo Tosa
        Tosa tosa = new Tosa();

        // Criação de um objeto do tipo BanhoTosa
        BanhoTosa banhoTosa = new BanhoTosa();
    }
}