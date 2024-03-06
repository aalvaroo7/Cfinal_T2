package animales.animales;

public class animales {
    String nombre;
    String especie;
    String raza;
    String color;
    String sexo;
    String edad;
    String peso;
    String altura;
    String tipo;
    String habitat;
    String alimentacion;
    String reproduccion;
    String cuidados;
    String enfermedades;
    String vacunas;
    int id;
    boolean salud;
    boolean comportamiento;

    public animales(String nombre, String especie, String raza, String color, String sexo, String edad,
                    String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion,
                    String cuidados, String enfermedades, String vacunas, int id, boolean salud, boolean comportamiento) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipo = tipo;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.cuidados = cuidados;
        this.enfermedades = enfermedades;
        this.vacunas = vacunas;
        this.id = id;
        this.salud = salud;
        this.comportamiento = comportamiento;
    }
}
