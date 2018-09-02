package model;

import java.time.LocalDate;

class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private LocalDate fullData = LocalDate.now();

    Data(){
        this.dia = LocalDate.now().getDayOfMonth();
        this.mes = LocalDate.now().getMonthValue();
        this.ano = LocalDate.now().getYear();
    }

    public Integer getDia(){ return this.dia;}
    public Integer getMes(){ return this.mes; }
    public Integer getAno() { return this.ano; }
    public LocalDate getFullData() { return this.fullData; }
    String getDataFormatada(){ return this.dia + "/" + this.mes + "/" + this.ano; }
}