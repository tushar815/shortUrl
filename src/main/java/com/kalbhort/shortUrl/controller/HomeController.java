package com.kalbhort.shortUrl.controller;

import com.kalbhort.shortUrl.entity.Url;
import com.kalbhort.shortUrl.model.UrlRequest;
import com.kalbhort.shortUrl.service.UrlService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    UrlService urlService;


    public HomeController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/api/urls")
    public ResponseEntity<String> createShortUrl(@RequestBody UrlRequest url) {
        Url newUrl=  urlService.shortenAndSaveUrl(url.longUrl, url.username);
        return new ResponseEntity<>(newUrl.getShortUrl(), HttpStatus.CREATED);
        }


}
