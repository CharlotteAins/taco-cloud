package tacos.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import tacos.beans.Order;
import tacos.beans.User;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String zip);

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
