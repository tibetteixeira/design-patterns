package io.tibetteixeira.behavioral.template.sale.service.template;

import io.tibetteixeira.behavioral.template.sale.model.Cart;

public class RegularPrice extends BestOfferTemplate {

    public RegularPrice(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return true;
    }

    @Override
    protected void calibrateVariables() {
        // Nothing to adjust!
    }

}