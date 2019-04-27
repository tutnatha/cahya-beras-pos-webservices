-- MySQL dump 10.14  Distrib 5.5.56-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: playground
-- ------------------------------------------------------
-- Server version	5.5.56-MariaDB

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
-- Table structure for table `badroom`
--

DROP TABLE IF EXISTS `badroom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `badroom` (
  `no` int(5) NOT NULL,
  `no_kamar` varchar(5) NOT NULL,
  `reg_no` varchar(10) NOT NULL,
  `is_used` char(1) DEFAULT 'N',
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `badroom`
--

LOCK TABLES `badroom` WRITE;
/*!40000 ALTER TABLE `badroom` DISABLE KEYS */;
INSERT INTO `badroom` VALUES (1,'314','314-1','N',NULL,NULL),(2,'314','314-2','N',NULL,NULL),(3,'318','318-3','N',NULL,NULL),(4,'320','320-1','N',NULL,NULL),(5,'320','320-2','N',NULL,NULL),(6,'324','324-1','N',NULL,NULL),(7,'316','316-1','N',NULL,NULL),(8,'316','316-2','N',NULL,NULL),(111,'666','778','Y','2017-10-11 16:00:00','2017-11-11 16:00:00'),(666,'666','778','Y','2017-10-11 16:00:00','2017-11-11 16:00:00');
/*!40000 ALTER TABLE `badroom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  `topic_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'kursus satu','keterangan...','nomor topik'),(2,'kursus dua','keterangan...dua','nomor topik 2'),(3,'kursus tiga','keterangan...tiga','nomor topik 3');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daftarhunian_dtl`
--

