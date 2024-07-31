/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.carro;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class Automovil {

      String marca;        // Atributo que define el modelo de un automóvil
        int modelo;        // Atributo que define el motor de un automóvil
        int motor;        // Tipo de combustible como un valor enumerado

        enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISESEL, GAS_NATURAL}  // Atributo que define el tipo de combustible
        tipoCom tipoCombustible;        // Tipo de automóvil como un valor enumerado
        enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}     // Atributo que define el tipo de automóvil
        tipoA tipoAutomóvil;        
        int númeroPuertas;      // Atributo que define el número de puertas de un automóvil
        int cantidadAsientos;       // Atributo que define la cantidad de asientos de un automóvil
        int velocidadMaxima;         // Atributo que define la velocidad máxima de un automóvil
        // Color del automóvil como un valor enumerado
        enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
        tipoColor color;              // Atributo que define el color de un automóvil
        int velocidadActual = 0;             // Atributo que define la velocidad de un automóvil
        enum mecanica{AUTOMATICO,MANUAL};
        mecanica tipoMecanica;
        double valorMultas1;
        int contadorMultas;
        
        
public Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomóvil, 
        int númeroPuertas, int cantidadAsientos, int velocidadMáxima, tipoColor color,mecanica tipoMecanica) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomóvil = tipoAutomóvil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMáxima;
        this.color = color;
        this.tipoMecanica = tipoMecanica;
        
        
}
void imprimir() {
        System.out.println("Marca = "+marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomóvil);
        System.out.println("Número de puertas = " + númeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("El carro es: "+tipoMecanica);
        
}

void acelerar(int incrementoVelocidad){
    if (velocidadActual + incrementoVelocidad < velocidadMaxima){
        /*si el incremento de velocidad no supera la velocidad maxima*/
        velocidadActual = velocidadActual + incrementoVelocidad;
    }else{
       if(velocidadActual + incrementoVelocidad > velocidadMaxima){
           System.out.println("A sobre pasado el limete de velocidad");
           valorMultas();
           contadorMult();
           velocidadActual = velocidadActual + incrementoVelocidad;
       }
       
    }
}
    double valorMultas(){
         return valorMultas1 += 545000;
   
    }
   int contadorMult(){
       return contadorMultas++;
   }
double totalMultas (){
   return valorMultas();
        
    
}

void desacelerar (int decrementoVelocidad){
    if((velocidadActual - decrementoVelocidad) > 0){
        velocidadActual = velocidadActual - decrementoVelocidad;
    }else{
        System.out.println("No se puede decrementar la velocidad negativa");
    }
}

void frenar(){
    velocidadActual = 0;
}

double calcularTiempoLlegada(int distancia){
    return distancia/velocidadActual;
}

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoA getTipoAutomóvil() {
        return tipoAutomóvil;
    }

    public void setTipoAutomóvil(tipoA tipoAutomóvil) {
        this.tipoAutomóvil = tipoAutomóvil;
    }

    public int getNúmeroPuertas() {
        return númeroPuertas;
    }

    public void setNúmeroPuertas(int númeroPuertas) {
        this.númeroPuertas = númeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public mecanica getTipoMecanica() {
        return tipoMecanica;
    }

    public void setTipoMecanica(mecanica tipoMecanica) {
        this.tipoMecanica = tipoMecanica;
    }
    
    
    

public static void main (String args[]){
    Automovil auto1 = new Automovil("Ford",2018,3,tipoCom.DIESEL,
    tipoA.EJECUTIVO,5,6,160,tipoColor.AMARILLO,mecanica.MANUAL);
    Automovil auto2 = new Automovil("Ford",2018,3,tipoCom.DIESEL,
    tipoA.EJECUTIVO,5,6,160,tipoColor.AMARILLO,mecanica.AUTOMATICO);
    auto1.imprimir();
    auto2.imprimir();
    auto1.setVelocidadActual(100);
    System.out.println("Velocidad actual = " + auto1.velocidadActual);
    auto1.acelerar(166);
    System.out.println("Velocidad actual = "+auto1.velocidadActual);
    auto1.desacelerar(150);
    System.out.println("Velocidad actual = "+auto1.velocidadActual);
    auto1.frenar();
    System.out.println("Velocidad actual = "+auto1.velocidadActual);
    auto1.acelerar(90);
    System.out.println("Velocidad actual = "+auto1.velocidadActual);
    auto1.acelerar(170);
    System.out.println("Velocidad actual = "+auto1.velocidadActual);
    auto1.desacelerar(140);
    System.out.println("Velocidad actual = "+auto1.velocidadActual);
    System.out.println("Cantidad de multas: "+auto1.contadorMultas);
    System.out.println("Multa: "+auto1.valorMultas1);
    
    
}


}
