package am.gch.repository;

import am.gch.domain.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.*;

import java.util.*;

/**
 * Created by Garik on 2/11/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findAll();
}
