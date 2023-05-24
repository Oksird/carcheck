package diploma.muzychenko.carcheck.repository;

import diploma.muzychenko.carcheck.domain.SearchHistory;
import diploma.muzychenko.carcheck.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchHistoryRepository extends JpaRepository<SearchHistory, Long> {
    void deleteByUserAndId(User user, Long searchHistoryId);

    List<SearchHistory> findByUser(User user);
}
