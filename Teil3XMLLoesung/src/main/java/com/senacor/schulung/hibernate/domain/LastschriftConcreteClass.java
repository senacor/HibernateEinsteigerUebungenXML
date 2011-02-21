package com.senacor.schulung.hibernate.domain;

public class LastschriftConcreteClass extends ZahlungsartConcreteClass {
    private String kontoNummer;

    private String blz;

    private String bank;

    public String getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(String kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public String getBlz() {
        return blz;
    }

    public void setBlz(String blz) {
        this.blz = blz;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
