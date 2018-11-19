package spring.boot.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.core.entities.User;

/**
 * 用户持久层操作接口
 *
 * Created by bysocket on 21/07/2017.
 */
public interface UserDao extends JpaRepository<User, Long> {

}
