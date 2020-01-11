/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastpay;

/**
 *
 * @author STALIN RIVERA,DENNIS PARRA, JORGE RAMOS, MATITISXD RODRIGUEZ
 */
public class Cuenta {
	private final int numeroCuenta;
	private double saldo;
	
	public Cuenta(int cuenta, double inicial) {
		numeroCuenta = cuenta;
		saldo = inicial;
	} 

	public void depositar(double cantidad) {
		saldo = saldo + cantidad;
	} 

	public void retirar(double cantidad) {
		saldo = saldo - cantidad;
	} 

	public double saldo() {
		return saldo;
	} 
    
}
