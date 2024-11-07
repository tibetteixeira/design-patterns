package io.tibetteixeira.behavioral.template.sale.service.template;

import io.tibetteixeira.behavioral.template.sale.model.Cart;

public abstract class BestOfferTemplate {

    protected Cart cart;
    protected Double regularItemsPrice;
    protected Double deliveryTax;
    protected Double priceFactor;
    protected Double deliveryFactor;

    protected BestOfferTemplate(Cart cart) {
        this.cart = cart;
        regularItemsPrice = calculateRegularItemsPrice();
        deliveryTax = calculateDeliveryTax();
        priceFactor = 1d;
        deliveryFactor = 1d;
    }

    protected Double calculateDeliveryTax() {
        Double distance = cart.getBuyer().getDistance();
        Double totalWeight = cart.getItems().stream()
                .reduce(0d, (acc, item) -> acc + item.getWeight(), Double::sum);
        return (distance * totalWeight) / 100;
    }

    protected Double calculateRegularItemsPrice() {
        return cart.getItems().stream()
                .reduce(0d, (acc, item) -> acc + item.getValue(), Double::sum);
    }

    public Double calculateOffer() {
        calibrateVariables();

        return (regularItemsPrice * priceFactor) + (deliveryTax * deliveryFactor);
    }

    public abstract boolean isAppliable();

    protected abstract void calibrateVariables();
}
