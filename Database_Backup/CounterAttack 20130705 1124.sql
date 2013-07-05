-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.67-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema bloggers
--

CREATE DATABASE IF NOT EXISTS bloggers;
USE bloggers;

--
-- Definition of table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `name` varchar(20) NOT NULL,
  `password` varchar(20) default NULL,
  `role` varchar(20) default NULL,
  PRIMARY KEY  (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`name`,`password`,`role`) VALUES 
 ('anuraag','anuraag','admin'),
 ('rahulkh','rahulkha','admin'),
 ('ranbeer','khalsaa','admin'),
 ('soumyad','soumyadeep','admin'),
 ('soumyadeep','soumyadeep','admin'),
 ('uddiptkr','kalokalo','admin');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


--
-- Definition of table `uploadarticle`
--

DROP TABLE IF EXISTS `uploadarticle`;
CREATE TABLE `uploadarticle` (
  `artName` varchar(30) NOT NULL,
  `name` varchar(10) default NULL,
  `status` varchar(5) default NULL,
  PRIMARY KEY  (`artName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uploadarticle`
--

/*!40000 ALTER TABLE `uploadarticle` DISABLE KEYS */;
INSERT INTO `uploadarticle` (`artName`,`name`,`status`) VALUES 
 ('baye@admin','anuraag','yes'),
 ('intr@guest','rahulll','yes'),
 ('klop@guest','uddiptkr','no'),
 ('live@guest','uddiptkr','yes'),
 ('stok@guest','uddiptkr','yes'),
 ('tote@admin','anuraag','yes'),
 ('Wind@admin','anuraag','yes');
/*!40000 ALTER TABLE `uploadarticle` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
