DROP DATABASE IF EXISTS API;
CREATE DATABASE API;
DROP TABLE IF EXISTS items;

CREATE TABLE `items` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `price` varchar(100) NOT NULL,
  `image_path` text NOT NULL,
  `creat_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY  (`id`)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;