package io.tibetteixeira.structural.facade;

import io.tibetteixeira.structural.facade.model.Card;

public class App {

    public static void main(String[] args) {
        CallCenterFacade facade = new CallCenterFacade();

        Card card = facade.getCardByUser(123456L);
        System.out.println(card);

        facade.getSumary(card);

        facade.getPaymentInfoByCard(card);

        facade.cancelLastRegister(card);

        Card newCard = facade.getCardByUser(123456L);
        System.out.println(newCard);
    }
}
