package com.acup.ACUP_Support_System.Controller;

import com.acup.ACUP_Support_System.models.Resource;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.acup.ACUP_Support_System.Service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resources")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @GetMapping
    public List<Resource> getAllResources() {
        return resourceService.getAllResources();
    }

    @PostMapping
    public Resource addResource(@RequestBody Resource resource) {
        return resourceService.saveResource(resource);
    }

    @DeleteMapping("/{id}")
    public void deleteResource(@PathVariable Long id) {
        resourceService.deleteResource(id);
    }

    // We can add additional controller methods if needed
}
