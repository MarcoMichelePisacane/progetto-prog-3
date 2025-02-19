
public class Builder {
    int tot;
    String nome;
    String cosa;
    String citta;
    String frutta;


    public Builder() {
    }

    public Builder setTot(int tot) {
        this.tot = tot;
        return this;
    }

    public Builder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Builder setCosa(String cosa) {
        this.cosa = cosa;
        return this;
    }

    public Builder setCitta(String citta) {
        this.citta = citta;
        return this;
    }

    public Builder setFrutta(String frutta) {
        this.frutta = frutta;
        return this;
    }

    public Tabella build() {
        return new Tabella(this);
    }
}