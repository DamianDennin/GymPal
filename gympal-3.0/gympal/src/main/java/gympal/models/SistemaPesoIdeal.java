package gympal.models;

import gympal.interfaces.AdapterPesoIdeal;

public class SistemaPesoIdeal implements AdapterPesoIdeal {

    @Override
    public double calcularPesoIdeal(Socio socio) {
        String sexo = socio.getSexo();
        double altura= socio.getAltura();
        double peso= socio.getPeso();
        double pesoIdeal;
        if (sexo=="Masculino"){
            pesoIdeal=altura-100-((altura-150)/4);
        }
        else{
            pesoIdeal=(altura-100)*0.85;
        }
        return pesoIdeal;
    }
}
