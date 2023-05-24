package diploma.muzychenko.carcheck.service;

import diploma.muzychenko.carcheck.domain.SearchHistory;
import diploma.muzychenko.carcheck.domain.User;
import diploma.muzychenko.carcheck.model.SearchHistoryDto;
import diploma.muzychenko.carcheck.repository.SearchHistoryRepository;

import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchHistoryService {

    private final SearchHistoryRepository searchHistoryRepository;
    private final UserRepository userRepository;

    @Autowired
    public SearchHistoryService(SearchHistoryRepository searchHistoryRepository, UserRepository userRepository) {
        this.searchHistoryRepository = searchHistoryRepository;
        this.userRepository = userRepository;
    }

    public void saveSearchHistory(Long userId, String searchQuery) {
        User user = getUser(userId);
        SearchHistory searchHistory = new SearchHistory();
        searchHistory.setUser(user);
        searchHistory.setSearchQuery(searchQuery);
        searchHistoryRepository.save(searchHistory);
    }

    public void deleteSearchHistory(Long userId, Long searchHistoryId) {
        User user = getUser(userId);
        searchHistoryRepository.deleteByUserAndId(user, searchHistoryId);
    }

    public List<SearchHistoryDto> getSearchHistoryByUserId(Long userId) {
        User user = getUser(userId);
        List<SearchHistory> searchHistoryList = searchHistoryRepository.findByUser(user);
        return searchHistoryList.stream()
                .map(this::mapToSearchHistoryDto)
                .collect(Collectors.toList());
    }

    private User getUser(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found with ID: " + userId));
    }

    private SearchHistoryDto mapToSearchHistoryDto(SearchHistory searchHistory) {
        SearchHistoryDto dto = new SearchHistoryDto();
        dto.setId(searchHistory.getId());
        dto.setSearchQuery(searchHistory.getSearchQuery());
        return dto;
    }
}
