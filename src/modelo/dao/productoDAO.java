package modelo.dao;
import modelo.dto.productoDTO;
import java.util.ArrayList;

public class productoDAO {
    private ArrayList<productoDTO> lista = new ArrayList<>();

    public productoDAO() {
        lista.add(new productoDTO("P001", "Televisor",   1200000.0, 0));
        lista.add(new productoDTO("P002", "Licuadora",    200000.0, 0));
        lista.add(new productoDTO("P003", "Nevera",      2500000.0, 0));
        lista.add(new productoDTO("P004", "PlayStation", 1500000.0, 0));
        lista.add(new productoDTO("P005", "Portatil",    3200000.0, 0));
        lista.add(new productoDTO("P006", "Mouse",        120000.0, 0));
        lista.add(new productoDTO("P007", "Ventilador",   300000.0, 0));
        lista.add(new productoDTO("P008", "Tablet",      1000000.0, 0));
        lista.add(new productoDTO("P009", "Camara",      1800000.0, 0));
        lista.add(new productoDTO("P010", "Bafle",        400000.0, 0));
    }

    public ArrayList<productoDTO> listar() {
        return lista;
    }
}