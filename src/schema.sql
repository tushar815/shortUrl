CREATE TABLE global_urls (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
long_url varchar(2048) NOT NULL,
short_url varchar(255) NOT NULL UNIQUE,
username varchar(100)
);