-- MySQL dump 10.13  Distrib 5.5.31, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: peer01
-- ------------------------------------------------------
-- Server version	5.5.31-0ubuntu0.12.04.1

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
-- Table structure for table `question_table`
--

DROP TABLE IF EXISTS `question_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question_table` (
  `question` varchar(2000) NOT NULL,
  `answer` varchar(2000) DEFAULT NULL,
  `date` date NOT NULL,
  `subject` varchar(100) NOT NULL,
  `level` varchar(2) DEFAULT NULL,
  `std` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question_table`
--

LOCK TABLES `question_table` WRITE;
/*!40000 ALTER TABLE `question_table` DISABLE KEYS */;
INSERT INTO `question_table` VALUES ('Who is the author of the novel \'The Godfather\'','Mario Puzo','1992-04-15','English','5','12'),('What is the value of \'2+2\'?','4','2003-08-19','Maths','1','6'),('Which gas is exhaled during respiration?','Carbon dioxide','1996-03-25','Science','2','8'),('Who is known as \'The Queen of Crime?','Agatha Christie','1998-12-31','English','4','9');
/*!40000 ALTER TABLE `question_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_info`
--

DROP TABLE IF EXISTS `student_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_info` (
  `roll_number` varchar(10) NOT NULL DEFAULT 'NULL',
  `name` varchar(100) NOT NULL,
  `password` varchar(120) NOT NULL,
  `std` varchar(10) NOT NULL,
  PRIMARY KEY (`roll_number`,`std`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_info`
--

LOCK TABLES `student_info` WRITE;
/*!40000 ALTER TABLE `student_info` DISABLE KEYS */;
INSERT INTO `student_info` VALUES ('1','Sukalyan Bhakat','Sukalyan1','10'),('1','Sukalyan Bhakat','Sukalyan1','12'),('1','Champa','Champa1','vsd'),('10','Narendra','Narendra10','10'),('10_1','Sukalyan Bhakat','Sukalyan1','10'),('11','Chayan Ray','Chayan1','11'),('11','Animesh','Animesh11','9'),('12','Tonic','Tonic12','8'),('14','Supari','Supari14','8'),('15','Koyal','Koyal15','7'),('16','Tooth','Tooth16','7'),('2','Rajat Goyal','Rajat2','12'),('2','Suman Kumari','Suman2','7'),('3','Rajat Goyal','Rajat3','6'),('5','Swami Das','Swami5','9'),('6','tuklal','panji','12'),('7','Chamakta Taara','Chamakta7','10'),('8','Sri Ram','urmila','11'),('8_17','Chaman Kumar','Chaman17','8');
/*!40000 ALTER TABLE `student_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_performance`
--

DROP TABLE IF EXISTS `student_performance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_performance` (
  `roll_number` varchar(10) NOT NULL,
  `subject` varchar(100) NOT NULL,
  `standard` varchar(10) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `questions_attempted` varchar(25) DEFAULT NULL,
  `correct_answers` varchar(25) DEFAULT NULL,
  `marks` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`roll_number`,`subject`,`standard`,`date`,`time`),
  CONSTRAINT `student_performance_ibfk_1` FOREIGN KEY (`roll_number`) REFERENCES `student_info` (`roll_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_performance`
--

LOCK TABLES `student_performance` WRITE;
/*!40000 ALTER TABLE `student_performance` DISABLE KEYS */;
INSERT INTO `student_performance` VALUES ('12','English','11','2014-09-16','14:25:36','45','32','140'),('12','Science','12','2014-05-23','12:14:52','89','74','230');
/*!40000 ALTER TABLE `student_performance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_detail`
--

DROP TABLE IF EXISTS `teacher_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher_detail` (
  `teacher_id` varchar(10) NOT NULL,
  `subject` varchar(100) NOT NULL,
  `std` varchar(10) NOT NULL,
  PRIMARY KEY (`subject`,`std`),
  KEY `teacher_id` (`teacher_id`),
  CONSTRAINT `teacher_detail_ibfk_1` FOREIGN KEY (`teacher_id`) REFERENCES `teacher_login` (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_detail`
--

LOCK TABLES `teacher_detail` WRITE;
/*!40000 ALTER TABLE `teacher_detail` DISABLE KEYS */;
INSERT INTO `teacher_detail` VALUES ('1','English','12'),('1','Hindi','9'),('1','Maths','6'),('1','Science','7'),('1','Science','9'),('10','English','7'),('10','GK','9'),('10','Science','8'),('3','Hindi','7'),('4','English','9'),('5','Maths','9');
/*!40000 ALTER TABLE `teacher_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_login`
--

DROP TABLE IF EXISTS `teacher_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher_login` (
  `teacher_id` varchar(10) NOT NULL DEFAULT 'NULL',
  `teacher_name` varchar(100) NOT NULL,
  `password` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_login`
--

LOCK TABLES `teacher_login` WRITE;
/*!40000 ALTER TABLE `teacher_login` DISABLE KEYS */;
INSERT INTO `teacher_login` VALUES ('1','Shakuntala','shak'),('10','Chandrima Saha','chandu'),('12','Meenakshi','meena'),('2','Nivedita','niv'),('3','Pooja','pooja'),('4','Menaka','men'),('5','Kailash','kal'),('6','Satyam','sati'),('7','Champa','cham');
/*!40000 ALTER TABLE `teacher_login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-01 14:45:26
