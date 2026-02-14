package veterinariaJJ;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    // Listas para guardar la información
    private List<Veterinario> listaVeterinarios;
    private List<Cliente> listaClientes;
    private List<Consulta> listaConsultas;

    // Constructor
    public Veterinaria() {
        listaVeterinarios = new ArrayList<>();
        listaClientes = new ArrayList<>();
        listaConsultas = new ArrayList<>();
    }

    // Método para agregar un veterinario
    public void agregarVeterinario(Veterinario veterinario) {
        listaVeterinarios.add(veterinario);
    }

    // Método para agregar un cliente
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    // Método para agregar una consulta
    public void agregarConsulta(Consulta consulta) {
        listaConsultas.add(consulta);
    }

    // Métodos para obtener las listas
    public List<Veterinario> getListaVeterinarios() {
        return listaVeterinarios;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Consulta> getListaConsultas() {
        return listaConsultas;
    }
}
