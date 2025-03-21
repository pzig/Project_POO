package br.senac.sp.enumeration;

public enum Escolaridade {
    FUNDAMENTAL ("Fundamental"),
    MEDIO ("Médio"),
    GRADUACAO ("Graduação"),
    POS ("Pós-Graduação");

    private Escolaridade(String rotulo) {
        this.rotulo = rotulo;
    }

    private String rotulo;


    @Override
    public String toString() {
        return this.rotulo;
    }
}
