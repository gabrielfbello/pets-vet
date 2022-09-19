package br.com.unipar.petvet.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Banho {
    private int banhoId;
    private String banhoData;
    private String banhoHora;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Banho(int banhoId, String banhoData, String banhoHora) {
        this.banhoId = count.incrementAndGet();
        this.banhoData = banhoData;
        this.banhoHora = banhoHora;
    }

    public int getBanhoId() {
        return banhoId;
    }

    public void setBanhoId(int banhoId) {
        this.banhoId = banhoId;
    }

    public String getBanhoData() {
        return banhoData;
    }

    public void setBanhoData(String banhoData) {
        this.banhoData = banhoData;
    }

    public String getBanhoHora() {
        return banhoHora;
    }

    public void setBanhoHora(String banhoHora) {
        this.banhoHora = banhoHora;
    }

    @Override
    public String toString() {
    return "banhoId: " + banhoId + "\n" +
                "banhoData: " + banhoData + "\n" +
                "banhoHora: " + banhoHora + "\n";
    }
}