package com.mais.saude.models.pacientes;

import com.mais.saude.models.Pessoa;

public class Paciente extends Pessoa {
    private Boolean pacienteArea;
    private int area;
    private int microArea;
    private int familia;
    private int membro;


    /**********************Construtores**************************/


    /*************************Metodos****************************/


    /*************************Geters*****************************/
    public Boolean getPacienteArea() {
        return pacienteArea;
    }
    public int getArea() {
        return area;
    }
    public int getMicroArea() {
        return microArea;
    }
    public int getFamilia() {
        return familia;
    }
    public int getMembro() {
        return membro;
    }

    /*************************Seters*****************************/ 
    public void setPacienteArea(Boolean pacienteArea) {
        this.pacienteArea = pacienteArea;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public void setMicroArea(int microArea) {
        this.microArea = microArea;
    }
    public void setFamilia(int familia) {
        this.familia = familia;
    }
    public void setMembro(int membro) {
        this.membro = membro;
    }

    /*********************HashCode/Equals************************/


    /*************************output*****************************/

}
