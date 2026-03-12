package org.diegofigueroa.tema_03_poo.clase_05_inmutabilidad;

/// Decimos al compilador que esta clase no cambiara su estado en tiempo de ejecucion
/// Se mantendra tal cual esta es imopsible cambiar alguno de sus valores
public final class Inmutabilidad {
    private final String atr1;
    private final String atr2;

    public Inmutabilidad(String atr1, String atr2) {
        this.atr1 = atr1;
        this.atr2 = atr2;
    }

    public String getAtr1() {
        return atr1;
    }

    public String getAtr2() {
        return atr2;
    }

}


