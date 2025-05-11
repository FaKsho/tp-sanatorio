package Pacientes;

import java.util.Stack;

// para darle la posibildad a los pacientes de recibir pedidos de estudio
public interface Estudiable {
    void solicitarAnalisisSangre();
    void solicitarRadiografia();
}
