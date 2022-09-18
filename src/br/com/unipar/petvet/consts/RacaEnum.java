package br.com.unipar.petvet.consts;

public enum RacaEnum {
    LABRADORRETRIEVER("Labrador Retriever"),
    POODLE("Poodle"),
    HUSKYSIBERIANO("Husky Siberiano"),
    FILABRASILEIRA("Fila Brasileira"),
    BEAGLE("Beagle"),
    SHIBAINU("Shiba Inu");

    public String racaNome;

    RacaEnum (String racaNome) {
        this.racaNome = racaNome;
    }

    public String getRacaNome() {
        return racaNome;
    }
}

