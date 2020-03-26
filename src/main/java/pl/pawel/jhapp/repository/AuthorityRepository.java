package pl.pawel.jhapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawel.jhapp.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
