package bustapaga.buca01;

public class BustaPaga {
    private final double imponibile;

    public BustaPaga(final double stipendio) {
        this.imponibile = stipendio;
    }

    public double getNetto() {
        final double primoScaglione = Math.max(Math.min(imponibile, 20000.0) - 5000, 0.0);
        final double secondoScaglione = Math.max(Math.min(imponibile, 40000) - 20000, 0.0);
        final double terzoScaglione = Math.max(imponibile - 40000, 0.0);
        return imponibile - (primoScaglione * 0.1 + secondoScaglione * 0.2 + terzoScaglione * 0.4);
    }
}
