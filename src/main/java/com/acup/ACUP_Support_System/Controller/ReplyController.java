import com.acup.ACUP_Support_System.Service.ReplyService;
import com.acup.ACUP_Support_System.models.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replies")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @GetMapping
    public List<Reply> getAllReplies() {
        return replyService.getAllReplies();
    }

    @PostMapping
    public Reply addReply(@RequestBody Reply reply) {
        return replyService.saveReply(reply);
    }

    @DeleteMapping("/{id}")
    public void deleteReply(@PathVariable Long id) {
        replyService.deleteReply(id);
    }

    // We can add additional controller methods if needed
}
