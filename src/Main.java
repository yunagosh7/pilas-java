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
                        node = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para el nodo"));
                        stack.insertNode(node);
                        break;
                    case 2:
                        if (!stack.isStackEmpty()) {
                            JOptionPane.showMessageDialog(null, "Se ha elmiminado un valor" +
                                    stack.deleteNode());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 3:
                        if (stack.isStackEmpty()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia");
                        }
                        break;
                    case 4:
                        if (!stack.isStackEmpty()) {
                            JOptionPane.showMessageDialog(null, stack.showLastValueEntered());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene " + stack.stackSize() + " nodos");
                        break;
                    case 6:
                        if (!stack.isStackEmpty()) {
                            stack.clearStack();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 7:
                        stack.showAllItems();
                        break;
                    case 8:
                        option = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Porfavor ingrese una opcion correcta");
                        break;
                }

            } catch (NumberFormatException e) {

            }
        } while (option != 8);
    }
}