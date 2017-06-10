/**
 * 
 */
package io.blackground.jobfinder.Repository;

import io.blackground.jobfinder.models.User;

/**
 * @author yotti
 *
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
