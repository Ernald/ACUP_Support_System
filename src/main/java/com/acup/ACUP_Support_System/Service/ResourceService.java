package com.acup.ACUP_Support_System.Service;

import com.acup.ACUP_Support_System.Repository.ResourceRepository;
import com.acup.ACUP_Support_System.models.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;

    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    public Resource saveResource(Resource resource) {
        return resourceRepository.save(resource);
    }

    public void deleteResource(Long id) {
        resourceRepository.deleteById(id);
    }

    public List<Resource> searchResources(String query) {
        return resourceRepository.findByNameContainingIgnoreCase(query);
    }
}
