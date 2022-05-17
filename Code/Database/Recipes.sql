CREATE TABLE `freefrom` (
  `freefrom_id` int(11) PRIMARY KEY NOT NULL,
  `freefrom_name` varchar(255) DEFAULT NULL
);

CREATE TABLE `measurement` (
  `measurement_id` int(11) PRIMARY KEY NOT NULL,
  `measurement_amount` int(11) DEFAULT NULL,
  `measurement_name` varchar(255) DEFAULT NULL
);

CREATE TABLE `recipes` (
  `recipes_id` int(11) PRIMARY KEY NOT NULL,
  `recipes_name` varchar(255) DEFAULT NULL,
  `freefrom_name` varchar(255) DEFAULT NULL,
  `recipes_description` text DEFAULT NULL
);

CREATE TABLE `recipe_freefrom` (
  `freefrom_id` int(11) DEFAULT NULL,
  `recipe_id` int(11) DEFAULT NULL
);

CREATE TABLE `recipe_measurement` (
  `recipe_id` int(11) DEFAULT NULL,
  `measurement_id` int(11) DEFAULT NULL,
  `ingredients_name` varchar(255) DEFAULT NULL
);

ALTER TABLE `freefrom` ADD FOREIGN KEY (`freefrom_id`) REFERENCES `recipe_freefrom` (`freefrom_id`);

ALTER TABLE `recipe_freefrom` ADD FOREIGN KEY (`recipe_id`) REFERENCES `recipes` (`recipes_id`);

ALTER TABLE `measurement` ADD FOREIGN KEY (`measurement_id`) REFERENCES `recipe_measurement` (`measurement_id`);

ALTER TABLE `recipe_measurement` ADD FOREIGN KEY (`recipe_id`) REFERENCES `recipes` (`recipes_id`);
