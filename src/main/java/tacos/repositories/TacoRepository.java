package tacos.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import tacos.beans.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
}
