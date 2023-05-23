package diploma.muzychenko.carcheck.repository;

import diploma.muzychenko.carcheck.domain.SearchHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchHistoryRepository extends JpaRepository<SearchHistory, Long> {
}
