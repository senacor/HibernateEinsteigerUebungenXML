package com.senacor.schulung.hibernate.domain;

import java.util.Date;

public class KreditkarteConcreteClass extends ZahlungsartConcreteClass {
    private String nummer;

    private Date gueltigBis;

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public Date getGueltigBis() {
        return gueltigBis;
    }

    public void setGueltigBis(Date gueltigBis) {
        this.gueltigBis = gueltigBis;
    }
}