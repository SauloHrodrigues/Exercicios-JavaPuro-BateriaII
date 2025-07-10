package entedade;

import enuns.TipoDeQuarto;

public class Quarto {
    private int numero;
    private TipoDeQuarto tipo;
    private boolean oculpado;

    public Quarto(int numero, TipoDeQuarto tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.oculpado = false;
    }

    public void reservar(){
        this.oculpado = true;
    }

    public void liberar() {
        this.oculpado = false;
    }

    public void ocuparQuarto(){
        this.oculpado = true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoDeQuarto getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeQuarto tipo) {
        this.tipo = tipo;
    }

    public boolean isOculpado() {
        return oculpado;
    }

}
