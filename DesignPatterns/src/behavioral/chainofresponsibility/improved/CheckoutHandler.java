package behavioral.chainofresponsibility.improved;


import java.util.ArrayList;
import java.util.List;

public abstract class CheckoutHandler {

    protected CheckoutHandler nextHandler;


    public abstract void handlCheckout();


    public void setNextHandler(CheckoutHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
