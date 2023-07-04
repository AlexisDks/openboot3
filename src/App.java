public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        Persona persona = app.new Persona();

        persona.setEdad(18);
        persona.setNombre("Juan");
        persona.setTelefono("12345678");

        System.out.println("El empleado " + persona.getNombre() + " tiene la edad de " + persona.getEdad()
                + " y su telefono es " + persona.getTelefono());
    }

    /**
     * InnerApp
     */
    public class Persona {
        private int edad;
        private String nombre;
        private String telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

    }
}
