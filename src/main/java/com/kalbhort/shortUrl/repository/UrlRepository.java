package com.kalbhort.shortUrl.repository;

import com.kalbhort.shortUrl.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
}
