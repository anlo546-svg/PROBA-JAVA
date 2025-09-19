/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

public class ProjectName {

    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Marta", "Carlos", "Sofía", "Pedro", "Lucía", "Javier", "Elena", "Miguel"};
        Random rand = new Random();

        // Genera y muestra 5 nombres aleatorios
        for (int i = 0; i < 5; i++) {
            int indice = rand.nextInt(nombres.length);
            System.out.println("Nombre aleatorio: " + nombres[indice]);
    }
}
