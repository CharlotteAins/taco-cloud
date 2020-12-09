package tacos.repositories;

import org.springframework.data.repository.CrudRepository;
import tacos.beans.Order;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String zip);

}
