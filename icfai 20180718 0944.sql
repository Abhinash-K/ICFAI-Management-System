-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.21-MariaDB


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema icfai
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ icfai;
USE icfai;

--
-- Structure for table `icfai`.`m_courses`
--

DROP TABLE IF EXISTS `icfai`.`m_courses`;
CREATE TABLE  `icfai`.`m_courses` (
  `coursecode` smallint(5) NOT NULL AUTO_INCREMENT,
  `coursename` varchar(50) NOT NULL,
  `fee` smallint(6) NOT NULL,
  `duration` smallint(6) NOT NULL,
  PRIMARY KEY (`coursecode`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`m_courses`
--

/*!40000 ALTER TABLE `m_courses` DISABLE KEYS */;
INSERT INTO `icfai`.`m_courses` (`coursecode`,`coursename`,`fee`,`duration`) VALUES 
 (1,'BCA',100,2),
 (2,'MCA',100,3),
 (3,'BBA',100,3);
/*!40000 ALTER TABLE `m_courses` ENABLE KEYS */;


--
-- Structure for table `icfai`.`m_library`
--

DROP TABLE IF EXISTS `icfai`.`m_library`;
CREATE TABLE  `icfai`.`m_library` (
  `bookcode` int(11) NOT NULL AUTO_INCREMENT,
  `bookname` varchar(50) NOT NULL,
  `author` varchar(100) NOT NULL,
  `ibsnnumber` varchar(20) NOT NULL,
  `copies` smallint(6) NOT NULL,
  `available` smallint(6) NOT NULL,
  `entrydate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`bookcode`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`m_library`
--

/*!40000 ALTER TABLE `m_library` DISABLE KEYS */;
INSERT INTO `icfai`.`m_library` (`bookcode`,`bookname`,`author`,`ibsnnumber`,`copies`,`available`,`entrydate`) VALUES 
 (1,'Java','Test','1234',11,11,'2018-07-09 09:36:26'),
 (2,'C++','Test','3214',10,10,'2018-07-12 21:24:07');
/*!40000 ALTER TABLE `m_library` ENABLE KEYS */;


--
-- Structure for table `icfai`.`m_ntc`
--

DROP TABLE IF EXISTS `icfai`.`m_ntc`;
CREATE TABLE  `icfai`.`m_ntc` (
  `serialnumber` smallint(6) NOT NULL AUTO_INCREMENT,
  `ntctitle` varchar(100) NOT NULL,
  `details` text NOT NULL,
  `status` varchar(1) NOT NULL,
  `usercode` int(11) NOT NULL,
  `enable/disable` varchar(1) NOT NULL,
  `entrydate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`serialnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`m_ntc`
--

/*!40000 ALTER TABLE `m_ntc` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_ntc` ENABLE KEYS */;


--
-- Structure for table `icfai`.`m_semister`
--

DROP TABLE IF EXISTS `icfai`.`m_semister`;
CREATE TABLE  `icfai`.`m_semister` (
  `semistercode` smallint(6) NOT NULL AUTO_INCREMENT,
  `semistername` varchar(20) NOT NULL,
  PRIMARY KEY (`semistercode`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`m_semister`
--

/*!40000 ALTER TABLE `m_semister` DISABLE KEYS */;
INSERT INTO `icfai`.`m_semister` (`semistercode`,`semistername`) VALUES 
 (1,'Semister-1'),
 (2,'Semister-2'),
 (3,'Semister-3'),
 (4,'Semister-4'),
 (5,'Semister-5'),
 (6,'Semister-6'),
 (7,'Semister-7'),
 (8,'Semister-8');
/*!40000 ALTER TABLE `m_semister` ENABLE KEYS */;


--
-- Structure for table `icfai`.`m_subjects`
--

DROP TABLE IF EXISTS `icfai`.`m_subjects`;
CREATE TABLE  `icfai`.`m_subjects` (
  `subjectcode` smallint(6) NOT NULL AUTO_INCREMENT,
  `subjectname` varchar(50) NOT NULL,
  PRIMARY KEY (`subjectcode`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`m_subjects`
--

/*!40000 ALTER TABLE `m_subjects` DISABLE KEYS */;
INSERT INTO `icfai`.`m_subjects` (`subjectcode`,`subjectname`) VALUES 
 (1,'Mathematics'),
 (2,'C Programming'),
 (3,'Java'),
 (4,'C++'),
 (5,'Database'),
 (6,'Compiler'),
 (7,'Networking'),
 (8,'OOP');
/*!40000 ALTER TABLE `m_subjects` ENABLE KEYS */;


--
-- Structure for table `icfai`.`mp_coursesubjects`
--

DROP TABLE IF EXISTS `icfai`.`mp_coursesubjects`;
CREATE TABLE  `icfai`.`mp_coursesubjects` (
  `coursecode` smallint(6) NOT NULL,
  `subjectcode` smallint(6) NOT NULL,
  PRIMARY KEY (`coursecode`,`subjectcode`),
  KEY `FK_mp_coursesubject_2` (`subjectcode`),
  CONSTRAINT `FK_mp_coursesubject_1` FOREIGN KEY (`coursecode`) REFERENCES `m_courses` (`coursecode`) ON UPDATE CASCADE,
  CONSTRAINT `FK_mp_coursesubject_2` FOREIGN KEY (`subjectcode`) REFERENCES `m_subjects` (`subjectcode`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`mp_coursesubjects`
--

/*!40000 ALTER TABLE `mp_coursesubjects` DISABLE KEYS */;
INSERT INTO `icfai`.`mp_coursesubjects` (`coursecode`,`subjectcode`) VALUES 
 (1,1),
 (1,2),
 (1,3),
 (1,4),
 (2,5);
/*!40000 ALTER TABLE `mp_coursesubjects` ENABLE KEYS */;


--
-- Structure for table `icfai`.`t_bookissues`
--

DROP TABLE IF EXISTS `icfai`.`t_bookissues`;
CREATE TABLE  `icfai`.`t_bookissues` (
  `usercode` int(11) NOT NULL,
  `bookcode` int(11) NOT NULL,
  `issuedate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `returndate` date DEFAULT NULL,
  `issuestatus` varchar(1) NOT NULL DEFAULT 'I',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`usercode`,`bookcode`,`issuedate`),
  KEY `FK_t_bookissues_2` (`bookcode`),
  CONSTRAINT `FK_t_bookissues_1` FOREIGN KEY (`usercode`) REFERENCES `t_userlogin` (`usercode`) ON UPDATE CASCADE,
  CONSTRAINT `FK_t_bookissues_2` FOREIGN KEY (`bookcode`) REFERENCES `m_library` (`bookcode`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`t_bookissues`
--

/*!40000 ALTER TABLE `t_bookissues` DISABLE KEYS */;
INSERT INTO `icfai`.`t_bookissues` (`usercode`,`bookcode`,`issuedate`,`returndate`,`issuestatus`,`remark`) VALUES 
 (4,1,'2018-07-13 09:38:11',NULL,'R',NULL);
/*!40000 ALTER TABLE `t_bookissues` ENABLE KEYS */;


--
-- Structure for table `icfai`.`t_marks`
--

DROP TABLE IF EXISTS `icfai`.`t_marks`;
CREATE TABLE  `icfai`.`t_marks` (
  `usercode` int(11) NOT NULL,
  `coursecode` smallint(6) NOT NULL,
  `semistercode` smallint(6) NOT NULL,
  `subjectcode` smallint(6) NOT NULL,
  `marks` smallint(3) NOT NULL,
  `entrydate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`usercode`,`semistercode`,`coursecode`,`subjectcode`),
  KEY `FK_t_marks_2` (`coursecode`),
  KEY `FK_t_marks_3` (`semistercode`),
  KEY `FK_t_marks_4` (`subjectcode`),
  CONSTRAINT `FK_t_marks_1` FOREIGN KEY (`usercode`) REFERENCES `t_userlogin` (`usercode`) ON UPDATE CASCADE,
  CONSTRAINT `FK_t_marks_2` FOREIGN KEY (`coursecode`) REFERENCES `m_courses` (`coursecode`) ON UPDATE CASCADE,
  CONSTRAINT `FK_t_marks_3` FOREIGN KEY (`semistercode`) REFERENCES `m_semister` (`semistercode`) ON UPDATE CASCADE,
  CONSTRAINT `FK_t_marks_4` FOREIGN KEY (`subjectcode`) REFERENCES `m_subjects` (`subjectcode`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`t_marks`
--

/*!40000 ALTER TABLE `t_marks` DISABLE KEYS */;
INSERT INTO `icfai`.`t_marks` (`usercode`,`coursecode`,`semistercode`,`subjectcode`,`marks`,`entrydate`) VALUES 
 (4,1,3,1,68,'2018-07-16 10:15:43'),
 (4,1,3,2,70,'2018-07-17 11:28:19');
/*!40000 ALTER TABLE `t_marks` ENABLE KEYS */;


--
-- Structure for table `icfai`.`t_qualification`
--

DROP TABLE IF EXISTS `icfai`.`t_qualification`;
CREATE TABLE  `icfai`.`t_qualification` (
  `usercode` int(11) NOT NULL,
  `qualificationid` varchar(15) NOT NULL,
  `qualificationname` varchar(50) NOT NULL,
  `institute` varchar(50) NOT NULL,
  `passingyear` smallint(4) NOT NULL,
  `percentage` smallint(6) NOT NULL,
  PRIMARY KEY (`qualificationid`),
  KEY `FK_t_qualification_1` (`usercode`),
  CONSTRAINT `FK_t_qualification_1` FOREIGN KEY (`usercode`) REFERENCES `t_userlogin` (`usercode`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`t_qualification`
--

/*!40000 ALTER TABLE `t_qualification` DISABLE KEYS */;
INSERT INTO `icfai`.`t_qualification` (`usercode`,`qualificationid`,`qualificationname`,`institute`,`passingyear`,`percentage`) VALUES 
 (4,'4E0','10th',' KVHV Shillong',2012,70),
 (4,'4E1','12th','KVHV Shillong',2014,70),
 (4,'4E2','Graduation','ICFAI',2019,70);
/*!40000 ALTER TABLE `t_qualification` ENABLE KEYS */;


--
-- Structure for table `icfai`.`t_usercourses`
--

DROP TABLE IF EXISTS `icfai`.`t_usercourses`;
CREATE TABLE  `icfai`.`t_usercourses` (
  `usercode` int(11) NOT NULL,
  `coursecode` smallint(6) NOT NULL,
  `semistercode` smallint(2) NOT NULL,
  `ispresent` varchar(1) NOT NULL,
  `entrydate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`usercode`,`coursecode`,`semistercode`),
  KEY `FK_t_usercourses_2` (`coursecode`),
  KEY `FK_t_usercourses_3` (`semistercode`),
  CONSTRAINT `FK_t_usercourses_1` FOREIGN KEY (`usercode`) REFERENCES `t_userlogin` (`usercode`) ON UPDATE CASCADE,
  CONSTRAINT `FK_t_usercourses_2` FOREIGN KEY (`coursecode`) REFERENCES `m_courses` (`coursecode`) ON UPDATE CASCADE,
  CONSTRAINT `FK_t_usercourses_3` FOREIGN KEY (`semistercode`) REFERENCES `m_semister` (`semistercode`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`t_usercourses`
--

/*!40000 ALTER TABLE `t_usercourses` DISABLE KEYS */;
INSERT INTO `icfai`.`t_usercourses` (`usercode`,`coursecode`,`semistercode`,`ispresent`,`entrydate`) VALUES 
 (4,1,1,'N','2018-07-08 11:55:17'),
 (4,1,2,'N','2018-07-15 10:32:10'),
 (4,1,3,'Y','2018-07-15 10:32:27');
/*!40000 ALTER TABLE `t_usercourses` ENABLE KEYS */;


--
-- Structure for table `icfai`.`t_userlogin`
--

DROP TABLE IF EXISTS `icfai`.`t_userlogin`;
CREATE TABLE  `icfai`.`t_userlogin` (
  `usercode` int(11) NOT NULL,
  `userid` varchar(50) NOT NULL,
  `userpassword` varchar(50) NOT NULL,
  `userfname` varchar(50) NOT NULL,
  `userlname` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(1) NOT NULL,
  `address` varchar(250) NOT NULL,
  `pincode` varchar(6) NOT NULL,
  `mobilenumber` varchar(10) NOT NULL,
  `userstatus` varchar(1) NOT NULL,
  `roles` varchar(1) NOT NULL,
  `rollno` varchar(20) DEFAULT NULL,
  `entrydate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`usercode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `icfai`.`t_userlogin`
--

/*!40000 ALTER TABLE `t_userlogin` DISABLE KEYS */;
INSERT INTO `icfai`.`t_userlogin` (`usercode`,`userid`,`userpassword`,`userfname`,`userlname`,`dob`,`gender`,`address`,`pincode`,`mobilenumber`,`userstatus`,`roles`,`rollno`,`entrydate`) VALUES 
 (1,'admin@gmail.com','a','Administrator','.','2018-06-25','M','sdfsdf','423234','2342342423','Y','A',NULL,'2018-06-24 10:50:13'),
 (2,'yadaphika@gmail.com','yadaphika@123','Yadaphika','War','1996-01-01','F','Icfai Shillong','793003','9422222222','Y','T',NULL,'2018-06-25 09:43:40'),
 (3,'ruby@gmail.com','ruby@123','Ruby','.','1954-01-01','F','Happy valley','793007','9089562536','Y','S',NULL,'2018-07-08 09:47:09'),
 (4,'gaut@gmail.com','gaut@123','Gautam Kumar','Ray','1997-01-09','M','gtc','793007','9089094888','Y','D',NULL,'2018-07-08 11:55:17');
/*!40000 ALTER TABLE `t_userlogin` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
