package uce;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

@Named(value = "resumen3Bean")
@ViewScoped
public class Resumen3Bean implements Serializable {

    private BarChartModel barModel;


    public BarChartModel getBarModel() {
        return barModel;
    }

    public void setBarModel(BarChartModel barModel) {
        this.barModel = barModel;
    }



    public void listar() {
        try {
            ResumenDao resumen;
            List<Resumen> lista;
            resumen = new ResumenDao();
            lista = resumen.listar();
            graficar(lista);
        } catch (SQLException ex) {
            Logger.getLogger(Resumen3Bean.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }

    private void graficar(List<Resumen> lista) {
        barModel = new BarChartModel();
        ChartSeries actual = new ChartSeries();
        actual.setLabel("actual");

        lista.stream().forEach((res) -> {
            actual.set(res.getTipo_inspeccion(), res.getValor());// res.getNombreMateria(),res.getNota()
        });

        barModel.addSeries(actual);

        barModel.setShowPointLabels(true);
    }



}
