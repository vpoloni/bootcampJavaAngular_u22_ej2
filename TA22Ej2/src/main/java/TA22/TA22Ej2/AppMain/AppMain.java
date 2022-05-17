package TA22.TA22Ej2.AppMain;

import TA22.TA22Ej2.Controllers.Controlador;

import TA22.TA22Ej2.Models.ConexioSQL;

import TA22.TA22Ej2.Models.Model;
import TA22.TA22Ej2.Vista.Vista;
import TA22.TA22Ej2.Vista.Vista2;

/**
 * Hello world!
 *
 */
public class AppMain 
{
    public static void main( String[] args )
    {
    	Vista vista = new Vista();
    	Vista2 vista2 = new Vista2();
    	ConexioSQL conexio = new ConexioSQL();
    	Model model = new Model();
    
		Controlador controlador = new Controlador(model, vista, vista2, conexio);
		
    }
}
