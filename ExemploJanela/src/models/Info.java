package models;

public class Info {
    private String escolaridade;
    private String lingua;
    private int nivel;

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Info{" + "escolaridade=" + escolaridade + ", lingua=" + lingua + ", nivel=" + nivel + '}';
    }
    
    
    
}
