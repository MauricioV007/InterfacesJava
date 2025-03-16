/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesImplementación;
import Interfaces.InterfazTrabajador;
/**
 *
 * @author mauri
 */

public class Desarrollador implements InterfazTrabajador<String>{

    @Override
    public String trabajar() {
        return "El desarrollador está escribiendo código en CSS.";
    }
    
}