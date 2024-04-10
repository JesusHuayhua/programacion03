
package org.pucp.airsoft.companies.aerolinea.dao;


import org.pucp.airsoft.companies.model.Aerolinea;


public interface AerolineaDao {
    int insertar(Aerolinea area);
    int modificar(Aerolinea area);
    int eliminar(int idArea);
    
}
