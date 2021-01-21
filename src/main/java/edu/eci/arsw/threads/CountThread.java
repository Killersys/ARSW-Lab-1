/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 * @author Jairo
 */
//Extendemos la clase Thread
public class CountThread extends Thread {
	
	
	//Creamos las variables que se utilizarán, en este caso se llamarán A y B.
	private int A; 
	private int B;
	public CountThread(int A, int B) {
		this.A = A;
		this.B = B;
	}
	//Realizamos la ejecución, mostrando en pantalla el valor de A si es menor o igual a B; incrementamos el valor de A.
    public void run() {
    	while(A<=B) {
    		System.out.println(A);
    		A++;
        		
    	}    	
   
    
    
}}
