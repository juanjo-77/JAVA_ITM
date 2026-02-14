package veterinariaJJ;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Crear la veterinaria
        Veterinaria veterinaria = new Veterinaria();

        // Crear un veterinario
        Veterinario vet = new Veterinario(
                "Carlos",
                "Perez",
                "CC",
                "12345",
                3000000,
                "carlos@email.com",
                "Calle 10",
                new Date(),
                "Cirujano",
                2500000,
                5
        );

        // Crear una mascota
        Mascota mascota = new Mascota("Firulais", 3, "Perro", "Labrador");

        // Crear un cliente
        Cliente cliente = new Cliente(
                "Ana",
                "Gomez",
                "CC",
                "54321",
                123456789,
                "ana@email.com",
                "Carrera 20",
                new Date(),
                "CL001",
                new Date(),
                mascota
        );

        // Crear una consulta
        Consulta consulta = new Consulta(
                new Date(),
                "Vacunación",
                50000,
                "Todo bien",
                mascota,
                vet
        );

        // Registrar todo en la veterinaria
        veterinaria.agregarVeterinario(vet);
        veterinaria.agregarCliente(cliente);
        veterinaria.agregarConsulta(consulta);

        // Mostrar resultados
        System.out.println("Veterinarios registrados: " + veterinaria.getListaVeterinarios().size());
        System.out.println("Clientes registrados: " + veterinaria.getListaClientes().size());
        System.out.println("Consultas registradas: " + veterinaria.getListaConsultas().size());

        System.out.println("Sistema funcionando correctamente ✅");
    }
}