DROP TABLE IF EXISTS `daftarhunian_dtl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daftarhunian_dtl` (
  `no_trx` int(9) NOT NULL,
  `seq_no` int(9) NOT NULL DEFAULT '0',
  `no_kamar` varchar(5) NOT NULL DEFAULT '',
  `kamar_no` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`no_trx`,`no_kamar`),
  KEY `FK970lr8ido2llamavgvo8o2qw1` (`no_kamar`),
  CONSTRAINT `fk2_daftarhunian_dtl` FOREIGN KEY (`no_kamar`) REFERENCES `kamar` (`no`),
  CONSTRAINT `FK92swesrc6ypyj1t1f1idrrds0` FOREIGN KEY (`no_trx`) REFERENCES `daftarhunian_hdr` (`no_trx`),
  CONSTRAINT `FK970lr8ido2llamavgvo8o2qw1` FOREIGN KEY (`no_kamar`) REFERENCES `kamar` (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daftarhunian_dtl`
--

LOCK TABLES `daftarhunian_dtl` WRITE;
/*!40000 ALTER TABLE `daftarhunian_dtl` DISABLE KEYS */;
INSERT INTO `daftarhunian_dtl` VALUES (1,1,'314','314'),(1,2,'316','316'),(2,1,'244','323'),(2,1,'414',NULL),(3,1,'319',NULL),(3,1,'323','323'),(3,1,'414',NULL),(4,1,'323','323'),(5,1,'323','323'),(6,1,'323','323'),(7,1,'323','323'),(8,1,'323','323'),(9,0,'244',NULL),(9,0,'264',NULL),(9,0,'314',NULL),(9,1,'323','323'),(9,0,'351',NULL),(9,0,'414',NULL),(10,1,'323','323'),(11,1,'323','323'),(12,2,'244','244'),(12,1,'264',NULL),(12,1,'320',NULL),(12,3,'900','323'),(13,1,'323','323'),(14,1,'323','323'),(15,1,'323','323'),(16,1,'323','323'),(16,0,'351','351'),(17,1,'323','323'),(18,1,'323','323'),(19,1,'323','323'),(20,1,'323','323'),(21,1,'323','323'),(22,1,'323','323'),(23,1,'323','323'),(24,1,'323','323'),(25,1,'323','323'),(26,1,'323','323'),(27,1,'323','323'),(28,1,'323','323'),(29,1,'323','323'),(30,1,'323','323'),(31,1,'323','323'),(32,1,'323','323'),(33,1,'323','323'),(34,1,'323','323'),(35,1,'323','323'),(36,1,'321','323'),(77,0,'244',NULL),(77,0,'264',NULL),(77,0,'313',NULL),(87,0,'244',NULL),(87,0,'264',NULL),(114,0,'313',NULL),(114,0,'351',NULL),(114,0,'900',NULL),(114,0,'B01',NULL),(114,0,'K14',NULL),(114,0,'trg01',NULL);
/*!40000 ALTER TABLE `daftarhunian_dtl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daftarhunian_hdr`
--

DROP TABLE IF EXISTS `daftarhunian_hdr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daftarhunian_hdr` (
  `no_trx` int(9) NOT NULL AUTO_INCREMENT,
  `penyelenggara` varchar(10) NOT NULL,
  `tgl_mulai` date DEFAULT NULL,
  `tgl_selesai` date DEFAULT NULL,
  `jml_peserta` int(9) DEFAULT NULL,
  `sudah_selesai` char(1) DEFAULT 'N',
  `kode_kegiatan` int(11) NOT NULL,
  PRIMARY KEY (`no_trx`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daftarhunian_hdr`
--

LOCK TABLES `daftarhunian_hdr` WRITE;
/*!40000 ALTER TABLE `daftarhunian_hdr` DISABLE KEYS */;
INSERT INTO `daftarhunian_hdr` VALUES (1,'Umum','2018-11-10','2018-11-10',100,'N',1),(2,'Dinas Pend','2018-11-10','2018-11-10',100,'N',2),(3,'123','3017-10-08','2019-07-08',123,'N',123),(4,'123','3017-10-08','2019-07-08',123,'N',123),(5,'801','2017-11-10','2018-12-10',12,'Y',123),(6,'volvo 960','2018-02-16','2018-02-28',700,'N',212),(7,'volvo 960','2018-02-16','2018-02-28',700,'N',212),(8,'volvo 960','2018-02-16','2018-02-28',700,'N',212),(9,'volvo 960','2018-02-16','2018-02-28',700,'N',212),(10,'Valio 120','2018-02-01','2018-02-04',501,'N',234),(11,'LPMP Bali','2018-02-01','2018-02-04',230,'N',666),(12,'Binbin','2018-02-01','2018-02-04',234,'N',555),(13,'test','2018-02-17','2018-02-18',6,'N',2),(14,'test','2018-02-17','2018-02-18',6,'N',2),(15,'1234567890','2018-02-01','2018-02-02',80,'N',234),(16,'1234567890','2018-02-01','2018-02-04',20,'N',678),(17,'1234567890','2018-02-17','2018-02-17',80,'N',123),(18,'1234567890','2018-02-17','2018-02-17',80,'N',123),(19,'ketut','2018-02-24','2018-02-28',777,'N',222),(20,'Internal','2018-03-05','2018-03-05',0,'N',0),(21,'Internal','2018-03-05','2018-03-05',0,'N',0),(22,'Internal','2018-03-05','2018-03-05',0,'N',0),(23,'Internal','2018-03-05','2018-03-05',0,'N',4),(24,'Umum','2018-03-05','2018-03-05',0,'N',1),(25,'Umum','2018-03-05','2018-03-05',0,'N',1),(26,'Umum','2018-03-05','2018-03-05',0,'N',1),(27,'Umum','2018-03-05','2018-03-05',202,'N',1),(28,'Umum','2018-03-05','2018-03-05',212,'N',1),(29,'Umum','2018-03-06','2018-03-06',0,'N',4),(30,'Internal','2018-03-06','2018-03-06',888,'N',4),(31,'Internal','2018-03-06','2018-03-06',888,'N',4),(32,'Internal','2018-03-06','2018-03-06',888,'N',4),(33,'Internal','2018-03-06','2018-03-06',888,'N',4),(34,'Internal','2018-03-06','2018-03-06',888,'N',4),(35,'Internal','2018-03-06','2018-03-06',888,'N',4),(36,'Umum','2018-03-06','2018-03-06',0,'N',4),(37,'Internal','2018-04-23','2018-04-24',0,'N',4),(38,'Internal','2018-04-23','2018-04-24',0,'N',4),(39,'Umum','2018-05-03','2018-05-04',99,'N',4),(40,'Umum','2018-05-03','2018-05-04',99,'N',4),(41,'Umum','2018-05-11','2018-05-11',0,'N',4),(42,'Umum','2018-05-11','2018-05-11',0,'N',4),(43,'Umum','2018-05-11','2018-05-11',0,'N',4),(44,'Umum','2018-05-11','2018-05-11',0,'N',4),(45,'Umum','2018-05-11','2018-05-11',0,'N',4),(46,'Umum','2018-05-11','2018-05-11',0,'N',4),(47,'Umum','2018-05-11','2018-05-11',0,'N',4),(48,'Umum','2018-05-11','2018-05-11',0,'N',4),(49,'Umum','2018-05-11','2018-05-11',0,'N',4),(50,'Umum','2018-05-11','2018-05-11',0,'N',4),(51,'Umum','2018-05-11','2018-05-11',0,'N',4),(52,'Umum','2018-05-11','2018-05-11',0,'N',4),(53,'Umum','2018-05-11','2018-05-11',0,'N',4),(54,'Umum','2018-05-11','2018-05-11',0,'N',4),(55,'Umum','2018-05-11','2018-05-11',0,'N',4),(56,'Umum','2018-05-11','2018-05-11',0,'N',4),(57,'Umum','2018-05-11','2018-05-11',0,'N',4),(58,'Umum','2018-05-12','2018-05-12',0,'N',4),(59,'Umum','2018-05-12','2018-05-12',0,'N',4),(60,'Umum','2018-05-12','2018-05-12',0,'N',4),(61,'Umum','2018-05-12','2018-05-12',0,'N',4),(62,'123','2017-10-08','2019-07-08',0,'N',4),(63,'123','2017-10-08','2019-07-08',0,'N',4),(64,'Internal','2018-05-15','2018-05-15',0,'N',4),(65,'Umum','2018-05-15','2018-05-15',0,'N',4),(66,'Umum','2018-05-15','2018-05-15',0,'N',4),(67,'Umum','2018-05-15','2018-05-15',0,'N',4),(68,'Umum','2018-05-15','2018-05-15',0,'N',4),(69,'Umum','2018-05-15','2018-05-15',0,'N',4),(70,'Umum','2018-08-03','2018-08-04',10,'N',4),(71,'Umum','2018-08-03','2018-08-04',10,'N',4),(72,'Umum','2018-08-03','2018-08-04',10,'N',4),(73,'Umum','2018-08-03','2018-08-04',10,'N',4),(74,'Umum','2018-08-03','2018-08-04',10,'N',4),(75,'Umum','2018-08-03','2018-08-04',10,'N',4),(76,'Umum','2018-08-03','2018-08-04',10,'N',4),(77,'Internal','2018-08-04','2018-08-05',9,'N',4),(78,'Internal','2018-08-04','2018-08-05',9,'N',4),(79,'Internal','2018-08-04','2018-08-05',9,'N',4),(80,'Internal','2018-08-31','2018-08-31',0,'N',4),(81,'Internal','2018-08-31','2018-08-31',0,'N',4),(82,'Internal','2018-08-31','2018-08-31',96,'N',4),(83,'Internal','2018-08-31','2018-08-31',96,'N',4),(84,'Internal','2018-08-31','2018-08-31',96,'N',4),(85,'Internal','2018-08-31','2018-08-31',96,'N',4),(86,'Internal','2018-08-31','2018-08-31',96,'N',4),(87,'Internal','2018-08-31','2018-08-31',212,'N',4),(88,'Internal','2018-08-31','2018-08-31',212,'N',4),(89,'Internal','2018-08-31','2018-08-31',212,'N',4),(90,'Internal','2018-08-31','2018-08-31',212,'N',4),(91,'Internal','2018-08-31','2018-09-02',0,'N',4),(92,'Internal','2018-08-31','2018-09-02',30,'N',4),(93,'Internal','2018-08-31','2018-09-02',96,'N',4),(94,'Internal','2018-08-31','2018-09-02',96,'N',4),(95,'Internal','2018-08-31','2018-09-02',96,'N',4),(96,'Internal','2018-08-31','2018-09-02',96,'N',4),(97,'Internal','2018-08-31','2018-09-02',96,'N',4),(98,'Internal','2018-08-31','2018-09-02',96,'N',4),(99,'Internal','2018-08-31','2018-09-02',96,'N',4),(100,'Internal','2018-08-31','2018-09-02',96,'N',4),(101,'Internal','2018-08-31','2018-09-02',96,'N',4),(102,'Internal','2018-08-31','2018-09-02',96,'N',4),(103,'Internal','2018-08-31','2018-09-02',96,'N',4),(104,'Internal','2018-08-31','2018-09-02',96,'N',4),(105,'Internal','2018-08-31','2018-09-02',96,'N',4),(106,'Internal','2018-08-31','2018-09-02',96,'N',4),(107,'Internal','2018-08-31','2018-09-02',96,'N',4),(108,'Internal','2018-08-31','2018-09-02',96,'N',4),(109,'Internal','2018-08-31','2018-09-02',96,'N',4),(110,'Internal','2018-08-31','2018-09-02',96,'N',4),(111,'Internal','2018-08-31','2018-09-02',96,'N',4),(112,'Internal','2018-08-31','2018-09-02',789,'N',4),(113,'RBA','2018-09-06','2018-09-06',123,'N',4),(114,'Internal','2018-09-06','2018-09-06',7410,'N',4),(115,'','2018-10-15','2018-10-15',0,'N',4),(116,'Umum','2018-01-01','2018-01-01',100,'N',4);
/*!40000 ALTER TABLE `daftarhunian_hdr` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daftarhunianbad`
--

DROP TABLE IF EXISTS `daftarhunianbad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daftarhunianbad` (
  `no_trx` int(9) NOT NULL,
  `seq_no` int(9) NOT NULL,
  `no_kamar` int(5) NOT NULL,
  `nip` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daftarhunianbad`
--

LOCK TABLES `daftarhunianbad` WRITE;
/*!40000 ALTER TABLE `daftarhunianbad` DISABLE KEYS */;
INSERT INTO `daftarhunianbad` VALUES (1,1,314,'1034567892'),(1,1,314,'1234567890'),(1,1,316,'1024567893'),(1,2,316,'1034567892');
/*!40000 ALTER TABLE `daftarhunianbad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kamar`
--

DROP TABLE IF EXISTS `kamar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kamar` (
  `no` varchar(5) NOT NULL,
  `lantai` int(5) NOT NULL,
  `jml_tt` int(5) NOT NULL,
  `url_picture` varchar(255) DEFAULT NULL,
  `satuan_tarif` varchar(1) DEFAULT NULL,
  `tarif` decimal(12,0) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kamar`
--

LOCK TABLES `kamar` WRITE;
/*!40000 ALTER TABLE `kamar` DISABLE KEYS */;
INSERT INTO `kamar` VALUES ('244',2,2,'www.lpmp-prov-bali.com',NULL,NULL),('264',21,21,'www.lpmp-prov-bali.com',NULL,NULL),('313',2,2,NULL,NULL,NULL),('314',2,2,NULL,NULL,NULL),('315',2,2,NULL,NULL,NULL),('316',2,2,NULL,NULL,NULL),('317',2,2,NULL,NULL,NULL),('318',2,2,NULL,NULL,NULL),('319',2,2,NULL,NULL,NULL),('320',2,2,NULL,NULL,NULL),('321',2,2,NULL,NULL,NULL),('322',2,2,NULL,NULL,NULL),('323',2,2,NULL,NULL,NULL),('351',3,4,'test',NULL,NULL),('414',4,40,'4.com',NULL,NULL),('900',9,9,'sembilan',NULL,NULL),('B01',8,80,'www.balai-timur.org',NULL,NULL),('K14',9,14,'www.trg-02.com',NULL,NULL),('trg01',1,1,'www.trg-01.com',NULL,NULL),('trg02',2,20,'www.trg-02.com',NULL,NULL),('trg18',18,18,'www.tgr-18.com',NULL,NULL),('xc60',6,10,'www.xc60.com/bali',NULL,NULL),('xc90',61,102,'www.xc90.com/bali',NULL,NULL);
/*!40000 ALTER TABLE `kamar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kegiatan`
--

DROP TABLE IF EXISTS `kegiatan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kegiatan` (
  `kode` int(11) NOT NULL AUTO_INCREMENT,
  `nama_kegiatan` varchar(45) NOT NULL,
  `keterangan` varchar(90) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kegiatan`
--

LOCK TABLES `kegiatan` WRITE;
/*!40000 ALTER TABLE `kegiatan` DISABLE KEYS */;
INSERT INTO `kegiatan` VALUES (1,'Pelatihan Quality Kontrol Diknas','*123#','Pelatihan Quality Kontrol Diknas'),(2,'Pelatihan Trainer Parenting','*','http://stacktips.com/wp-content/uploads/2016/08/Download-Smart-Dashboard-Extras-Wordpress-Plugin-145x100.png'),(3,'Pelatihan Simulasi Alat2 Pendidikan','*','http://stacktips.com/wp-content/uploads/2016/08/Smart-Dashboard-Admin-Settings-145x100.png'),(4,'Pelatihan Antisipasi Bencana Pendidikan','*','http://stacktips.com/wp-content/uploads/2016/08/Smart-Dashboard-Customizations-145x100.png'),(5,'Seminar Terpadu Kemajuan Pendidikan','*','http://stacktips.com/wp-content/uploads/2016/08/Smart-Dashboard-Extras-Wordpress-Plugin.jpeg'),(6,'sati','dua','tiga'),(7,'qwrtyy','like','eeryy.com'),(8,'qwrtyy','like','eeryy.com'),(9,'qwrtyy','like','eeryy.com'),(10,'nasduk','masak nasi uduk','www.nasduk.com'),(11,'namaKegiatan','omasak kelor','123 lets g'),(12,'Login FB 12','test 12','Login FB 12'),(13,'Delete Friend 01','test delete','Delete Friend 01');
/*!40000 ALTER TABLE `kegiatan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kenaikan_gaji_berkala`
--

DROP TABLE IF EXISTS `kenaikan_gaji_berkala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kenaikan_gaji_berkala` (
  `thn` int(4) NOT NULL,
  `keterangan` varchar(20) NOT NULL,
  `nip` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`thn`,`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kenaikan_gaji_berkala`
--

LOCK TABLES `kenaikan_gaji_berkala` WRITE;
/*!40000 ALTER TABLE `kenaikan_gaji_berkala` DISABLE KEYS */;
/*!40000 ALTER TABLE `kenaikan_gaji_berkala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kenaikan_pangkat`
--

DROP TABLE IF EXISTS `kenaikan_pangkat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kenaikan_pangkat` (
  `nip` varchar(30) NOT NULL,
  `thn` int(4) NOT NULL DEFAULT '0',
  `keterangan` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`nip`,`thn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kenaikan_pangkat`
--

LOCK TABLES `kenaikan_pangkat` WRITE;
/*!40000 ALTER TABLE `kenaikan_pangkat` DISABLE KEYS */;
/*!40000 ALTER TABLE `kenaikan_pangkat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lokasi_surat`
--

DROP TABLE IF EXISTS `lokasi_surat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lokasi_surat` (
  `kode_lokasi` varchar(5) NOT NULL,
  `nama_lokasi` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode_lokasi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lokasi_surat`
--

LOCK TABLES `lokasi_surat` WRITE;
/*!40000 ALTER TABLE `lokasi_surat` DISABLE KEYS */;
INSERT INTO `lokasi_surat` VALUES ('Dps','Denpasar');
/*!40000 ALTER TABLE `lokasi_surat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lokasi_tujuan`
--

DROP TABLE IF EXISTS `lokasi_tujuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lokasi_tujuan` (
  `kode` varchar(20) NOT NULL,
  `nama_lokasi` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lokasi_tujuan`
--

LOCK TABLES `lokasi_tujuan` WRITE;
/*!40000 ALTER TABLE `lokasi_tujuan` DISABLE KEYS */;
INSERT INTO `lokasi_tujuan` VALUES ('SDN1GYR-GYR','SD N 1 GIANYAR'),('SDN1PDKGD-TBN','SD N 1 PANDEK GDE TBN'),('SDN3BRN-GYR','SD N 3 BURUAN GIANYAR'),('SDN4MNKY-GYR','SD N 4 MANUKAYA GIANYAR');
/*!40000 ALTER TABLE `lokasi_tujuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pegawai`
--

DROP TABLE IF EXISTS `pegawai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pegawai` (
  `nip` varchar(30) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tempat_lahir` varchar(90) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `pangkat` varchar(50) NOT NULL,
  `golongan_ruang` varchar(10) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `pangkat_tmt` date NOT NULL,
  `thn_mkg` int(4) NOT NULL,
  `bln_mkg` int(2) NOT NULL,
  `thn_gol_gaji` int(4) NOT NULL,
  `thn_seluruh` int(4) NOT NULL,
  `bln_seluruh` int(2) NOT NULL,
  `tmt_pangkat_pertama` date NOT NULL,
  `gol_pangkat_pertama` varchar(10) NOT NULL,
  `thn_pangkat_pertama` int(5) NOT NULL,
  `bln_pangkat_pertama` int(2) NOT NULL,
  `thn_pensiun` int(4) NOT NULL,
  `jenjang_pendidikan` varchar(50) NOT NULL,
  `jurusan_pendidikan` varchar(50) NOT NULL,
  `bln_gol_gaji` int(2) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pegawai`
--

LOCK TABLES `pegawai` WRITE;
/*!40000 ALTER TABLE `pegawai` DISABLE KEYS */;
INSERT INTO `pegawai` VALUES ('19580611 198203 1 014','Drs. Pande Putu Karyana, M.Pd','Gianyar','1958-06-11','Pembina Utama Muda','IV b','Widyaiswara Madya','2012-04-01',28,1,33,38,6,'1982-03-01','II.b',3,0,2018,'S2','Pendidikan Dasar',6,NULL),('19620824 198304 2 013','Ni Wayan Murki, S.Pd., M.M','Badung','1962-08-24','Pembina Utama Muda','IV c','Widyaiswara Madya','2016-04-01',30,0,31,34,5,'1983-04-01','II.a',0,0,2022,'S2','Manajamen Sumber Daya Manusia',5,NULL),('19700628 199702 2 003','Dr. Ni Made Suciani, M.Pd.','Denpasar','1970-06-28','Pembina Utama Muda','IV c','Widyaiswara Madya','2015-10-01',18,8,20,20,7,'1997-02-01','III.a',0,0,2030,'S3','Kajian Budaya',0,NULL),('19710521 199702 1 004','Dr. I Wayan Surata, S.Pd., M.Pd.','Tabanan','1971-05-21','Pembina Utama Muda','IV c','Widyaiswara Madya','2016-04-01',19,2,20,20,7,'1997-02-01','III.a',0,0,2031,'S3','Penelitian dan Evaluasi Pendidikan',7,NULL),('19741225 200312 1 004','I Made Alit Dwitama, ST., M.Pd.','Denpasar','1974-12-25','Penata Tk.I','III d','Kasi SI','2016-04-01',12,4,13,9,13,'0000-00-00','2003-01-12',0,0,0,'S2','Magister Pendidikan',9,NULL);
/*!40000 ALTER TABLE `pegawai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penyelenggara`
--

DROP TABLE IF EXISTS `penyelenggara`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `penyelenggara` (
  `kode` varchar(10) NOT NULL,
  `nama_instansi` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penyelenggara`
--

LOCK TABLES `penyelenggara` WRITE;
/*!40000 ALTER TABLE `penyelenggara` DISABLE KEYS */;
INSERT INTO `penyelenggara` VALUES ('Internal','Instansi Internal'),('RBA','Rumah Boga Amiek'),('Umum','Umum Sekali');
/*!40000 ALTER TABLE `penyelenggara` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `surat_tugas`
--

DROP TABLE IF EXISTS `surat_tugas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `surat_tugas` (
  `nomor_surat` varchar(30) NOT NULL,
  `isi_surat` varchar(255) NOT NULL,
  `nip_pemberi_tugas` varchar(30) DEFAULT NULL,
  `txt_hdr` varchar(255) DEFAULT NULL,
  `txt_penutup` varchar(255) DEFAULT NULL,
  `url_logo_hdr1` varchar(255) DEFAULT NULL,
  `url_logo_hdr2` varchar(255) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `created_location` varchar(50) DEFAULT NULL,
  `template_model` int(1) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_location` varchar(255) DEFAULT NULL,
  `template_modul` int(11) NOT NULL,
  PRIMARY KEY (`nomor_surat`),
  KEY `FK1qhjhgsp2hbhsqakql2175k2` (`created_location`),
  KEY `FKmyk3pp7qmrq0hamd30888ell5` (`nip_pemberi_tugas`),
  CONSTRAINT `FK1qhjhgsp2hbhsqakql2175k2` FOREIGN KEY (`created_location`) REFERENCES `lokasi_surat` (`kode_lokasi`),
  CONSTRAINT `fk1_surat_tugas` FOREIGN KEY (`nip_pemberi_tugas`) REFERENCES `pegawai` (`nip`),
  CONSTRAINT `FKmyk3pp7qmrq0hamd30888ell5` FOREIGN KEY (`nip_pemberi_tugas`) REFERENCES `pegawai` (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `surat_tugas`
--

LOCK TABLES `surat_tugas` WRITE;
/*!40000 ALTER TABLE `surat_tugas` DISABLE KEYS */;
INSERT INTO `surat_tugas` VALUES ('832/D7.16/KP/2017','Untuk memantau kegiatan Pendampingan SPMI Sekolah Model, pada tgl dan tempat sbb:','19580611 198203 1 014','Yg bertt dibawah ini memberikan tugas kpd :','Demikian surat tugas ini dibuat utk dilaksanakan dgn penuh tanggung jawab.','','','2017-08-28','Dps',1,NULL,NULL,0),('838/D7.16/KP/2017','Untuk memantau kegiatan Pendampingan Sistim Penjaminan Mutu Internal (SMPI) Sekolah Model. Seluruh biaya perjalanan dinas ini ditanggung sepenuhnya melalui DIPA LPMP Bali. Demikian surat tugas ini dibuat untuk dilaksanakan dengan penuh tanggung jawab.','19620824 198304 2 013','Yang bertanda tangan di bawah ini memberikan tugas kepada :','Demikian surat tugas ini dibuat untuk dilaksanakan dengan penuh tanggung jawab.',NULL,NULL,'2017-08-30','Dps',0,NULL,NULL,0);
/*!40000 ALTER TABLE `surat_tugas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `surat_tugas_dtl`
--

DROP TABLE IF EXISTS `surat_tugas_dtl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `surat_tugas_dtl` (
  `nomor_surat` varchar(30) NOT NULL,
  `nomor_urut` int(2) NOT NULL,
  `nip` varchar(30) NOT NULL,
  `tujuan_sekolah` varchar(30) NOT NULL,
  `tgl_pemantauan` date NOT NULL,
  `is_valid` varchar(1) NOT NULL,
  PRIMARY KEY (`nomor_surat`,`nip`,`tgl_pemantauan`),
  KEY `FK2aimd2su9nmg28ef8excyygvu` (`tujuan_sekolah`),
  KEY `FK4hn8tlpt1ghtv2o5brydl1182` (`nip`),
  CONSTRAINT `fk1_surat_tugas_dtl` FOREIGN KEY (`nomor_surat`) REFERENCES `surat_tugas` (`nomor_surat`),
  CONSTRAINT `FK2aimd2su9nmg28ef8excyygvu` FOREIGN KEY (`tujuan_sekolah`) REFERENCES `lokasi_tujuan` (`kode`),
  CONSTRAINT `fk2_surat_tugas` FOREIGN KEY (`nip`) REFERENCES `pegawai` (`nip`),
  CONSTRAINT `fk3_surat_tugas_dtl` FOREIGN KEY (`tujuan_sekolah`) REFERENCES `lokasi_tujuan` (`kode`),
  CONSTRAINT `FK4hn8tlpt1ghtv2o5brydl1182` FOREIGN KEY (`nip`) REFERENCES `pegawai` (`nip`),
  CONSTRAINT `FKn6n5j81wbfcilg8atavf6nuil` FOREIGN KEY (`nomor_surat`) REFERENCES `surat_tugas` (`nomor_surat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `surat_tugas_dtl`
--

LOCK TABLES `surat_tugas_dtl` WRITE;
/*!40000 ALTER TABLE `surat_tugas_dtl` DISABLE KEYS */;
INSERT INTO `surat_tugas_dtl` VALUES ('832/D7.16/KP/2017',1,'19580611 198203 1 014','SDN1GYR-GYR','2017-12-30','Y');
/*!40000 ALTER TABLE `surat_tugas_dtl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `full_name` varchar(100) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('mukesh','$2a$10$N0eqNiuikWCy9ETQ1rdau.XEELcyEO7kukkfoiNISk/9F7gw6eB0W','Mukesh Sharma','ROLE_ADMIN','India',1),('tarun','$2a$10$QifQnP.XqXDW0Lc4hSqEg.GhTqZHoN2Y52/hoWr4I5ePxK7D2Pi8q','Tarun Singh','ROLE_USER','India',1),('user','user','development user','ROLE_USER','indonesia',1),('user2','user','LPMP User','ROLE_ADMIN','Indonesia',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-09 17:09:02
