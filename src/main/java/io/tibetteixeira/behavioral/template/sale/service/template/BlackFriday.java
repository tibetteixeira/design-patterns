package io.tibetteixeira.behavioral.template.sale.service.template;

import io.tibetteixeira.behavioral.template.sale.model.Cart;

import java.util.Calendar;

public class BlackFriday extends BestOfferTemplate {

    public BlackFriday(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.MONTH) == Calendar.NOVEMBER;
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.75d;
    }
}
