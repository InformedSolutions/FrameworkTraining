-- Creating the database

CREATE SCHEMA `familytree` ;

-- Creating the tables

CREATE TABLE `familytree`.`person` (
  `personID` INT NOT NULL,
  `personName` VARCHAR(45) NOT NULL,
  `sex` VARCHAR(45) NOT NULL,
  `dob` DATE NOT NULL,
  `birth_place_id` INT NOT NULL,
  `deathDate` DATE NULL,
  `death_place_id` INT NULL,
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

-- Addition of Information into Databases

INSERT INTO `familytree`.`person` (`personID`, `personName`, `sex`, `dob`, `birthPlaceID`, `deathDate`, `deathPlaceID`, `isMarried`, `hasChildren`) VALUES ('001', 'Bill Walsh', 'Male', '1967/10/10', '010', '2019/08/20', '020', '1', '1');
INSERT INTO `familytree`.`person` (`personID`, `personName`, `sex`, `dob`, `birthPlaceID`, `deathDate`, `deathPlaceID`, `isMarried`, `hasChildren`) VALUES ('002', 'Alice Walsh', 'Female', '1970/06/04', '030', '2010/02/10', '020', '1', '1');
INSERT INTO `familytree`.`person` (`personID`, `personName`, `sex`, `dob`, `birthPlaceID`, `isMarried`, `hasChildren`) VALUES ('003', 'Linda Stevenson', 'Female', '1998/09/01', '040', '1', '0');
INSERT INTO `familytree`.`person` (`personID`, `personName`, `sex`, `dob`, `birthPlaceID`, `isMarried`, `hasChildren`) VALUES ('004', 'Josh Stevenson', 'Male', '1992/02/15', '040', '1', '0');
INSERT INTO `familytree`.`person` (`personID`, `personName`, `sex`, `dob`, `birthPlaceID`, `isMarried`, `hasChildren`) VALUES ('005', 'Simon Walsh', 'Male', '1995/07/13', '040', '0', '0');

INSERT INTO `familytree`.`place` (`placeID`, `placeAddress`, `placePostcode`) VALUES ('010', 'Glasgow', 'PA3 2ST');
INSERT INTO `familytree`.`place` (`placeID`, `placeAddress`, `placePostcode`) VALUES ('020', 'Manchester', 'WA14 4PE');
INSERT INTO `familytree`.`place` (`placeID`, `placeAddress`, `placePostcode`) VALUES ('030', 'London', 'LU2 LPY');
INSERT INTO `familytree`.`place` (`placeID`, `placeAddress`, `placePostcode`) VALUES ('040', 'Hull', 'HU6 7RX');

INSERT INTO `familytree`.`marriage` (`marriageID`, `marriageDate`, `marriagePlaceID`, `husbandID`, `wifeID`) VALUES ('001', '1990/10/02', '030', '001', '002');
INSERT INTO `familytree`.`marriage` (`marriageID`, `marriageDate`, `marriagePlaceID`, `husbandID`, `wifeID`) VALUES ('002', '2020/10/02', '040', '004', '003');

INSERT INTO `familytree`.`children` (`personID`, `motherID`, `fatherID`) VALUES ('003', '002', '001');
INSERT INTO `familytree`.`children` (`personID`, `motherID`, `fatherID`) VALUES ('005', '002', '001');
