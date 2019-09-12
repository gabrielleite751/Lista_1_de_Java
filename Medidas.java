package br.com.cesar.lista1.Objetos;

public class Medidas {
    private String unidadeDeDistancia;
    private String unidadeDeMassa;
    private String unidadeDeTemperatura;
    private int realDistancia;
    private int realMassa;
    private int realTemperatura;

    public Medidas() {
    
    }
    
    public Medidas(String unidadeDeDistancia, String unidadeDeMassa, String unidadeDeTemperatura, int realDistancia, int realMassa, int realTemperatura) {
        this.unidadeDeDistancia = unidadeDeDistancia;
        this.unidadeDeMassa = unidadeDeMassa;
        this.unidadeDeTemperatura = unidadeDeTemperatura;
        this.realDistancia = realDistancia;
        this.realMassa = realMassa;
        this.realTemperatura = realTemperatura;
    }


    public String getUnidadeDeDistancia() {
        return unidadeDeDistancia;
    }

    public void setUnidadeDeDistancia(String unidadeDeDistancia) {
        this.unidadeDeDistancia = unidadeDeDistancia;
    }

    public String getUnidadeDeMassa() {
        return unidadeDeMassa;
    }

    public void setUnidadeDeMassa(String unidadeDeMassa) {
        this.unidadeDeMassa = unidadeDeMassa;
    }

    public String getUnidadeDeTemperatura() {
        return unidadeDeTemperatura;
    }

    public void setUnidadeDeTemperatura(String unidadeDeTemperatura) {
        this.unidadeDeTemperatura = unidadeDeTemperatura;
    }

    public double getRealDistancia() {
        return realDistancia;
    }

    public void setRealDistancia(double realDistancia) {
        this.realDistancia = realDistancia;
    }

    public double getRealMassa() {
        return realMassa;
    }

    public void setRealMassa(double realMassa) {
        this.realMassa = realMassa;
    }

    public double getRealTemperatura() {
        return realTemperatura;
    }

    public void setRealTemperatura(double realTemperatura) {
        this.realTemperatura = realTemperatura;
    }

    public void converterMassa(Medidas medidas) {
        if (medidas.getUnidadeDeMassa().equals("Kg") ) {
            medidas.setUnidadeDeMassa("Kg");
            medidas.setRealMassa(medidas.getRealMassa() * 2.2046);
        }
        else {
            medidas.setUnidadeDeMassa("lb");
            medidas.setRealMassa(medidas.getRealMassa() / 2.2046);
        }
        System.out.println(getRealMassa() + getUnidadeDeMassa());
    }

    public void converterTemperatura(Medidas medidas) {
        if (medidas.getUnidadeDeTemperatura().equals("C")) {
            medidas.setUnidadeDeTemperatura("F");
            medidas.setUnidadeDeTemperatura((medidas.getRealTemperatura() - 32) / 1.8);
        }
        else {
            medidas.setUnidadeDeTemperatura("C");
            medidas.setRealTemperatura(medidas.getRealTemperatura() * 1.8 - 32);
        }
        System.out.println(getRealTemperatura() + getUnidadeDeTemperatura());
    }

    public void converterDistancia(Medidas medidas) {
        if (medidas.getUnidadeDeDistancia().equals("Km")) {
            medidas.setUnidadeDeDistancia("mi");
            medidas.setRealDistancia(medidas.getRealDistancia() / 1.609);
        }
        else {
            medidas.setUnidadeDeDistancia("Km");
            medidas.setRealDistancia(medidas.getRealDistancia() * 1.609);
        }
        System.out.println(getRealDistancia() + getUnidadeDeDistancia());
    }
}
