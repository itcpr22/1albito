-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.37-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for marmarss
CREATE DATABASE IF NOT EXISTS `marmarss` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `marmarss`;

-- Dumping structure for table marmarss.regtbl
CREATE TABLE IF NOT EXISTS `regtbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Firstname` varchar(50) NOT NULL,
  `Lastname` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `confirmPass` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table marmarss.regtbl: ~0 rows (approximately)
/*!40000 ALTER TABLE `regtbl` DISABLE KEYS */;
INSERT INTO `regtbl` (`id`, `Firstname`, `Lastname`, `Username`, `Password`, `confirmPass`) VALUES
	(1, 'a', 'b', 'c', '8277e0910d750195b448797616e091ad', '0');
/*!40000 ALTER TABLE `regtbl` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
