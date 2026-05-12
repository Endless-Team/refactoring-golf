package bustapaga.buca01;

public class BustaPaga {
    private final double stipendio;

    public BustaPaga(final double stpnd) {
        this.stipendio = stpnd;
    }

    public double getNetto() {
        final double primoStipendio = Math.max(Math.min(stipendio, 20000.0) - 5000, 0.0);
        final double secondoStipendio = Math.max(Math.min(stipendio, 40000) - 20000, 0.0);
        final double terzoStipendio = Math.max(stipendio - 40000, 0.0);
        return stipendio - (primoStipendio * 0.1 + secondoStipendio * 0.2 + terzoStipendio * 0.4);
    }
}
