package estructural.adptereloi;

import estructural.adapter.UsuarioAPIExterna;

public class StripeAdapter implements PasarelaPago {

    private StripeAPI stripeAPI;

    public StripeAdapter(StripeAPI stripeAPI) {
        this.stripeAPI = stripeAPI;
    }

    @Override
    public boolean realizarPago(double importe) {

        int amountInCents = (int) Math.round(importe * 100);


        String resultado = stripeAPI.charge(amountInCents, "EUR");


        return resultado.equals("OK");
    }
}
