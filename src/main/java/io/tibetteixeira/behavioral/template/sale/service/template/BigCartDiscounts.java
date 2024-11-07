package io.tibetteixeira.behavioral.template.sale.service.template;

import io.tibetteixeira.behavioral.template.sale.model.Cart;

public class BigCartDiscounts extends BestOfferTemplate {

    public BigCartDiscounts(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return regularItemsPrice > 1000;
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.9d;
    }

}