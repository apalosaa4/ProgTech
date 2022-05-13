-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2022. Máj 13. 22:38
-- Kiszolgáló verziója: 10.4.11-MariaDB
-- PHP verzió: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `recipes`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `freefrom`
--

CREATE TABLE `freefrom` (
  `freefrom_id` int(11) NOT NULL,
  `freefrom_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `ingredients`
--

CREATE TABLE `ingredients` (
  `ingredients_id` int(11) NOT NULL,
  `ingredients_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `recipes`
--

CREATE TABLE `recipes` (
  `recipes_id` int(11) NOT NULL,
  `recipes_name` varchar(255) DEFAULT NULL,
  `freefrom_name` varchar(255) DEFAULT NULL,
  `recipes_description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `recipe_freefrom`
--

CREATE TABLE `recipe_freefrom` (
  `freefrom_id` int(11) DEFAULT NULL,
  `recipe_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `recipe_ingredients`
--

CREATE TABLE `recipe_ingredients` (
  `recipe_id` int(11) DEFAULT NULL,
  `ingredients_id` int(11) DEFAULT NULL,
  `ingredients_amount` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `freefrom`
--
ALTER TABLE `freefrom`
  ADD PRIMARY KEY (`freefrom_id`);

--
-- A tábla indexei `ingredients`
--
ALTER TABLE `ingredients`
  ADD PRIMARY KEY (`ingredients_id`);

--
-- A tábla indexei `recipes`
--
ALTER TABLE `recipes`
  ADD PRIMARY KEY (`recipes_id`),
  ADD KEY `recipes_id` (`recipes_id`);

--
-- A tábla indexei `recipe_freefrom`
--
ALTER TABLE `recipe_freefrom`
  ADD KEY `recipe_id` (`recipe_id`),
  ADD KEY `freefrom_id` (`freefrom_id`);

--
-- A tábla indexei `recipe_ingredients`
--
ALTER TABLE `recipe_ingredients`
  ADD KEY `recipe_id` (`recipe_id`),
  ADD KEY `Constrait_Ingredients_FK` (`ingredients_id`);

--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `freefrom`
--
ALTER TABLE `freefrom`
  ADD CONSTRAINT `Constrait_Recipe_Freefrom_FK` FOREIGN KEY (`freefrom_id`) REFERENCES `recipe_freefrom` (`freefrom_id`);

--
-- Megkötések a táblához `ingredients`
--
ALTER TABLE `ingredients`
  ADD CONSTRAINT `Constrait_RecipeIngredients_FK` FOREIGN KEY (`ingredients_id`) REFERENCES `recipe_ingredients` (`ingredients_id`);

--
-- Megkötések a táblához `recipe_freefrom`
--
ALTER TABLE `recipe_freefrom`
  ADD CONSTRAINT `recipe_freefrom_ibfk_1` FOREIGN KEY (`recipe_id`) REFERENCES `recipes` (`recipes_id`),
  ADD CONSTRAINT `recipe_freefrom_ibfk_2` FOREIGN KEY (`freefrom_id`) REFERENCES `freefrom` (`freefrom_id`);

--
-- Megkötések a táblához `recipe_ingredients`
--
ALTER TABLE `recipe_ingredients`
  ADD CONSTRAINT `Constrait_Ingredients_FK` FOREIGN KEY (`ingredients_id`) REFERENCES `ingredients` (`ingredients_id`),
  ADD CONSTRAINT `recipe_ingredients_ibfk_2` FOREIGN KEY (`recipe_id`) REFERENCES `recipes` (`recipes_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
