package br.senac.sp.enumeration;

public enum EstadoCivil {
    CASADO("Casado"),
    DIVORCIADO("Divorciado"),
    SOLTEIRO("Solteiro"),
    UNIAO_ESTAVEL("União Estável"),
    VIUVO("Viúvo");

    private EstadoCivil(String rotulo) {
        this.rotulo = rotulo;
    }

    private String rotulo;

    public String toString() {
        return this.rotulo;
    }
}
