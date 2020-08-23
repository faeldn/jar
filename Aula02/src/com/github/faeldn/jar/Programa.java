package com.github.faeldn.jar;

import com.github.faeldn.jar.calculadora.Divide;
import com.github.faeldn.jar.calculadora.Multiplica;
import com.github.faeldn.jar.calculadora.Soma;
import com.github.faeldn.jar.calculadora.Subtrai;

/**
 * Programa de uma calculadora que utiliza uma biblioteca Jar
 * Executa todas as fun��es b�sicas de uma calculadora
 * <p>
 * Este programa sempre somar� 28+40
 * Subtrair 28-18
 * Multiplicar 35*12
 * E dividir 100/25
 * <p>
 * <blockquote><pre>
 *     Soma.soma(28, 40);
 *     Subtrai.subtrai(28, 15);
 *     Multiplica.multiplica(35, 12);
 *     Divide.divide(100, 25);
 *     //68
 *     //13
 *     //420
 * </pre></blockquote>
 * 
 * @see
 * 	este Programa teste sobre importa��es e exporta��es de bibliotecas JARs
 * 
 * @author rafae
 * @version 1.0
 *
 */

public class Programa {

	public static void main(String[] args) {
		try {
			System.out.println("Soma: " + Soma.soma(28, 40));
			System.out.println("Subtra��o: " + Subtrai.subtrai(28, 15));
			System.out.println("Multiplica��o: " + Multiplica.multiplica(35, 12));
			System.out.println("Divis�o: " + Divide.divide(100, 25));			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
