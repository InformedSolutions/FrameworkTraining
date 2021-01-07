CREATE SCHEMA `familytree` ;

CREATE TABLE `familytree`.`person` (
  `personID` INT NOT NULL,
  `personName` VARCHAR(45) NOT NULL,
  `sex` VARCHAR(45) NOT NULL,
  `dob` DATE NOT NULL,
  `birthPlaceID` INT NOT NULL,
  `deathDate` DATE NULL,
  `deathPlaceID` INT NULL,
  `isMarried` BOOLEAN NOT NULL DEFAULT false,
  `hasChildren` BOOLEAN NOT NULL DEFAULT false,
  PRIMARY KEY (`personID`));

CREATE TABLE `familytree`.`children` (
  `personID` INT NOT NULL,
  `motherID` INT NOT NULL,
  `fatherID` INT NOT NULL,
  PRIMARY KEY (`personID`));

CREATE TABLE `familytree`.`marriage` (
  `marriageID` INT NOT NULL,
  `marriageDate` DATE NOT NULL,
  `marriagePlaceID` INT NOT NULL,
  `husbandID` INT NOT NULL,
  `wifeID` INT NOT NULL,
  PRIMARY KEY (`marriageID`));

CREATE TABLE `familytree`.`place` (
  `placeID` INT NOT NULL,
  `placeAddress` VARCHAR(45) NOT NULL,
  `placePostcode` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`placeID`));
