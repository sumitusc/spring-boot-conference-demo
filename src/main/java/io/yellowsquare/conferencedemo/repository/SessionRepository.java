package io.yellowsquare.conferencedemo.repository;

import io.yellowsquare.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

//@Service("sessionRepository")
public interface SessionRepository extends JpaRepository<Session, Long> {
}
