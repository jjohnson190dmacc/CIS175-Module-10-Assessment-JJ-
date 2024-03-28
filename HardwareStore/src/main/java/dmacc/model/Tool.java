package dmacc.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Mar 26, 2024
 */

@Entity
@Data
@NoArgsConstructor
public class Tool {

	@Id
	@GeneratedValue
	private int toolID;
	
	@NotEmpty(message="Can't be Empty!")
	@Size(min = 5, message = "Must be at least 5 chars")
	private String toolName;
	private double toolPrice;
	
}
