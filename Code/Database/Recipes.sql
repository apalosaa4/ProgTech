CREATE TABLE `Ingredients` (
  `ingredients_id` int PRIMARY KEY AUTO_INCREMENT,
  `ingredients_name` varchar(255),
  `ingredients_freefrom_name` varchar(255)
);

CREATE TABLE `FreeFrom` (
  `freefrom_id` int PRIMARY KEY,
  `freefrom_name` varchar(255)
);

CREATE TABLE `Recipes` (
  `recipes_id` int PRIMARY KEY,
  `recipes_name` varchar(255),
  `freefrom_name` varchar(255),
  `ingredients_name` varchar(255),
  `recipes_description` text
);

ALTER TABLE `Ingredients` ADD FOREIGN KEY (`ingredients_freefrom_name`) REFERENCES `FreeFrom` (`freefrom_name`);

ALTER TABLE `Ingredients` ADD FOREIGN KEY (`ingredients_name`) REFERENCES `Recipes` (`ingredients_name`);
