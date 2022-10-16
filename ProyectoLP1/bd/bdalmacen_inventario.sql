CREATE DATABASE  IF NOT EXISTS `bdalmacen_inventario` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bdalmacen_inventario`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: bdalmacen_inventario
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbldbaja`
--

DROP TABLE IF EXISTS `tbldbaja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbldbaja` (
  `idbaja` int NOT NULL AUTO_INCREMENT,
  `codigopedido` int DEFAULT NULL,
  `fecha_baja` datetime DEFAULT NULL,
  PRIMARY KEY (`idbaja`),
  UNIQUE KEY `idbaja_UNIQUE` (`idbaja`),
  KEY `fkdetalle2_idx` (`codigopedido`),
  CONSTRAINT `fkdetalle2` FOREIGN KEY (`codigopedido`) REFERENCES `tbldetalle` (`codigodetalle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbldbaja`
--

LOCK TABLES `tbldbaja` WRITE;
/*!40000 ALTER TABLE `tbldbaja` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbldbaja` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbldetalle`
--

DROP TABLE IF EXISTS `tbldetalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbldetalle` (
  `codigodetalle` int NOT NULL,
  `cantidad` int DEFAULT NULL,
  `cproducto` int DEFAULT NULL,
  `ctecnico` int DEFAULT NULL,
  PRIMARY KEY (`codigodetalle`),
  KEY `fkdtecnico_idx` (`ctecnico`),
  KEY `fkdproducto_idx` (`cproducto`),
  CONSTRAINT `fkdproducto` FOREIGN KEY (`cproducto`) REFERENCES `tblproducto` (`codigoProducto`),
  CONSTRAINT `fkdtecnico` FOREIGN KEY (`ctecnico`) REFERENCES `tbltecnico` (`codigoTecnico`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbldetalle`
--

LOCK TABLES `tbldetalle` WRITE;
/*!40000 ALTER TABLE `tbldetalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbldetalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbldpedido`
--

DROP TABLE IF EXISTS `tbldpedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbldpedido` (
  `idPedido` int NOT NULL AUTO_INCREMENT,
  `codigoDetalle` int DEFAULT NULL,
  `fecha_ingreso` datetime DEFAULT NULL,
  PRIMARY KEY (`idPedido`),
  UNIQUE KEY `idPedido_UNIQUE` (`idPedido`),
  KEY `fkdetalle1_idx` (`codigoDetalle`),
  CONSTRAINT `fkdetalle1` FOREIGN KEY (`codigoDetalle`) REFERENCES `tbldetalle` (`codigodetalle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbldpedido`
--

LOCK TABLES `tbldpedido` WRITE;
/*!40000 ALTER TABLE `tbldpedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbldpedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbllote`
--

DROP TABLE IF EXISTS `tbllote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbllote` (
  `idlote` int NOT NULL AUTO_INCREMENT,
  `descripción` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idlote`),
  UNIQUE KEY `idlote_UNIQUE` (`idlote`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbllote`
--

LOCK TABLES `tbllote` WRITE;
/*!40000 ALTER TABLE `tbllote` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbllote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblproducto`
--

DROP TABLE IF EXISTS `tblproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblproducto` (
  `codigoProducto` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Marca` varchar(45) DEFAULT NULL,
  `Precio` double DEFAULT NULL,
  `IdProveedor` int DEFAULT NULL,
  `idlote` int DEFAULT NULL,
  PRIMARY KEY (`codigoProducto`),
  UNIQUE KEY `codigoProducto_UNIQUE` (`codigoProducto`),
  KEY `fkproveedor_idx` (`IdProveedor`),
  KEY `fklote_idx` (`idlote`),
  CONSTRAINT `fklote` FOREIGN KEY (`idlote`) REFERENCES `tbllote` (`idlote`),
  CONSTRAINT `fkproveedor` FOREIGN KEY (`IdProveedor`) REFERENCES `tblproveedor` (`IdProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblproducto`
--

LOCK TABLES `tblproducto` WRITE;
/*!40000 ALTER TABLE `tblproducto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblproducto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblproveedor`
--

DROP TABLE IF EXISTS `tblproveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblproveedor` (
  `IdProveedor` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `telefono` char(9) DEFAULT NULL,
  `RUC` char(11) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `direccion` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`IdProveedor`),
  UNIQUE KEY `idtblproveedor_UNIQUE` (`IdProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblproveedor`
--

LOCK TABLES `tblproveedor` WRITE;
/*!40000 ALTER TABLE `tblproveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblproveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbltecnico`
--

DROP TABLE IF EXISTS `tbltecnico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbltecnico` (
  `codigoTecnico` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `telefono` char(9) DEFAULT NULL,
  `DNI` char(8) DEFAULT NULL,
  PRIMARY KEY (`codigoTecnico`),
  UNIQUE KEY `codigoTecnico_UNIQUE` (`codigoTecnico`),
  UNIQUE KEY `DNI_UNIQUE` (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbltecnico`
--

LOCK TABLES `tbltecnico` WRITE;
/*!40000 ALTER TABLE `tbltecnico` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbltecnico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bdalmacen_inventario'
--

--
-- Dumping routines for database 'bdalmacen_inventario'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-13  2:22:30
