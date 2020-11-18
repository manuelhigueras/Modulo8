/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bank;

/**
 *
 * @author user
 */
public class Alumno {
    
    public double calcularNota(){
        return 10;
    }
    public final void matricular(){
        System.out.println("Me matriculo");
    }
    
}

class AntiguosAlumnos extends Alumno{
    @Override
    public double calcularNota(){
        return super.calcularNota();
    }
}
