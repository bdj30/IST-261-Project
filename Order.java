
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smv159
 */
public class Order {

    private ArrayList<String> orderItemList;
    private String orderNumber;
    private LocalDate orderDate;
    private int shippingPriority;

    public Order(ArrayList<String> orderList, LocalDate ordered, int priority) {
        orderItemList = orderList == null ? new ArrayList<>() : orderList;
        orderDate = ordered == null ? LocalDate.now() : ordered;
        orderNumber = "ABC" + orderDate.toString();
        shippingPriority = priority;
    }

    public boolean decideToInsert(Object order){
        boolean decision = false;
        Order ord = (Order) order;
        if (this.shippingPriority != ord.shippingPriority){

            decision = this.shippingPriority > ord.shippingPriority;
        }else{
            decision = this.orderDate.isAfter(ord.orderDate);
        }
        return decision;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderItemList=" + orderItemList +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderDate=" + orderDate +
                ", shippingPriority=" + shippingPriority +
                '}';
    }
}
