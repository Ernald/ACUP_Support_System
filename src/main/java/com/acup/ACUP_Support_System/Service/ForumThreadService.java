import com.acup.ACUP_Support_System.Repository.ForumThreadRepository;
import com.acup.ACUP_Support_System.models.ForumThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumThreadService {
    @Autowired
    private ForumThreadRepository forumThreadRepository;

    public List<ForumThread> getAllThreads() {
        return forumThreadRepository.findAll();
    }

    public ForumThread saveThread(ForumThread thread) {
        return forumThreadRepository.save(thread);
    }

    public void deleteThread(Long id) {
        forumThreadRepository.deleteById(id);
    }

    // We can add custom query methods if needed
}
