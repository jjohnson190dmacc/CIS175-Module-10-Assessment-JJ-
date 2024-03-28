package dmacc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.model.Tool;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Mar 26, 2024
 */

@Repository
public interface IToolRepo extends JpaRepository<Tool, Integer>{

}
