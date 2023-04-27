import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        int node = 0;
        Stack stack = new Stack();

        do {
            try {
                option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Opciones: \n" +
                                "1: Insertar un nodo\n" +
                                "2: Eliminar un nodo\n" +
                                "3: Verificar si la pila esta vacia\n" +
                                "4: Ultimo valor agregado\n" +
                                "5: Numero de nodos de la pila\n" +
                                "6: Vaciar pila\n" +
                                "7: Mostrar contenido del nodo\n" +
                                "8: Salir.\n"
                ));

                switch (option) {
                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    default: JOptionPane.showMessageDialog(null, "Porfavor ingrese una opcion correcta");
                }

            }catch (NumberFormatException e) {

            }
        } while (option != 8);
    }
}