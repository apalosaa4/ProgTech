CREATE TABLE `Ingredients` (
  `ingredients_id` int PRIMARY KEY AUTO_INCREMENT,
  `ingredients_name` varchar(255)
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

CREATE TABLE `Recipe_Ingredients` (
  `recipe_id` int,
  `ingredients_id` int,
  `ingredients_amount` varchar(255)
);

CREATE TABLE `Recipe_Freefrom` (
  `freefrom_id` int,
  `recipe_id` int
);

ALTER TABLE `Recipe_Freefrom` ADD FOREIGN KEY (`recipe_id`) REFERENCES `Recipes` (`recipes_id`);

ALTER TABLE `Recipe_Freefrom` ADD FOREIGN KEY (`freefrom_id`) REFERENCES `FreeFrom` (`freefrom_id`);

ALTER TABLE `Recipe_Ingredients` ADD FOREIGN KEY (`ingredients_id`) REFERENCES `Ingredients` (`ingredients_id`);

ALTER TABLE `Recipe_Ingredients` ADD FOREIGN KEY (`recipe_id`) REFERENCES `Recipes` (`recipes_id`);

ALTER TABLE `Recipes` ADD FOREIGN KEY (`ingredients_name`) REFERENCES `Ingredients` (`ingredients_id`);
