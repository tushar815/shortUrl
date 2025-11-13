package com.kalbhort.shortUrl.service;

import com.kalbhort.shortUrl.entity.Url;
import com.kalbhort.shortUrl.repository.UrlRepository;
import com.kalbhort.shortUrl.utils.utils;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    private final UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }


    public Url shortenAndSaveUrl(String longUrl , String username){
        String shortUrl = utils.generateShortCode(longUrl);
        Url newUrl = new Url(longUrl, shortUrl, username);
        return urlRepository.save(newUrl);
    }
}
