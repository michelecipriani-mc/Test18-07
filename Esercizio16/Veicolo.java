package Esercizio16;

// Classe base Veicolo
class Veicolo {
    //attributi privati
    private String marca;
    private int anno;
    //costruttore
    public Veicolo(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }

    // Getter e Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    // Metodo stampa dettagli
    public String dettagli() {
        return "Veicolo - Marca: " + marca + ", Anno: " + anno;
    }
}

// Sottoclasse Auto
class Auto extends Veicolo {
    //attributo specifico
    private int numeroPorte;
    //costruttore
    public Auto(String marca, int anno, int numeroPorte) {
        super(marca, anno);
        this.numeroPorte = numeroPorte;
    }
    //getter e setter
    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    @Override //sovrascrivo il metodo di stampa dettaglio
    public String dettagli() {
        return "Auto - Marca: " + getMarca() + ", Anno: " + getAnno() + ", Porte: " + numeroPorte;
    }
}

// Sottoclasse Moto
class Moto extends Veicolo {
    //attributo specifico
    private boolean haCarenatura;
    //costruttore
    public Moto(String marca, int anno, boolean haCarenatura) {
        super(marca, anno);
        this.haCarenatura = haCarenatura;
    }
    
    public boolean isHaCarenatura() {
        return haCarenatura;
    }
    //setter
    public void setHaCarenatura(boolean haCarenatura) {
        this.haCarenatura = haCarenatura;
    }

    @Override
    public String dettagli() {
        return "Moto - Marca: " + getMarca() + ", Anno: " + getAnno() + ", Carenatura: " + (haCarenatura ? "Sì" : "No");
    }
}
