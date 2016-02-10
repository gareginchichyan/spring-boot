package am.gch.service;

import am.gch.domain.*;

import java.util.*;

/**
 * Created by Garik on 2/11/16.
 */
public interface UserService {

	public void add(User user);

	public List<User> getAll();
}
