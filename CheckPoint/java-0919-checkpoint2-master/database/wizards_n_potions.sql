CREATE DATABASE  IF NOT EXISTS `wizards_n_potions` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `wizards_n_potions`;
-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: wizards_n_potions
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Restoration'),(2,'Illusion'),(3,'Alteration'),(4,'Conjuration'),(5,'Destruction');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingredient`
--

DROP TABLE IF EXISTS `ingredient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ingredient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingredient`
--

LOCK TABLES `ingredient` WRITE;
/*!40000 ALTER TABLE `ingredient` DISABLE KEYS */;
INSERT INTO `ingredient` VALUES (1,'Sphinx\'s Blood'),(2,'Kobold Gland'),(3,'Angel Tooth'),(4,'Mermaid Scale'),(5,'Pegasus Hair'),(6,'Bone Cabbage'),(7,'Hippogriff Tears'),(8,'Demon Liver'),(9,'Giant\'s Hook'),(10,'Basilisk Scale'),(11,'Gargoyle Dust'),(12,'Cinder Bindweed'),(13,'Medusa Bite'),(14,'Chimera Bittersweet'),(15,'Hellhound Oil'),(16,'Witch\'s Bone Meal'),(17,'Angel Flesh'),(18,'Yeti Fur'),(19,'Giant Eagle Egg'),(20,'Fake Bean'),(21,'Cockatrice Tooth'),(22,'Hydra Claw'),(23,'Fairy Dust'),(24,'Phoenix Spit'),(25,'Vampire Brain'),(26,'Hydra Tongue'),(27,'Harpy Fang'),(28,'Demon Horn'),(29,'Satyr Fat'),(30,'Hellhound Honey'),(31,'Golem Dust'),(32,'Dragon Blood');
/*!40000 ALTER TABLE `ingredient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `potion`
--

DROP TABLE IF EXISTS `potion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `potion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `effect` text NOT NULL,
  `power` int(11) NOT NULL,
  `id_category` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `potion_category_FK` (`id_category`),
  CONSTRAINT `potion_category_FK` FOREIGN KEY (`id_category`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `potion`
--

LOCK TABLES `potion` WRITE;
/*!40000 ALTER TABLE `potion` DISABLE KEYS */;
INSERT INTO `potion` VALUES (1,'A Philter of Demonic Leech','Heals a portion of all damage the user deals. Regular strength with a strong side effect of Trouble breathing. Contained in a A geometric diamond shaped bottle with a label that is A riddle, the lid not opening unless the riddle is solved. The fluid looks Gold with Stripes of color, and tastes like The Forest with a Almost gaseous texture.',5,1),(2,'A Vial of Dead Ringer','Makes the user appear completely dead to all magic. Seemingly permanent with a temporary side effect of Nothing bad at all! Contained in a A large metal bottle with a label of Growing with vines. The fluid looks Purple with Translucency, and tastes like A storm with a Milky texture.',7,2),(3,'A Juice of The Bard','Increases the users preformance temporarily. Poisonous. Almost no positive affect all with a side effect of A sudden horrific accent. Contained in a A translucent beer bottle with a label of A title describing the exact opposite. The fluid looks Pale Green with A soft glow, and tastes like Mayonnaise with a Slimey texture.',1,3),(4,'A Ichor of Gracefulness','Makes the user have a better acrobatics skill. Regular strength with a strong side effect of Weakness. Contained in a A glass syringe with a label that is Water damaged but a just legible label. The fluid looks Green with Translucency, and tastes like The sewers with a Almost solid texture.',3,3),(5,'A Potion of Antidepressant','Does what it says on the tin. Poisonous. Almost no positive affect all with a side effect of Blurred Vision. Contained in a A stone flask with a label that is Covered in glitter. It gets everywhere. The fluid looks Dark Red with Some kind of bone floating in it, and tastes like Magically the most desirable thing to you with a Almost solid texture.',2,1),(6,'A Philter of Flame Resistance','It gives resistance to fire damage. Regular strength with a slight side effect of Bleeding from the eyes. Contained in a An inhaler like spray bottle with a label of A code name. The fluid looks White with Translucency, and tastes like Mud with a Chunky texture.',5,3),(7,'A Elixir of Oracle','Lets the user divine the future. Regular strength with no side effect of Painful lust. Contained in a A capped horn with a label that is A note saying its illegal contraband being confiscated. The fluid looks Green with Stripes of color, and tastes like Fish with a Gritty texture.',6,4),(8,'A Philter of Bless Weapon','Makes the users weapons do more damage. Seemingly permanent with a temporary side effect of Loss of smell. Contained in a A large metal bottle with a label of Brightly glowing letters. The fluid looks Black with A constant heat, and tastes like Rain with a Chunky texture.',4,5),(9,'A Draught of Bowmanship','Makes the user more effective with a bow or ranged weapon. Regular strength with no side effect of Increased libido. Contained in a A bone flask with a label of Its description in orcish The fluid looks Orange with A bright glow, and tastes like Nuts with a Gritty texture.',4,5),(10,'A Juice of Love','Makes the user and someone else fall in love. Poisonous. Almost no positive affect all with a side effect of a Horrifying stench. Contained in a A leather pouch with a label showing Gnomish diagrams for its use. The fluid looks Bronze with Steam coming from it, and tastes like Chocolate with a Airy and bubbly texture.',8,2),(11,'A Vial of Split Form','The user turns into two or three tiny versions of themselves and controls them all. Regular strength with a strong side effect of Laughter. Contained in a A square glass bottle with a label covered in Ornate and beautiful designs. The fluid looks Metallic with Blood within it, and tastes like Minty with a Thick and sludgy texture.',3,4),(12,'A Ichor of Owls Wake','Makes the user need no sleep for a time. Poisonous. Almost no positive affect all with a side effect of A cold. Contained in a A bone flask with a label of A list of possible side effects as long as the bottle is. The fluid looks Dark Grey with Two separating liquid, and tastes like Coffee with a Chunky texture.',2,1),(13,'A Tonic of True form','Turns the user into a familiar like creature similar to their personality. Temporary but strong and wears off quickly with a side effect of Giddiness. Contained in a A capped horn with a label of Its description in Druidic. The fluid looks Red with Steam coming from it, and tastes like Gingerbread with a Thick and sludgy texture.',6,3),(14,'A Philter of Musical Breath','Makes the user say everything in song, and fey music follows them in the air. Temporary but strong and wears off quickly with a side effect of Muteness. Contained in a A small medical vial with a label of Growing with vines. The fluid looks Dark Red with Blood within it, and tastes like Fumes with a Thin and watery texture.',1,2),(15,'A Juice of Feast','Removes all hunger and thirst from the target. Major strength with a small side effect of Summoning imps that want to kill you. Contained in a A small metal vial with a label of Its name and description in invisible ink. The fluid looks Gold with Leaves and flowers in it, and tastes like Cheese with a Oily texture.',3,1),(16,'A Vial of Nymph Breath','Gives water breathing. Regular strength with a strong side effect of Curses. Contained in a A small shot sized bottle with a label of Shamanistic symbols and shavings. The fluid looks Green with Some kind of bone floating in it, and tastes like Death with a Airy and bubbly texture.',4,1),(17,'A Brew of Berserker','Makes the user rage with great strength. Minor strength with a slight side effect of Nothing bad at all! Contained in a A translucent long wine bottle with a label of A cartoony mascot. The fluid looks Yellow with Chunks of metal in it, and tastes like something bad flavored to taste better with a Slimey texture.',7,5),(18,'A Elixir of Gods Touch','Gives the user a holy connection to their god or fiendish deity. Temporary but strong and wears off quickly with a side effect of Need for booze. Contained in a A small metal vial with a label of A heartfelt hate letter for someone. The fluid looks Light grey with Steam coming from it, and tastes like Rotten eggs with a Gritty texture.',9,4),(19,'A Elixir of Dreams','Makes the user get lost in a hallucinatory dream world of their perfect dream. Minor strength with a strong side effect of Puting the user to sleep. Contained in a A geometric diamond shaped bottle with a label of Several different names and descriptions plastered over each other. The fluid looks Clear with A bright glow, and tastes like Cinnamon with a Oily texture.',2,2),(20,'A Draught of Youth','Makes the user grow some years younger. Regular strength with a slight side effect of Weakness to physical damage. Contained in a A capped horn with a label of Its name with a warning about side effects. The fluid looks Black with A cloudy murkiness, and tastes like Bark with a Gritty texture.',8,1);
/*!40000 ALTER TABLE `potion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `potion_ingredient`
--

DROP TABLE IF EXISTS `potion_ingredient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `potion_ingredient` (
  `id_potion` int(11) NOT NULL,
  `id_ingredient` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`id_potion`,`id_ingredient`),
  KEY `potion_ingredient_ingredient_FK` (`id_ingredient`),
  CONSTRAINT `potion_ingredient_ingredient_FK` FOREIGN KEY (`id_ingredient`) REFERENCES `ingredient` (`id`),
  CONSTRAINT `potion_ingredient_potion0_FK` FOREIGN KEY (`id_potion`) REFERENCES `potion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `potion_ingredient`
--

LOCK TABLES `potion_ingredient` WRITE;
/*!40000 ALTER TABLE `potion_ingredient` DISABLE KEYS */;
INSERT INTO `potion_ingredient` VALUES (1,5,8),(2,17,4),(2,18,7),(2,30,5),(3,24,10),(4,1,3),(4,2,4),(4,22,1),(5,7,9),(5,30,5),(6,10,9),(7,15,7),(7,21,8),(8,3,1),(8,21,6),(8,24,10),(9,3,1),(9,11,4),(9,18,2),(9,19,9),(10,12,7),(10,20,2),(10,32,3),(11,9,6),(11,22,8),(11,25,9),(12,10,7),(12,29,3),(13,11,10),(13,17,1),(14,27,6),(15,3,6),(15,10,8),(15,28,6),(16,9,1),(17,1,1),(17,18,8),(18,28,2),(19,12,9),(19,19,7),(19,30,10),(20,8,1),(20,13,5),(20,19,4),(20,27,1);
/*!40000 ALTER TABLE `potion_ingredient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-31 11:52:55
