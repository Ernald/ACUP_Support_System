import com.acup.ACUP_Support_System.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    // We can add custom query methods if needed
}
