/**
 * 
 */
package io.blackground.jobfinder.services;

import io.blackground.jobfinder.models.User;

/**
 * @author yotti
 *
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
