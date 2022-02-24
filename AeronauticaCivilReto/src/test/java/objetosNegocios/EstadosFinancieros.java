package objetosNegocios;

import net.serenitybdd.screenplay.targets.Target;

public class EstadosFinancieros {
    public static final Target BALANCES = Target.the("Balances").locatedBy("//*[@id=\"WebPartWPQ10\"]/div[1]");

    public static final Target ESTADO_SITUACION = Target.the("Estado Situacion").locatedBy("//*[@id=\"paging_container3\"]/ul/li[1]/div/div/div/a[1]");

}
