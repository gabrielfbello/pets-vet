package br.com.unipar.petvet.consts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum RacaEnum {
    LABRADORRETRIEVER("Labrador Retriever"),
    POODLE("Poodle"),
    HUSKYSIBERIANO("Husky Siberiano"),
    FILABRASILEIRA("Fila Brasileira"),
    BEAGLE("Beagle"),
    SHIBAINU("Shiba Inu");

    private static final List<String> nomeRacaLista;

    private final String nomeRaca;

    static {
        nomeRacaLista = new ArrayList<>();
        for (RacaEnum racaEnum : RacaEnum.values()) {
            nomeRacaLista.add(racaEnum.nomeRaca);
        }
    }

    RacaEnum (String nomeRaca) {
        this.nomeRaca = nomeRaca;
    }

    public String getNomeRaca() {
        return nomeRaca;
    }

    public static List<String> getNomeRacaLista() {
        return Collections.unmodifiableList(nomeRacaLista);
    }
}

