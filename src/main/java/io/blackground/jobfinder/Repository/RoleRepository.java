/**
 * 
 */
package io.blackground.jobfinder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.blackground.jobfinder.models.Role;


/**
 * @author yotti
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
