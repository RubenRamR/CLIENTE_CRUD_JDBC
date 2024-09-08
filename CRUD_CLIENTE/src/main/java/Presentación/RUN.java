/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentación;

import Negocio.ClienteNegocio;
import Negocio.IClienteNegocio;
import Persistencia.ClienteDAO;
import Persistencia.ConexionBD;
import Persistencia.IClienteDAO;
import Persistencia.IConexionBD;

/**
 *
 * @author rramirez
 */
public class RUN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConexionBD conexion = new ConexionBD();
        IClienteDAO clienteDAO = new ClienteDAO(conexion);
        IClienteNegocio clienteNegocio = new ClienteNegocio(clienteDAO);
        frmCliente frmCliente = new frmCliente(clienteNegocio);
        frmCliente.setVisible(true);
    }

}
