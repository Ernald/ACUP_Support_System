import com.acup.ACUP_Support_System.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    // We can add custom query methods if needed

}
